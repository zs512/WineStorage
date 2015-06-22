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
 * Created by ruan on 6/22/15.
 */
public class EditOutStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

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
        ComOutStorage comOutStorage = new ComOutStorage();
        ComItem comItem = new ComItem();
        ComUser comUser = new ComUser();
        comItem.setId(itemId);
        comUser.setId((String)session.get("userId"));

        comItem.setId(itemId);
        comOutStorage.setId(id);
        comOutStorage.setComItem(comItem);
        comOutStorage.setCount(Integer.valueOf(count));
        comOutStorage.setDeliveryPlace(place);
        comOutStorage.setAgent(agent);
        comOutStorage.setRemark(remark);
        comOutStorage.setComUserByKeyboarder(comUser);
        comOutStorage.setDatetime(new Timestamp(System.currentTimeMillis()));
        comOutStorage.setNatureStatus(0);
        OutStorageService inStorageService = new OutStorageService();
        inStorageService.editOutStorage(comOutStorage);
        return SUCCESS;
    }
}
