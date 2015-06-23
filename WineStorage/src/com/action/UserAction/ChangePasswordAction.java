package com.action.UserAction;

import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.UserService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by ruanqx on 2015/6/23.
 */
public class ChangePasswordAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String name;
    private String oldPassword;
    private String newPassword;
    private String newPasswordAgain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordAgain() {
        return newPasswordAgain;
    }

    public void setNewPasswordAgain(String newPasswordAgain) {
        this.newPasswordAgain = newPasswordAgain;
    }

    public Map<String, Object> getRequest() {
        return request;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public String execute() throws Exception {
        String loginName = (String)session.get("userLoginName");
        if(!loginName.equals(name)) return ERROR;
        if(newPassword.equals(newPasswordAgain)){
            ComUser comUser = new ComUser();
            comUser.setLoginName(name);
            comUser.setPassword(oldPassword);
            UserService userService = new UserService();
            if(userService.changePassword(comUser, newPassword)){
                session.remove("userId");
                session.remove("userName");
                return SUCCESS;
            }
        }
        return ERROR;

    }
}
