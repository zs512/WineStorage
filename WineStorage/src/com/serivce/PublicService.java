package com.serivce;

/**
 * Created by ruanqx on 2015/6/16.
 */
public class PublicService {
    protected boolean checkStringSizeIsOk(String str, int low, int up){
        return (str != null && str.length() >= low && str.length() <= up);
    }

}
