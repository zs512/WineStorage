package com.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * ComInStorage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="com_inStorage"
    ,schema="dbo"
    ,catalog="WineStorage"
)

public class ComInStorage  implements java.io.Serializable {


    // Fields    

     private String id;
     private ComUser comUserByApproval;
     private ComUser comUserByKeyboarder;
     private ComUser comUserByAgent;
     private ComItem comItem;
     private Integer count;
     private String supplyPlace;
     private Timestamp datetime;
     private Integer status;
     private String remark;


    // Constructors

    /** default constructor */
    public ComInStorage() {
    }

	/** minimal constructor */
    public ComInStorage(ComUser comUserByApproval, ComUser comUserByKeyboarder, ComUser comUserByAgent, ComItem comItem, Integer count, String supplyPlace, Timestamp datetime, Integer status) {
        this.comUserByApproval = comUserByApproval;
        this.comUserByKeyboarder = comUserByKeyboarder;
        this.comUserByAgent = comUserByAgent;
        this.comItem = comItem;
        this.count = count;
        this.supplyPlace = supplyPlace;
        this.datetime = datetime;
        this.status = status;
    }
    
    /** full constructor */
    public ComInStorage(ComUser comUserByApproval, ComUser comUserByKeyboarder, ComUser comUserByAgent, ComItem comItem, Integer count, String supplyPlace, Timestamp datetime, Integer status, String remark) {
        this.comUserByApproval = comUserByApproval;
        this.comUserByKeyboarder = comUserByKeyboarder;
        this.comUserByAgent = comUserByAgent;
        this.comItem = comItem;
        this.count = count;
        this.supplyPlace = supplyPlace;
        this.datetime = datetime;
        this.status = status;
        this.remark = remark;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="uuid.hex")@Id @GeneratedValue(generator="generator")
    
    @Column(name="id", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="approval", nullable=false)

    public ComUser getComUserByApproval() {
        return this.comUserByApproval;
    }
    
    public void setComUserByApproval(ComUser comUserByApproval) {
        this.comUserByApproval = comUserByApproval;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="keyboarder", nullable=false)

    public ComUser getComUserByKeyboarder() {
        return this.comUserByKeyboarder;
    }
    
    public void setComUserByKeyboarder(ComUser comUserByKeyboarder) {
        this.comUserByKeyboarder = comUserByKeyboarder;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="agent", nullable=false)

    public ComUser getComUserByAgent() {
        return this.comUserByAgent;
    }
    
    public void setComUserByAgent(ComUser comUserByAgent) {
        this.comUserByAgent = comUserByAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="item_id", nullable=false)

    public ComItem getComItem() {
        return this.comItem;
    }
    
    public void setComItem(ComItem comItem) {
        this.comItem = comItem;
    }
    
    @Column(name="count", nullable=false)

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
    
    @Column(name="supply_place", nullable=false, length=50)

    public String getSupplyPlace() {
        return this.supplyPlace;
    }
    
    public void setSupplyPlace(String supplyPlace) {
        this.supplyPlace = supplyPlace;
    }
    
    @Column(name="datetime", nullable=false, length=23)

    public Timestamp getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    @Column(name="remark")

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}