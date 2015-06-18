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
        List<ComItem> comItemList = comItemDAO.findByExample(comItem);
        return (comItemList != null && comItemList.size() > 0);
    }

    private boolean checkBeforeAdd(ComItem comItem){
        return (comItem != null &&
                checkNameIsOk(comItem.getName()) &&
                checkVarietyIsOk(comItem.getVariety()) &&
                checkStandardIsOk(comItem.getStandard()) && !checkItemIsExistent(comItem.getName(), comItem.getVariety(), comItem.getStandard()));
    }
    public boolean addItem(ComItem comItem){
        if(checkBeforeAdd(comItem)){
            comItemDAO.save(comItem);
            return true;
        }else{
            return false;
        }
    }
    public List<ComItem> getAllItem(){
        List<ComItem> comItemList = comItemDAO.findAll();
        return comItemList;
    }
    public boolean delItem(String itemId){
        return false;
    }
}
