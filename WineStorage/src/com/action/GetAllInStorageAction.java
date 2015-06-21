package com.action;

import com.domain.ComInStorage;
import com.domain.ComItem;
import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.InStorageService;
import com.serivce.ItemService;
import com.serivce.UserService;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ruanqx on 2015/6/20.
 */
public class GetAllInStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private List<ComItem> items;
    private List<ComInStorage> inStorages;
    private String resultJson;

    public String getResultJson() {
        return resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }

    public List<ComItem> getItems() {
        return items;
    }

    public void setItems(List<ComItem> items) {
        this.items = items;
    }

    public List<ComInStorage> getInStorages() {
        return inStorages;
    }

    public void setInStorages(List<ComInStorage> inStorages) {
        this.inStorages = inStorages;
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


    @Override
    public String execute() throws Exception {
        ItemService itemService = new ItemService();
        InStorageService inStorageService = new InStorageService();
        setItems(itemService.getAllItem());
        inStorages = inStorageService.getAllInStorage();
        setResultJson(getJson());
        return SUCCESS;
    }

    private String getJson(){
        String itemJson = "\"items\":[";
        String inStorageJson = "\"inStorages\":[";
        Iterator<ComItem> itemIterator = items.iterator();
        while(itemIterator.hasNext()){
            ComItem item = itemIterator.next();
            itemJson += "{\"id\":\"" + item.getId() + "\",\"" +
                    "name\":\"" + item.getName() + "\",\"" +
                    "variety\":\"" + item.getVariety() + "\",\"" +
                    "standard\":\"" + item.getStandard() + "\",\"" +
                    "barcode\":\"" + item.getBarcode() + "\",\"" +
                    "storage\":\"" + item.getStorage().toString() + "\"},";
        }
        if(",".equals(itemJson.substring(itemJson.length() - 1))){
            itemJson= itemJson.substring(0, itemJson.length() - 1);
        }
        itemJson += "]";

        Iterator<ComInStorage> inStorageIterator = inStorages.iterator();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while(inStorageIterator.hasNext()){
            ComInStorage inStorage = inStorageIterator.next();
            UserService userService = new UserService();
            ComUser comUser = userService.getUserById(inStorage.getComUserByKeyboarder().getId());
            inStorageJson += "{\"id\":\"" + inStorage.getId() + "\"," +
                        "\"itemId\":\"" + inStorage.getComItem().getId() + "\"," +
                        "\"count\":\"" + inStorage.getCount() + "\"," +
                        "\"place\":\"" + inStorage.getSupplyPlace() + "\"," +
                        "\"agent\":\"" + inStorage.getAgent() + "\"," +
                        "\"keyboarder\":\"" + comUser.getName() + "\"," +
                        "\"keyboarderTime\":\"" + df.format(inStorage.getDatetime()) + "\"," +
                        "\"status\":\"" + inStorage.getStatus() + "\"," +
                        "\"approval\":\"";
            if(inStorage.getComUserByApproval() != null && inStorage.getComUserByApproval().getId() != null){
                String name = "";
                if(inStorage.getComUserByApproval().getName() == null){
                    ComUser user = userService.getUserById(inStorage.getComUserByApproval().getId());
                    name = user.getName();
                }else{
                    name = inStorage.getComUserByApproval().getName();
                }
                inStorageJson += inStorage.getAgent() + "\"," +
                            "\"approvalTime\":\"" + df.format(inStorage.getApprovalDatetime()) + "\",";
            }else{
                inStorageJson += "\",\"approvalTime\":\"\",";
            }

            if(inStorage.getRemark() != null){
                inStorageJson += "\"remark\":\"" + inStorage.getRemark() +"\",";
            }else{
                inStorageJson += "\"remark\":\"\",";
            }
            if(",".equals(inStorageJson.substring(inStorageJson.length() - 1))){
                inStorageJson = inStorageJson.substring(0, inStorageJson.length() - 1);
            }
            inStorageJson += "},";
        }
        if(",".equals(inStorageJson.substring(inStorageJson.length() - 1))){
            inStorageJson = inStorageJson.substring(0, inStorageJson.length() - 1);
        }
        inStorageJson += "]";
        return "{" + itemJson + "," + inStorageJson + "}";
    }
}
