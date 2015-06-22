package com.action.OutStorageAction;

import com.domain.ComItem;
import com.domain.ComOutStorage;
import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.OutStorageService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by ruanqx on 2015/6/20.
 */
public class AddOutStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String itemId;
    private String count;
    private String place;
    private String agent;
    private String remark;

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        ComOutStorage comOutStorage = new ComOutStorage();
        ComItem comItem = new ComItem();
        ComUser comUser = new ComUser();
        comItem.setId(itemId);
        comUser.setId((String)session.get("userId"));

        comOutStorage.setComItem(comItem);
        comOutStorage.setCount(Integer.valueOf(count));
        comOutStorage.setDeliveryPlace(place);
        comOutStorage.setAgent(agent);
        comOutStorage.setComUserByKeyboarder(comUser);
        comOutStorage.setDatetime(new Timestamp(System.currentTimeMillis()));
        comOutStorage.setRemark(remark);

        OutStorageService outStorageService = new OutStorageService();
        if(outStorageService.addOutStorage(comOutStorage)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
