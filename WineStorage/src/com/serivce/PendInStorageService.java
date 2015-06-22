package com.serivce;

import com.dao.ComApprovalInStorageDAO;
import com.dao.ComInStorageDAO;
import com.dao.ComItemDAO;
import com.dao.ComUserDAO;
import com.domain.ComApprovalInStorage;
import com.domain.ComInStorage;
import com.domain.ComItem;
import com.domain.ComUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * Created by ruan on 6/23/15.
 */
public class PendInStorageService extends PublicService{

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComInStorageDAO comInStorageDAO = (ComInStorageDAO)applicationContext.getBean("ComInStorageDAO");
    ComUserDAO comUserDAO = (ComUserDAO)applicationContext.getBean("ComUserDAO");
    ComApprovalInStorageDAO comApprovalInStorageDAO = (ComApprovalInStorageDAO)applicationContext.getBean("ComApprovalInStorageDAO");
    ComItemDAO comItemDAO = (ComItemDAO)applicationContext.getBean("ComItemDAO");

    public boolean failInStorage(String inStorageId, String approvalId){
        ComInStorage comInStorage = comInStorageDAO.findById(inStorageId);
        if(comInStorage == null || comInStorage.getId() == null || approvalId == null){
            return false;
        }else{
            ComUser comUser = comUserDAO.findById(approvalId);
            if(comUser == null || comUser.getId() == null) return false;

            if(innerFail(comInStorage, comUser))
                return true;
            return false;
        }
    }

    public boolean passInStorage(String inStorageId, String approvalId){
        ComInStorage comInStorage = comInStorageDAO.findById(inStorageId);
        if(comInStorage == null || comInStorage.getId() == null || approvalId == null){
            return false;
        }else{
            ComUser comUser = comUserDAO.findById(approvalId);
            if(comUser == null || comUser.getId() == null) return false;

            if(innerPass(comInStorage, comUser))
                return true;
            return false;
        }

    }

    @Transactional
    private boolean innerFail(ComInStorage comInStorage, ComUser comUser){
        boolean flag = false;
        try{

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            comInStorage.setComUserByApproval(comUser);
            comInStorage.setApprovalDatetime(timestamp);
            comInStorage.setStatus(1);

            ComApprovalInStorage comApprovalInStorage = new ComApprovalInStorage();
            comApprovalInStorage.setComInStorage(comInStorage);
            comApprovalInStorage.setComUser(comUser);
            comApprovalInStorage.setDatetime(timestamp);
            comApprovalInStorage.setResult(1);

            comInStorageDAO.attachDirty(comInStorage);
            comApprovalInStorageDAO.save(comApprovalInStorage);

            flag = true;

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("failInStorage error");
        }finally {
            return flag;
        }

    }

    @Transactional
    private boolean innerPass(ComInStorage comInStorage, ComUser comUser){
        boolean flag = false;
        try{

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            comInStorage.setComUserByApproval(comUser);
            comInStorage.setApprovalDatetime(timestamp);
            comInStorage.setStatus(2);

            ComApprovalInStorage comApprovalInStorage = new ComApprovalInStorage();
            comApprovalInStorage.setComInStorage(comInStorage);
            comApprovalInStorage.setComUser(comUser);
            comApprovalInStorage.setDatetime(timestamp);
            comApprovalInStorage.setResult(0);

            ComItem comItem = comItemDAO.findById(comInStorage.getComItem().getId());
            Integer cout = comItem.getStorage() + comInStorage.getCount();
            comItem.setStorage(cout);

            comInStorageDAO.attachDirty(comInStorage);
            comApprovalInStorageDAO.save(comApprovalInStorage);
            comItemDAO.attachDirty(comItem);

            flag = true;

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("failInStorage error");
        }finally {
            return flag;
        }

    }

}
