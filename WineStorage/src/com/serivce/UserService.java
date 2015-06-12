package com.serivce;

import com.dao.ComUserDAO;
import com.domain.ComUser;
import com.tools.MD5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ruanqx on 2015/6/12.
 */
public class UserService{

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComUserDAO comUserDAO = (ComUserDAO)applicationContext.getBean("ComUserDAO");

    ComUser user;

    private boolean checkLoginNameIsExistent(String loginName){
        if(loginName == null) return false;
        List<ComUser> comUserList = comUserDAO.findByLoginName(user.getLoginName());
        return (comUserList != null && comUserList.size() > 0);

    }
    private boolean checkSignUpIsOk(ComUser comUser){
        return (comUser != null && !checkLoginNameIsExistent(comUser.getLoginName()));
    }

    public UserService(){
        user = new ComUser();
    }

    public boolean loginSuccess(ComUser comUser){

        comUser.setPassword(MD5.get32(comUser.getPassword()));
        List<ComUser> comUserList = comUserDAO.findByExample(comUser);

        if(comUserList != null && comUserList.size() == 1){
            ComUser userTmp = comUserList.get(0);
            user.setId(userTmp.getId());
            user.setLoginName(userTmp.getLoginName());
            user.setName(userTmp.getName());
            return true;
        }else{
            return false;
        }
    }

    public boolean signUpSuccess(ComUser comUser){
        if(checkSignUpIsOk(comUser)) {
            comUser.setPassword(MD5.get32(comUser.getPassword()));
            comUserDAO.save(comUser);
            return true;
        }
        return false;
    }
}
