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
 * ComApprovalOutStorage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_approval_outStorage", schema = "dbo", catalog = "WineStorage")
public class ComApprovalOutStorage implements java.io.Serializable {

	// Fields

	private String id;
	private ComUser comUser;
	private ComOutStorage comOutStorage;
	private Timestamp datetime;
	private Integer result;

	// Constructors

	/** default constructor */
	public ComApprovalOutStorage() {
	}

	/** full constructor */
	public ComApprovalOutStorage(ComUser comUser, ComOutStorage comOutStorage,
			Timestamp datetime, Integer result) {
		this.comUser = comUser;
		this.comOutStorage = comOutStorage;
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
	@JoinColumn(name = "outStorage", nullable = false)
	public ComOutStorage getComOutStorage() {
		return this.comOutStorage;
	}

	public void setComOutStorage(ComOutStorage comOutStorage) {
		this.comOutStorage = comOutStorage;
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