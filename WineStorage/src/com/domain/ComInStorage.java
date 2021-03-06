package com.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * ComInStorage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_inStorage", schema = "dbo", catalog = "WineStorage")
public class ComInStorage implements java.io.Serializable {

	// Fields

	private String id;
	private ComUser comUserByApproval;
	private ComUser comUserByKeyboarder;
	private ComItem comItem;
	private Integer count;
	private String supplyPlace;
	private String agent;
	private Timestamp datetime;
	private Timestamp approvalDatetime;
	private Integer status;
	private String remark;
	private Integer natureStatus;
	private Set<ComApprovalInStorage> comApprovalInStorages = new HashSet<ComApprovalInStorage>(
			0);

	// Constructors

	/** default constructor */
	public ComInStorage() {
	}

	/** minimal constructor */
	public ComInStorage(ComUser comUserByKeyboarder, ComItem comItem,
			Integer count, String supplyPlace, String agent,
			Timestamp datetime, Integer status) {
		this.comUserByKeyboarder = comUserByKeyboarder;
		this.comItem = comItem;
		this.count = count;
		this.supplyPlace = supplyPlace;
		this.agent = agent;
		this.datetime = datetime;
		this.status = status;
	}

	/** full constructor */
	public ComInStorage(ComUser comUserByApproval, ComUser comUserByKeyboarder,
			ComItem comItem, Integer count, String supplyPlace, String agent,
			Timestamp datetime, Timestamp approvalDatetime, Integer status,
			String remark, Integer natureStatus,
			Set<ComApprovalInStorage> comApprovalInStorages) {
		this.comUserByApproval = comUserByApproval;
		this.comUserByKeyboarder = comUserByKeyboarder;
		this.comItem = comItem;
		this.count = count;
		this.supplyPlace = supplyPlace;
		this.agent = agent;
		this.datetime = datetime;
		this.approvalDatetime = approvalDatetime;
		this.status = status;
		this.remark = remark;
		this.natureStatus = natureStatus;
		this.comApprovalInStorages = comApprovalInStorages;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "approval")
	public ComUser getComUserByApproval() {
		return this.comUserByApproval;
	}

	public void setComUserByApproval(ComUser comUserByApproval) {
		this.comUserByApproval = comUserByApproval;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "keyboarder", nullable = false)
	public ComUser getComUserByKeyboarder() {
		return this.comUserByKeyboarder;
	}

	public void setComUserByKeyboarder(ComUser comUserByKeyboarder) {
		this.comUserByKeyboarder = comUserByKeyboarder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id", nullable = false)
	public ComItem getComItem() {
		return this.comItem;
	}

	public void setComItem(ComItem comItem) {
		this.comItem = comItem;
	}

	@Column(name = "count", nullable = false)
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "supply_place", nullable = false, length = 500)
	public String getSupplyPlace() {
		return this.supplyPlace;
	}

	public void setSupplyPlace(String supplyPlace) {
		this.supplyPlace = supplyPlace;
	}

	@Column(name = "agent", nullable = false, length = 50)
	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	@Column(name = "datetime", nullable = false, length = 23)
	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	@Column(name = "approval_datetime", length = 23)
	public Timestamp getApprovalDatetime() {
		return this.approvalDatetime;
	}

	public void setApprovalDatetime(Timestamp approvalDatetime) {
		this.approvalDatetime = approvalDatetime;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "remark", length = 500)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "nature_status")
	public Integer getNatureStatus() {
		return this.natureStatus;
	}

	public void setNatureStatus(Integer natureStatus) {
		this.natureStatus = natureStatus;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comInStorage")
	public Set<ComApprovalInStorage> getComApprovalInStorages() {
		return this.comApprovalInStorages;
	}

	public void setComApprovalInStorages(
			Set<ComApprovalInStorage> comApprovalInStorages) {
		this.comApprovalInStorages = comApprovalInStorages;
	}

}