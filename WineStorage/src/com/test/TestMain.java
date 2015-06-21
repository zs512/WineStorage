package com.test;

import com.dao.ComItemDAO;
import com.domain.ComItem;
import com.domain.ComUser;
import com.serivce.UserService;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by ruanqx on 2015/6/12.
 */
public class TestMain {

    public static void main(String[] arg) {
//        UserService userService = new UserService();
//        ComUser comUser = new ComUser();
//        comUser.setLoginName("ruanqx");
//        comUser.setName("ruanqixiang");
//        comUser.setPassword(".");
        ComUser user = new ComUser();
        user.setLoginName("ruanqx");
        user.setPassword(".");
        user.setName("ruanqixiang");
        UserService userService = new UserService();
        userService.signUpSuccess(user);
    }
}
