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
	private Set<ComInStorage> comInStoragesForAgent = new HashSet<ComInStorage>(
			0);
	private Set<ComUserRight> comUserRights = new HashSet<ComUserRight>(0);
	private Set<ComInStorage> comInStoragesForApproval = new HashSet<ComInStorage>(
			0);
	private Set<ComInStorage> comInStoragesForKeyboarder = new HashSet<ComInStorage>(
			0);
	private Set<ComOutStorage> comOutStoragesForKeyboarder = new HashSet<ComOutStorage>(
			0);
	private Set<ComOutStorage> comOutStoragesForApproval = new HashSet<ComOutStorage>(
			0);
	private Set<ComOutStorage> comOutStoragesForAgent = new HashSet<ComOutStorage>(
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
			Set<ComInStorage> comInStoragesForAgent,
			Set<ComUserRight> comUserRights,
			Set<ComInStorage> comInStoragesForApproval,
			Set<ComInStorage> comInStoragesForKeyboarder,
			Set<ComOutStorage> comOutStoragesForKeyboarder,
			Set<ComOutStorage> comOutStoragesForApproval,
			Set<ComOutStorage> comOutStoragesForAgent) {
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.comInStoragesForAgent = comInStoragesForAgent;
		this.comUserRights = comUserRights;
		this.comInStoragesForApproval = comInStoragesForApproval;
		this.comInStoragesForKeyboarder = comInStoragesForKeyboarder;
		this.comOutStoragesForKeyboarder = comOutStoragesForKeyboarder;
		this.comOutStoragesForApproval = comOutStoragesForApproval;
		this.comOutStoragesForAgent = comOutStoragesForAgent;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByAgent")
	public Set<ComInStorage> getComInStoragesForAgent() {
		return this.comInStoragesForAgent;
	}

	public void setComInStoragesForAgent(Set<ComInStorage> comInStoragesForAgent) {
		this.comInStoragesForAgent = comInStoragesForAgent;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByApproval")
	public Set<ComOutStorage> getComOutStoragesForApproval() {
		return this.comOutStoragesForApproval;
	}

	public void setComOutStoragesForApproval(
			Set<ComOutStorage> comOutStoragesForApproval) {
		this.comOutStoragesForApproval = comOutStoragesForApproval;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUserByAgent")
	public Set<ComOutStorage> getComOutStoragesForAgent() {
		return this.comOutStoragesForAgent;
	}

	public void setComOutStoragesForAgent(
			Set<ComOutStorage> comOutStoragesForAgent) {
		this.comOutStoragesForAgent = comOutStoragesForAgent;
	}

}