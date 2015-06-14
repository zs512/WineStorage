package com.action;

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

    Map request;
    Map session;
    Map application;


    private String name;
    private String password;
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
            session.put("ComUser", "123");
            return "loginSuccess";
        }else{
            return "loginFail";
        }
    }

    @Override
    public void setApplication(Map application) {
        this.application = application;
    }

    @Override
    public void setRequest(Map request) {
        this.request = request;
    }

    @Override
    public void setSession(Map session) {
        System.out.println("setSession");
        System.out.println(session.toString());
        this.session = session;
    }
}
