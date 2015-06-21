package com.action;

import com.domain.ComItem;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.ItemService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ruan on 6/16/15.
 */
public class GetAllItemAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{
    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    List<ComItem> comItemList;

    private String result;

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.application = map;
    }

    public List<ComItem> getComItemList() {
        return comItemList;
    }

    public void setComItemList(List<ComItem> comItemList) {
        this.comItemList = comItemList;
    }

    @Override
    public String execute() throws Exception {
        ItemService itemService = new ItemService();
        this.comItemList = itemService.getAllItem();
        this.setResult(itemListToJson(this.comItemList));
        return SUCCESS;
    }

    private String itemListToJson(List<ComItem> items){
        String json;
        json = "[";
        if(items == null) return null;
        Iterator<ComItem> itemIterator = items.iterator();
        while (itemIterator.hasNext()){
            ComItem item = (ComItem)itemIterator.next();
            json += "{\"id\":\"" + item.getId() + "\",\"" +
                    "name\":\"" + item.getName() + "\",\"" +
                    "variety\":\"" + item.getVariety() + "\",\"" +
                    "standard\":\"" + item.getStandard() + "\",\"" +
                    "barcode\":\"" + item.getBarcode() + "\",\"" +
                    "storage\":\"" + item.getStorage().toString() + "\"},";
        }
        if(",".equals(json.substring(json.length() - 1))){
            json = json.substring(0, json.length() - 1);
        }
        json += "]";
        return json;
    }
}
