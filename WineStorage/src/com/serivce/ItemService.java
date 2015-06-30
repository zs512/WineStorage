package com.serivce;

import com.common.Page;
import com.dao.ComItemDAO;
import com.domain.ComItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ruanqx on 2015/6/16.
 */
public class ItemService extends PublicService{
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    ComItemDAO comItemDAO = (ComItemDAO)applicationContext.getBean("ComItemDAO");

    private boolean checkBarcodeIsOk(String barcode){
        return checkStringSizeIsOk(barcode, 1, 50);
    }

    private boolean checkNameIsOk(String itemName){
        return checkStringSizeIsOk(itemName, 1, 50);
    }

    private boolean checkVarietyIsOk(String variety){
        return checkStringSizeIsOk(variety, 1, 50);
    }

    private boolean checkStandardIsOk(String standard){
        return checkStringSizeIsOk(standard, 1, 50);
    }

    private boolean checkItemIsExistent(String barcode, String name, String variety, String standard){
        ComItem comItem = new ComItem();
        comItem.setBarcode(barcode);
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
                checkStandardIsOk(comItem.getStandard()) &&
                checkBarcodeIsOk(comItem.getBarcode()) && !checkItemIsExistent(comItem.getBarcode(), comItem.getName(), comItem.getVariety(), comItem.getStandard()));
    }

    private boolean checkBeforeDel(String itemId){
        if(itemId == null) return false;
        ComItem item = comItemDAO.findById(itemId);
        return (item != null && item.getStorage() <= 0);
    }

    private boolean checkBeforeDel(List<String> itemIds){
        if(itemIds == null || itemIds.size() <= 0) return false;
        Iterator<String> iterator = itemIds.iterator();
        while(iterator.hasNext()){
            String id = iterator.next();
            if(!checkBeforeDel(id))
                return false;
        }
        return true;
    }

    private boolean checkBeforeEdit(ComItem comItem) {
        if(comItem == null || comItem.getId() == null) return false;
        ComItem itemTmp = comItemDAO.findById(comItem.getId());
        return (comItem != null &&
                itemTmp != null &&
                checkNameIsOk(comItem.getName()) &&
                checkVarietyIsOk(comItem.getVariety()) &&
                checkStandardIsOk(comItem.getStandard()) &&
                checkBarcodeIsOk(comItem.getBarcode()) &&
                !checkItemIsExistent(comItem.getBarcode(), comItem.getName(), comItem.getVariety(), comItem.getStandard()));
    }

    @Transactional
    private boolean innerDelItems(List<String> ids){
        boolean flag = false;
        try{
            ComItem comItem;
            Iterator<String> iterator = ids.iterator();
            while(iterator.hasNext()){
                String id = iterator.next();
                comItem = comItemDAO.findById(id);
                comItem.setStatus(1);
                comItemDAO.attachDirty(comItem);
            }
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("delete fail");
        }finally {
            return flag;
        }
    }

    /*---------------------------------------------------------*/

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
        return comItemDAO.findByStatus(0);
    }

    public List<ComItem> getItemByPage(Page page){
        return comItemDAO.findByPage(0, page);
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

    public boolean delItems(List<String> itemIds){
        if(checkBeforeDel(itemIds)){
            return innerDelItems(itemIds);
        }
        return false;
    }

    public ComItem getItemById(String id){
        if(id == null) return null;
        return comItemDAO.findById(id);
    }

}
