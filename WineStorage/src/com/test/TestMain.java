package com.test;

import com.dao.ComItemDAO;
import com.domain.ComItem;

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
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(timestamp));

    }
}
