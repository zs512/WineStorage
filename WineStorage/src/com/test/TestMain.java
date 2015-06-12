package com.test;

import com.domain.ComUser;
import com.serivce.UserService;

/**
 * Created by ruanqx on 2015/6/12.
 */
public class TestMain {
    static public void main(String[] arg){
        UserService userService = new UserService();
        ComUser comUser = new ComUser();
        comUser.setLoginName("ruanqx");
        comUser.setName("ruanqixiang");
        comUser.setPassword(".");
        System.out.println(userService.signUpSuccess(comUser));
    }
}
