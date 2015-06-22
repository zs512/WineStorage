package com.serivce;

import com.dao.ComItemDAO;
import com.dao.ComOutStorageDAO;
import com.dao.ComUserDAO;
import com.domain.ComItem;
import com.domain.ComOutStorage;
import com.domain.ComUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ruanqx on 2015/6/22.
 */
public class OutStorageService extends PublicService{
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComOutStorageDAO comOutStorageDAO = (ComOutStorageDAO)applicationContext.getBean("ComOutStorageDAO");

    private boolean checkBeforeAdd(ComOutStorage comOutStorage){
        return (comOutStorage != null &&
                checkItemIsExistent(comOutStorage.getComItem().getId()) &&
                checkCountIsOk(comOutStorage.getCount()) &&
                checkDeliveryPlaceIsOk(comOutStorage.getDeliveryPlace()) &&
                checkAgent(comOutStorage.getAgent()) &&
                checkKeyboarderIsOk(comOutStorage.getComUserByKeyboarder().getId()) &&
                checkRemark(comOutStorage.getRemark()));
    }

    private boolean checkBeforeDel(String comOutStorageId){
        if(comOutStorageId == null) return false;
        return checkOutStorageIsExistent(comOutStorageId);
    }

    private boolean checkBeforeEdit(ComOutStorage comOutStorage){
        if(comOutStorage == null || comOutStorage.getId() == null) return false;
        ComOutStorage outStorageTmp = comOutStorageDAO.findById(comOutStorage.getId());

        return (outStorageTmp != null &&
                outStorageTmp.getId() != null &&
                !outStorageTmp.getStatus().equals(2) &&
                checkItemIsExistent(comOutStorage.getComItem().getId()) &&
                checkCountIsOk(comOutStorage.getCount()) &&
                checkDeliveryPlaceIsOk(comOutStorage.getDeliveryPlace()) &&
                checkAgent(comOutStorage.getAgent()) &&
                checkKeyboarderIsOk(comOutStorage.getComUserByKeyboarder().getId()) &&
                checkRemark(comOutStorage.getRemark()));
    }

    private boolean checkOutStorageIsExistent(String id) {
        if(id == null) return false;
        ComOutStorage comOutStorage = comOutStorageDAO.findById(id);
        return (comOutStorage != null && comOutStorage.getId() != null);
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

    private boolean checkDeliveryPlaceIsOk(String deliveryPlace) {
        return checkStringSizeIsOk(deliveryPlace, 1, 500);
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
    public boolean addOutStorage(ComOutStorage comOutStorage){
        if(checkBeforeAdd(comOutStorage)){
            comOutStorage.setStatus(0);
            comOutStorage.setNatureStatus(0);
            comOutStorageDAO.save(comOutStorage);
            return true;
        }else{
            return false;
        }
    }

    public boolean delOutStorage(String id){
        if(checkBeforeDel(id)){
            ComOutStorage comOutStorage = comOutStorageDAO.findById(id);
            comOutStorage.setNatureStatus(1);
            comOutStorageDAO.attachDirty(comOutStorage);
            return true;
        }else{
            return false;
        }
    }

    public boolean editOutStorage(ComOutStorage comOutStorage){
        if(checkBeforeEdit(comOutStorage)){
            comOutStorage.setStatus(0);
            comOutStorageDAO.attachDirty(comOutStorage);
            return true;
        }else{
            return false;
        }
    }

    public List<ComOutStorage> getAllOutStorage(){
        return comOutStorageDAO.findByNatureStatus(0);
    }

    public boolean delOutStorages(List<String> outStorageIds){
        if(checkBeforeDel(outStorageIds)){
            return innerDelOutStorages(outStorageIds);
        }
        return false;
    }

    @Transactional
    private boolean innerDelOutStorages(List<String> outStorageIds) {
        boolean flag = false;
        try{
            ComOutStorage comOutStorage;
            Iterator<String> iterator = outStorageIds.iterator();
            while(iterator.hasNext()){
                String id = iterator.next();
                comOutStorage = comOutStorageDAO.findById(id);
                comOutStorage.setNatureStatus(1);
                comOutStorageDAO.attachDirty(comOutStorage);
            }
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("delete fail");
        }finally{
            return flag;
        }
    }

    private boolean checkBeforeDel(List<String> outStorageIds) {
        if(outStorageIds == null || outStorageIds.size() <= 0) return false;
        Iterator<String> iterator = outStorageIds.iterator();
        while(iterator.hasNext()){
            String id = iterator.next();
            if(!checkBeforeDel(id))
                return false;
        }
        return true;
    }
}
