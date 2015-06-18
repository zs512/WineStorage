package com.serivce;

import com.dao.ComItemDAO;
import com.domain.ComItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ruanqx on 2015/6/16.
 */
public class ItemService extends PublicService{
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComItemDAO comItemDAO = (ComItemDAO)applicationContext.getBean("ComItemDAO");

    private boolean checkNameIsOk(String itemName){
        return checkStringSizeIsOk(itemName, 1, 50);
    }

    private boolean checkVarietyIsOk(String variety){
        return checkStringSizeIsOk(variety, 1, 50);
    }

    private boolean checkStandardIsOk(String standard){
        return checkStringSizeIsOk(standard, 1, 50);
    }

    private boolean checkItemIsExistent(String name, String variety, String standard){
        ComItem comItem = new ComItem();
        comItem.setName(name);
        comItem.setVariety(variety);
        comItem.setStandard(standard);
        comItem.setStatus(0);
        List<ComItem> comItemList = comItemDAO.findByExample(comItem);
        return (comItemList != null && comItemList.size() > 0);
    }

    private boolean checkBeforeAdd(ComItem comItem){
        return (comItem != null &&
                checkNameIsOk(comItem.getName()) &&
                checkVarietyIsOk(comItem.getVariety()) &&
                checkStandardIsOk(comItem.getStandard()) && !checkItemIsExistent(comItem.getName(), comItem.getVariety(), comItem.getStandard()));
    }

    private boolean checkBeforeDel(String itemId){
        if(itemId == null) return false;
        ComItem item = comItemDAO.findById(itemId);
        return (item != null && item.getStorage() <= 0);
    }

    private boolean checkBeforeEdit(ComItem comItem) {
        if(comItem == null || comItem.getId() == null) return false;
        ComItem itemTmp = comItemDAO.findById(comItem.getId());
        return (comItem != null &&
                itemTmp != null &&
                checkNameIsOk(comItem.getName()) &&
                checkVarietyIsOk(comItem.getVariety()) &&
                checkStandardIsOk(comItem.getStandard()));
    }

    public boolean addItem(ComItem comItem){
        if(checkBeforeAdd(comItem)){
            comItem.setStatus(0);
            comItemDAO.save(comItem);
            return true;
        }else{
            return false;
        }
    }

    public List<ComItem> getAllItem(){
        List<ComItem> comItemList = comItemDAO.findByStatus(0);
        return comItemList;
    }

    public boolean delItem(String itemId){
        if(checkBeforeDel(itemId)){
            ComItem item = comItemDAO.findById(itemId);
            item.setStatus(1);
            comItemDAO.attachDirty(item);
            return true;
        }else return false;
    }
    public boolean editItem(ComItem comItem){
        if(checkBeforeEdit(comItem)){
            comItemDAO.attachDirty(comItem);
            return true;
        }else return false;
    }

}
