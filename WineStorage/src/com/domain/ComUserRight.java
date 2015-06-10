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
@Table(name="com_user_right"
    ,schema="dbo"
    ,catalog="WineStorage"
)

public class ComUserRight  implements java.io.Serializable {


    // Fields    

     private String id;
     private ComUser comUser;
     private ComRight comRight;
     private String userId;
     private String rightId;


    // Constructors

    /** default constructor */
    public ComUserRight() {
    }

    
    /** full constructor */
    public ComUserRight(ComUser comUser, ComRight comRight, String userId, String rightId) {
        this.comUser = comUser;
        this.comRight = comRight;
        this.userId = userId;
        this.rightId = rightId;
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
        @JoinColumn(name="id", unique=true, nullable=false, insertable=false, updatable=false)

    public ComUser getComUser() {
        return this.comUser;
    }
    
    public void setComUser(ComUser comUser) {
        this.comUser = comUser;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="id", unique=true, nullable=false, insertable=false, updatable=false)

    public ComRight getComRight() {
        return this.comRight;
    }
    
    public void setComRight(ComRight comRight) {
        this.comRight = comRight;
    }
    
    @Column(name="user_id", nullable=false, length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="right_id", nullable=false, length=32)

    public String getRightId() {
        return this.rightId;
    }
    
    public void setRightId(String rightId) {
        this.rightId = rightId;
    }
   








}