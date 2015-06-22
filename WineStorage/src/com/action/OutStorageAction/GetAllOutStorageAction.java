package com.action.OutStorageAction;

import com.domain.ComItem;
import com.domain.ComOutStorage;
import com.domain.ComUser;
import com.opensymphony.xwork2.ActionSupport;
import com.serivce.ItemService;
import com.serivce.OutStorageService;
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
public class GetAllOutStorageAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    Map<String, Object> request;
    Map<String, Object> session;
    Map<String, Object> application;

    private List<ComItem> items;
    private List<ComOutStorage> outStorages;
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

    public List<ComOutStorage> getOutStorages() {
        return outStorages;
    }

    public void setOutStorages(List<ComOutStorage> outStorages) {
        this.outStorages = outStorages;
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
        OutStorageService outStorageService = new OutStorageService();
        setItems(itemService.getAllItem());
        outStorages = outStorageService.getAllOutStorage();
        setResultJson(getJson());
        return SUCCESS;
    }

    private String getJson(){
        String itemJson = "\"items\":[";
        String outStorageJson = "\"outStorages\":[";
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

        Iterator<ComOutStorage> outStorageIterator = outStorages.iterator();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while(outStorageIterator.hasNext()){
            ComOutStorage outStorage = outStorageIterator.next();
            UserService userService = new UserService();
            ItemService itemService = new ItemService();
            ComItem comItem = itemService.getItemById(outStorage.getComItem().getId());
            ComUser comUser = userService.getUserById(outStorage.getComUserByKeyboarder().getId());
            outStorageJson += "{\"id\":\"" + outStorage.getId() + "\"," +
                    "\"itemId\":\"" + outStorage.getComItem().getId() + "\"," +
                    "\"itemName\":\"" + comItem.getName() + "\"," +
                    "\"count\":\"" + outStorage.getCount() + "\"," +
                    "\"place\":\"" + outStorage.getDeliveryPlace() + "\"," +
                    "\"agent\":\"" + outStorage.getAgent() + "\"," +
                    "\"keyboarder\":\"" + comUser.getName() + "\"," +
                    "\"keyboarderTime\":\"" + df.format(outStorage.getDatetime()) + "\"," +
                    "\"status\":\"" + outStorage.getStatus() + "\"," +
                    "\"approval\":\"";
            if(outStorage.getComUserByApproval() != null && outStorage.getComUserByApproval().getId() != null){
                String name = "";
                if(outStorage.getComUserByApproval().getName() == null){
                    ComUser user = userService.getUserById(outStorage.getComUserByApproval().getId());
                    name = user.getName();
                }else{
                    name = outStorage.getComUserByApproval().getName();
                }
                outStorageJson += name + "\"," +
                        "\"approvalTime\":\"" + df.format(outStorage.getApprovalDatetime()) + "\",";
            }else{
                outStorageJson += "\",\"approvalTime\":\"\",";
            }

            if(outStorage.getRemark() != null){
                outStorageJson += "\"remark\":\"" + outStorage.getRemark() +"\",";
            }else{
                outStorageJson += "\"remark\":\"\",";
            }
            if(",".equals(outStorageJson.substring(outStorageJson.length() - 1))){
                outStorageJson = outStorageJson.substring(0, outStorageJson.length() - 1);
            }
            outStorageJson += "},";
        }
        if(",".equals(outStorageJson.substring(outStorageJson.length() - 1))){
            outStorageJson = outStorageJson.substring(0, outStorageJson.length() - 1);
        }
        outStorageJson += "]";
        return "{" + itemJson + "," + outStorageJson + "}";
    }
}
