package com.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * ComUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_user", schema = "dbo", catalog = "WineStorage")
public class ComUser implements java.io.Serializable {

	// Fields

	private String id;
	private String loginName;
	private String password;
	private String name;
	private Integer status;
	private Set<ComApprovalInStorage> comApprovalInStorages = new HashSet<ComApprovalInStorage>(
			0);
	private Set<ComUserRight> comUserRights = new HashSet<ComUserRight>(0);
	private Set<ComInStorage> comInStoragesForApproval = new HashSet<ComInStorage>(
			0);
	private Set<ComInStorage> comInStoragesForKeyboarder = new HashSet<ComInStorage>(
			0);
	private Set<ComOutStorage> comOutStoragesForKeyboarder = new HashSet<ComOutStorage>(
			0);
	private Set<ComApprovalOutStorage> comApprovalOutStorages = new HashSet<ComApprovalOutStorage>(
			0);
	private Set<ComOutStorage> comOutStoragesForApproval = new HashSet<ComOutStorage>(
			0);

	// Constructors

	/** default constructor */
	public ComUser() {
	}

	/** minimal constructor */
	public ComUser(String loginName, String password, String name) {
		this.loginName = loginName;
		this.password = password;
		this.name = name;
	}

	/** full constructor */
	public ComUser(String loginName, String password, String name,
			Integer status, Set<ComApprovalInStorage> comApprovalInStorages,
			Set<ComUserRight> comUserRights,
			Set<ComInStorage> comInStoragesForApproval,
			Set<ComInStorage> comInStoragesForKeyboarder,
			Set<ComOutStorage> comOutStoragesForKeyboarder,
			Set<ComApprovalOutStorage> comApprovalOutStorages,
			Set<ComOutStorage> comOutStoragesForApproval) {
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.status = status;
		this.comApprovalInStorages = comApprovalInStorages;
		this.comUserRights = comUserRights;
		this.comInStoragesForApproval = comInStoragesForApproval;
		this.comInStoragesForKeyboarder = comInStoragesForKeyboarder;
		this.comOutStoragesForKeyboarder = comOutStoragesForKeyboarder;
		this.comApprovalOutStorages = comApprovalOutStorages;
		this.comOutStoragesForApproval = comOutStoragesForApproval;
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

	@Column(name = "login_name", nullable = false, length = 50)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUser")
	public Set<ComApprovalInStorage> getComApprovalInStorages() {
		return this.comApprovalInStorages;
	}

	public void setComApprovalInStorages(
			Set<ComApprovalInStorage> comApprovalInStorages) {
		this.comApprovalInStorages = comApprovalInStorages;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUser")
	public Set<ComUserRight> getComUserRights() {
		return this.comUserRights;
	}

	public void setComUserRights(Set<ComUserRight> comUserRights) {
		this.comUserRights = comUserRights;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByApproval")
	public Set<ComInStorage> getComInStoragesForApproval() {
		return this.comInStoragesForApproval;
	}

	public void setComInStoragesForApproval(
			Set<ComInStorage> comInStoragesForApproval) {
		this.comInStoragesForApproval = comInStoragesForApproval;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByKeyboarder")
	public Set<ComInStorage> getComInStoragesForKeyboarder() {
		return this.comInStoragesForKeyboarder;
	}

	public void setComInStoragesForKeyboarder(
			Set<ComInStorage> comInStoragesForKeyboarder) {
		this.comInStoragesForKeyboarder = comInStoragesForKeyboarder;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByKeyboarder")
	public Set<ComOutStorage> getComOutStoragesForKeyboarder() {
		return this.comOutStoragesForKeyboarder;
	}

	public void setComOutStoragesForKeyboarder(
			Set<ComOutStorage> comOutStoragesForKeyboarder) {
		this.comOutStoragesForKeyboarder = comOutStoragesForKeyboarder;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUser")
	public Set<ComApprovalOutStorage> getComApprovalOutStorages() {
		return this.comApprovalOutStorages;
	}

	public void setComApprovalOutStorages(
			Set<ComApprovalOutStorage> comApprovalOutStorages) {
		this.comApprovalOutStorages = comApprovalOutStorages;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByApproval")
	public Set<ComOutStorage> getComOutStoragesForApproval() {
		return this.comOutStoragesForApproval;
	}

	public void setComOutStoragesForApproval(
			Set<ComOutStorage> comOutStoragesForApproval) {
		this.comOutStoragesForApproval = comOutStoragesForApproval;
	}

}