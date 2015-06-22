package com.action.PendAction;

import com.opensymphony.xwork2.ActionSupport;
import com.serivce.PendInStorageService;
import com.serivce.PendOutStorageService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by ruan on 6/23/15.
 */
public class FailOutStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String outStorageId;

    public String getOutStorageId() {
        return outStorageId;
    }

    public void setOutStorageId(String outStorageId) {
        this.outStorageId = outStorageId;
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
        PendOutStorageService pendOutStorageService = new PendOutStorageService();
        if(pendOutStorageService.failOutStorage(outStorageId, (String) session.get("userId"))){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
}
