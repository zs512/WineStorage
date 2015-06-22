package com.action.ItemAction;

import com.opensymphony.xwork2.ActionSupport;
import com.serivce.ItemService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ruanqx on 2015/6/18.
 */
public class DelSelectedItemAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    List<String> idList;

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

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

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    @Transactional
    public String execute() throws Exception {
        ItemService itemService = new ItemService();
        Iterator<String> iterator = this.idList.iterator();
        boolean flag = true;
        while(iterator.hasNext()){
            flag = itemService.delItem(iterator.next());
        }
        if(flag) setResult("success");
        else setResult("error");
        return SUCCESS;
    }
}
