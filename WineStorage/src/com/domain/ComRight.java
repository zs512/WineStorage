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
 * ComRight entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "com_right", schema = "dbo", catalog = "WineStorage")
public class ComRight implements java.io.Serializable {

	// Fields

	private String id;
	private String rightName;
	private String describ;
	private Integer status;
	private Set<ComUserRight> comUserRights = new HashSet<ComUserRight>(0);

	// Constructors

	/** default constructor */
	public ComRight() {
	}

	/** minimal constructor */
	public ComRight(String rightName) {
		this.rightName = rightName;
	}

	/** full constructor */
	public ComRight(String rightName, String describ, Integer status,
			Set<ComUserRight> comUserRights) {
		this.rightName = rightName;
		this.describ = describ;
		this.status = status;
		this.comUserRights = comUserRights;
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

	@Column(name = "right_name", nullable = false, length = 50)
	public String getRightName() {
		return this.rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	@Column(name = "describ", length = 500)
	public String getDescrib() {
		return this.describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "comUser")
	public Set<ComUserRight> getComUserRights() {
		return this.comUserRights;
	}

	public void setComUserRights(Set<ComUserRight> comUserRights) {
		this.comUserRights = comUserRights;
	}

}