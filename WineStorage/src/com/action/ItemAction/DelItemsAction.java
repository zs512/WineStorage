package com.action.ItemAction;

import com.opensymphony.xwork2.ActionSupport;
import com.serivce.ItemService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ruanqx on 2015/6/19.
 */
public class DelItemsAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private List<String> idList;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
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
        ItemService itemService = new ItemService();
        if(itemService.delItems(idList)){
            setResult("success");
        }else{
            setResult("fail");
        }
        return SUCCESS;
    }
}
