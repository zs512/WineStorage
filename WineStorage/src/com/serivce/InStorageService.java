package com.serivce;

import com.dao.ComInStorageDAO;
import com.dao.ComItemDAO;
import com.dao.ComUserDAO;
import com.domain.ComInStorage;
import com.domain.ComItem;
import com.domain.ComUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ruanqx on 2015/6/20.
 */
public class InStorageService extends PublicService{
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComInStorageDAO comInStorageDAO = (ComInStorageDAO)applicationContext.getBean("ComInStorageDAO");

    private boolean checkBeforeAdd(ComInStorage comInStorage){
        return (comInStorage != null &&
                checkItemIsExistent(comInStorage.getComItem().getId()) &&
                checkCountIsOk(comInStorage.getCount()) &&
                checkSupplyPlaceIsOk(comInStorage.getSupplyPlace()) &&
                checkAgent(comInStorage.getAgent()) &&
                checkKeyboarderIsOk(comInStorage.getComUserByKeyboarder().getId()) &&
                checkRemark(comInStorage.getRemark()));
    }

    private boolean checkBeforeDel(String comInStorageId){
        if(comInStorageId == null) return false;
        return checkInStorageIsExistent(comInStorageId);
    }

    private boolean checkBeforeEdit(ComInStorage comInStorage){
        if(comInStorage == null || comInStorage.getId() == null) return false;
        ComInStorage inStorageTmp = comInStorageDAO.findById(comInStorage.getId());

        return (inStorageTmp != null &&
                inStorageTmp.getId() != null &&
                !inStorageTmp.getStatus().equals(2) &&
                checkItemIsExistent(comInStorage.getComItem().getId()) &&
                checkCountIsOk(comInStorage.getCount()) &&
                checkSupplyPlaceIsOk(comInStorage.getSupplyPlace()) &&
                checkAgent(comInStorage.getAgent()) &&
                checkKeyboarderIsOk(comInStorage.getComUserByKeyboarder().getId()) &&
                checkRemark(comInStorage.getRemark()));
    }

    private boolean checkInStorageIsExistent(String id) {
        if(id == null) return false;
        ComInStorage comInStorage = comInStorageDAO.findById(id);
        return (comInStorage != null && comInStorage.getId() != null);
    }

    private boolean checkRemark(String remark) {
        return checkStringSizeIsOk(remark, 0, 500);
    }

    private boolean checkKeyboarderIsOk(String id) {
        if(id == null) return false;
        ComUserDAO comUserDAO = (ComUserDAO)applicationContext.getBean("ComUserDAO");
        ComUser comUser = comUserDAO.findById(id);
        return (comUser != null && comUser.getId() != null);
    }

    private boolean checkAgent(String agent) {
        return checkStringSizeIsOk(agent, 1, 50);
    }

    private boolean checkSupplyPlaceIsOk(String supplyPlace) {
        return checkStringSizeIsOk(supplyPlace, 1, 500);
    }

    private boolean checkCountIsOk(Integer count) {
        return count >= 0;
    }

    private boolean checkItemIsExistent(String id) {
        if(id == null) return false;
        ComItemDAO comItemDAO = (ComItemDAO)applicationContext.getBean("ComItemDAO");
        ComItem comItem = comItemDAO.findById(id);
        return (comItem != null && comItem.getId() != null);
    }

    /*---------------------------------------------------------*/
    public boolean addInStorage(ComInStorage comInStorage){
        if(checkBeforeAdd(comInStorage)){
            comInStorage.setStatus(0);
            comInStorage.setNatureStatus(0);
            comInStorageDAO.save(comInStorage);
            return true;
        }else{
            return false;
        }
    }

    public boolean delInStorage(String id){
        if(checkBeforeDel(id)){
            ComInStorage comInStorage = comInStorageDAO.findById(id);
            comInStorage.setNatureStatus(1);
            comInStorageDAO.attachDirty(comInStorage);
            return true;
        }else{
            return false;
        }
    }

    public boolean editInStorage(ComInStorage comInStorage){
        if(checkBeforeEdit(comInStorage)){
            comInStorage.setStatus(0);
            comInStorageDAO.attachDirty(comInStorage);
            return true;
        }else{
            return false;
        }
    }

    public List<ComInStorage> getAllInStorage(){
        return comInStorageDAO.findByNatureStatus(0);
    }

    public boolean delInStorages(List<String> inStorageIds){
        if(checkBeforeDel(inStorageIds)){
            return innerDelInStorages(inStorageIds);
        }
        return false;
    }

    @Transactional
    private boolean innerDelInStorages(List<String> inStorageIds) {
        boolean flag = false;
        try{
            ComInStorage comInStorage;
            Iterator<String> iterator = inStorageIds.iterator();
            while(iterator.hasNext()){
                String id = iterator.next();
                comInStorage = comInStorageDAO.findById(id);
                comInStorage.setNatureStatus(1);
                comInStorageDAO.attachDirty(comInStorage);
            }
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("delete fail");
        }finally{
            return flag;
        }
    }

    private boolean checkBeforeDel(List<String> inStorageIds) {
        if(inStorageIds == null || inStorageIds.size() <= 0) return false;
        Iterator<String> iterator = inStorageIds.iterator();
        while(iterator.hasNext()){
            String id = iterator.next();
            if(!checkBeforeDel(id))
                return false;
        }
        return true;
    }
}
