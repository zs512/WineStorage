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
 * ComItem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_item", schema = "dbo", catalog = "WineStorage")
public class ComItem implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String variety;
	private String standard;
	private Integer storage;
	private Integer status;
	private String barcode;
	private Set<ComOutStorage> comOutStorages = new HashSet<ComOutStorage>(0);
	private Set<ComInStorage> comInStorages = new HashSet<ComInStorage>(0);

	// Constructors

	/** default constructor */
	public ComItem() {
	}

	/** minimal constructor */
	public ComItem(String name, String variety, String standard, Integer storage) {
		this.name = name;
		this.variety = variety;
		this.standard = standard;
		this.storage = storage;
	}

	/** full constructor */
	public ComItem(String name, String variety, String standard,
			Integer storage, Integer status, String barcode,
			Set<ComOutStorage> comOutStorages, Set<ComInStorage> comInStorages) {
		this.name = name;
		this.variety = variety;
		this.standard = standard;
		this.storage = storage;
		this.status = status;
		this.barcode = barcode;
		this.comOutStorages = comOutStorages;
		this.comInStorages = comInStorages;
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

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "variety", nullable = false, length = 50)
	public String getVariety() {
		return this.variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Column(name = "standard", nullable = false, length = 50)
	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Column(name = "storage", nullable = false)
	public Integer getStorage() {
		return this.storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "barcode", length = 50)
	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comItem")
	public Set<ComOutStorage> getComOutStorages() {
		return this.comOutStorages;
	}

	public void setComOutStorages(Set<ComOutStorage> comOutStorages) {
		this.comOutStorages = comOutStorages;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comItem")
	public Set<ComInStorage> getComInStorages() {
		return this.comInStorages;
	}

	public void setComInStorages(Set<ComInStorage> comInStorages) {
		this.comInStorages = comInStorages;
	}

}