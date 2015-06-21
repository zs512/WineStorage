package com.action;

import com.domain.ComInStorage;
import com.domain.ComItem;
import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.InStorageService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by ruan on 6/22/15.
 */
public class EditInStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private String id;
    private String itemId;
    private String count;
    private String agent;
    private String remark;
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        ComInStorage comInStorage = new ComInStorage();
        ComItem comItem = new ComItem();
        ComUser comUser = new ComUser();
        comItem.setId(itemId);
        comUser.setId((String)session.get("userId"));

        comItem.setId(itemId);
        comInStorage.setId(id);
        comInStorage.setComItem(comItem);
        comInStorage.setCount(Integer.valueOf(count));
        comInStorage.setSupplyPlace(place);
        comInStorage.setAgent(agent);
        comInStorage.setRemark(remark);
        comInStorage.setComUserByKeyboarder(comUser);
        comInStorage.setDatetime(new Timestamp(System.currentTimeMillis()));
        comInStorage.setNatureStatus(0);
        InStorageService inStorageService = new InStorageService();
        inStorageService.editInStorage(comInStorage);
        return SUCCESS;
    }
}
