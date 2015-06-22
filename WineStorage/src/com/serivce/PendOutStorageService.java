package com.serivce;

import com.dao.*;
import com.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * Created by ruan on 6/23/15.
 */
public class PendOutStorageService extends PublicService{

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComOutStorageDAO comOutStorageDAO = (ComOutStorageDAO)applicationContext.getBean("ComOutStorageDAO");
    ComUserDAO comUserDAO = (ComUserDAO)applicationContext.getBean("ComUserDAO");
    ComApprovalOutStorageDAO comApprovalOutStorageDAO = (ComApprovalOutStorageDAO)applicationContext.getBean("ComApprovalOutStorageDAO");
    ComItemDAO comItemDAO = (ComItemDAO)applicationContext.getBean("ComItemDAO");

    public boolean failOutStorage(String inStorageId, String approvalId){
        ComOutStorage comOutStorage = comOutStorageDAO.findById(inStorageId);
        if(comOutStorage == null || comOutStorage.getId() == null || approvalId == null){
            return false;
        }else{
            ComUser comUser = comUserDAO.findById(approvalId);
            if(comUser == null || comUser.getId() == null) return false;

            if(innerFail(comOutStorage, comUser))
                return true;
            return false;
        }
    }

    public boolean passOutStorage(String outStorageId, String approvalId){
        ComOutStorage comOutStorage = comOutStorageDAO.findById(outStorageId);
        if(comOutStorage == null || comOutStorage.getId() == null || approvalId == null){
            return false;
        }else{
            ComUser comUser = comUserDAO.findById(approvalId);
            if(comUser == null || comUser.getId() == null) return false;

            if(innerPass(comOutStorage, comUser))
                return true;
            return false;
        }

    }

    @Transactional
    private boolean innerFail(ComOutStorage comOutStorage, ComUser comUser){
        boolean flag = false;
        try{

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            comOutStorage.setComUserByApproval(comUser);
            comOutStorage.setApprovalDatetime(timestamp);
            comOutStorage.setStatus(1);

            ComApprovalOutStorage comApprovalOutStorage = new ComApprovalOutStorage();
            comApprovalOutStorage.setComOutStorage(comOutStorage);
            comApprovalOutStorage.setComUser(comUser);
            comApprovalOutStorage.setDatetime(timestamp);
            comApprovalOutStorage.setResult(1);

            comOutStorageDAO.attachDirty(comOutStorage);
            comApprovalOutStorageDAO.save(comApprovalOutStorage);

            flag = true;

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("failOutStorage error");
        }finally {
            return flag;
        }

    }

    @Transactional
    private boolean innerPass(ComOutStorage comOutStorage, ComUser comUser){
        boolean flag = false;
        try{

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            comOutStorage.setComUserByApproval(comUser);
            comOutStorage.setApprovalDatetime(timestamp);
            comOutStorage.setStatus(2);

            ComApprovalOutStorage comApprovalOutStorage = new ComApprovalOutStorage();
            comApprovalOutStorage.setComOutStorage(comOutStorage);
            comApprovalOutStorage.setComUser(comUser);
            comApprovalOutStorage.setDatetime(timestamp);
            comApprovalOutStorage.setResult(0);

            ComItem comItem = comItemDAO.findById(comOutStorage.getComItem().getId());
            Integer cout = comItem.getStorage() - comOutStorage.getCount();
            if(cout < 0) return false;
            comItem.setStorage(cout);

            comOutStorageDAO.attachDirty(comOutStorage);
            comApprovalOutStorageDAO.save(comApprovalOutStorage);
            comItemDAO.attachDirty(comItem);

            flag = true;

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("failOutStorage error");
        }finally {
            return flag;
        }

    }

}
