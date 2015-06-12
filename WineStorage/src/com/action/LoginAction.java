package com.action;

import com.domain.ComUser;
import com.opensymphony.xwork2.Action;
import com.serivce.UserService;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

/**
 * Created by ruanqx on 2015/6/11.
 */
public class LoginAction implements Action {
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
            ServletActionContext.getRequest().getSession().setAttribute("ComUser", user);
            return "loginSuccess";
        }else{
            return "loginFail";
        }
    }
}
