package com.action.UserAction;

import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.UserService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by ruanqx on 2015/6/11.
 */
public class LoginAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;


    private String name;
    private String password;

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        ComUser user = new ComUser();
        user.setLoginName(name);
        user.setPassword(password);
        UserService userService= new UserService();
        if(userService.loginSuccess(user)){
            user = userService.getUser();
            session.put("userId", user.getId());
            session.put("userName", user.getName());
            return "loginSuccess";
        }else{
            return "loginFail";
        }
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
