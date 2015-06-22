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
 * ComApprovalInStorage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_approval_inStorage", schema = "dbo", catalog = "WineStorage")
public class ComApprovalInStorage implements java.io.Serializable {

	// Fields

	private String id;
	private ComUser comUser;
	private ComInStorage comInStorage;
	private Timestamp datetime;
	private Integer result;

	// Constructors

	/** default constructor */
	public ComApprovalInStorage() {
	}

	/** full constructor */
	public ComApprovalInStorage(ComUser comUser, ComInStorage comInStorage,
			Timestamp datetime, Integer result) {
		this.comUser = comUser;
		this.comInStorage = comInStorage;
		this.datetime = datetime;
		this.result = result;
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
	@JoinColumn(name = "approval", nullable = false)
	public ComUser getComUser() {
		return this.comUser;
	}

	public void setComUser(ComUser comUser) {
		this.comUser = comUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inStorage", nullable = false)
	public ComInStorage getComInStorage() {
		return this.comInStorage;
	}

	public void setComInStorage(ComInStorage comInStorage) {
		this.comInStorage = comInStorage;
	}

	@Column(name = "datetime", nullable = false, length = 23)
	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	@Column(name = "result", nullable = false)
	public Integer getResult() {
		return this.result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

}