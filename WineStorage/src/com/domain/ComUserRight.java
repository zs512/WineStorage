package com.domain;

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
 * ComUserRight entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_user_right", schema = "dbo", catalog = "WineStorage")
public class ComUserRight implements java.io.Serializable {

	// Fields

	private String id;
	private ComUser comUser;
	private ComRight comRight;
	private Integer status;

	// Constructors

	/** default constructor */
	public ComUserRight() {
	}

	/** minimal constructor */
	public ComUserRight(ComUser comUser, ComRight comRight) {
		this.comUser = comUser;
		this.comRight = comRight;
	}

	/** full constructor */
	public ComUserRight(ComUser comUser, ComRight comRight, Integer status) {
		this.comUser = comUser;
		this.comRight = comRight;
		this.status = status;
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
	@JoinColumn(name = "user_id", nullable = false)
	public ComUser getComUser() {
		return this.comUser;
	}

	public void setComUser(ComUser comUser) {
		this.comUser = comUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "right_id", nullable = false)
	public ComRight getComRight() {
		return this.comRight;
	}

	public void setComRight(ComRight comRight) {
		this.comRight = comRight;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}