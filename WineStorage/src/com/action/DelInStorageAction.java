package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.serivce.InStorageService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by ruanqx on 2015/6/21.
 */
public class DelInStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String id;

    private String result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        InStorageService inStorageService = new InStorageService();
        if(inStorageService.delInStorage(id)){
            setResult("success");
        }else{
            setResult("error");
        }
        return SUCCESS;

    }
}
