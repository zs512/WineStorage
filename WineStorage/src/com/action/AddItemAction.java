package com.action;

import com.domain.ComItem;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.ItemService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by ruanqx on 2015/6/16.
 */
public class AddItemAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String name;
    private String variety;
    private String standard;
    private String storage;
    private String barcode;

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
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
    public String execute() throws Exception {
        ComItem item = new ComItem();
        item.setBarcode(barcode);
        item.setName(name);
        item.setVariety(variety);
        item.setStandard(standard);
        item.setStorage(0);
        ItemService itemService = new ItemService();
        if(itemService.addItem(item)){
            return "success";
        }else{
            return "fail";
        }
    }
}
