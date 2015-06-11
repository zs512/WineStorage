package com.action;

import com.opensymphony.xwork2.Action;
/**
 * Created by ruanqx on 2015/6/11.
 */
public class LoginAction implements Action {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        return null;
    }
}
