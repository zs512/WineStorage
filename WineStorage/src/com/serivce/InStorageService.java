package com.serivce;

import com.dao.ComInStorageDAO;
import com.dao.ComItemDAO;
import com.dao.ComUserDAO;
import com.domain.ComInStorage;
import com.domain.ComItem;
import com.domain.ComUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
            comInStorageDAO.save(comInStorage);
            return true;
        }else{
            return false;
        }
    }

    public List<ComInStorage> getAllInStorage(){
        List<ComInStorage> resultList = new ArrayList<ComInStorage>();
        List<ComInStorage> tmp = comInStorageDAO.findByStatus(0);
        Iterator<ComInStorage> iterator = tmp.iterator();
        while(iterator.hasNext()){
            resultList.add(iterator.next());
        }
        tmp = comInStorageDAO.findByStatus(1);
        while(iterator.hasNext()){
            resultList.add(iterator.next());
        }
        tmp = comInStorageDAO.findByStatus(2);
        while(iterator.hasNext()){
            resultList.add(iterator.next());
        }
        return resultList;
    }
}
