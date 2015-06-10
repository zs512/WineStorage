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
@Table(name="com_item"
    ,schema="dbo"
    ,catalog="WineStorage"
)

public class ComItem  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String variety;
     private byte[] standard;
     private Integer sotrage;
     private Set<ComOutStorage> comOutStorages = new HashSet<ComOutStorage>(0);
     private Set<ComInStorage> comInStorages = new HashSet<ComInStorage>(0);


    // Constructors

    /** default constructor */
    public ComItem() {
    }

	/** minimal constructor */
    public ComItem(String name, Integer sotrage) {
        this.name = name;
        this.sotrage = sotrage;
    }
    
    /** full constructor */
    public ComItem(String name, String variety, byte[] standard, Integer sotrage, Set<ComOutStorage> comOutStorages, Set<ComInStorage> comInStorages) {
        this.name = name;
        this.variety = variety;
        this.standard = standard;
        this.sotrage = sotrage;
        this.comOutStorages = comOutStorages;
        this.comInStorages = comInStorages;
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
    
    @Column(name="name", nullable=false, length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="variety", length=50)

    public String getVariety() {
        return this.variety;
    }
    
    public void setVariety(String variety) {
        this.variety = variety;
    }
    
    @Column(name="standard")

    public byte[] getStandard() {
        return this.standard;
    }
    
    public void setStandard(byte[] standard) {
        this.standard = standard;
    }
    
    @Column(name="sotrage", nullable=false)

    public Integer getSotrage() {
        return this.sotrage;
    }
    
    public void setSotrage(Integer sotrage) {
        this.sotrage = sotrage;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="comItem")

    public Set<ComOutStorage> getComOutStorages() {
        return this.comOutStorages;
    }
    
    public void setComOutStorages(Set<ComOutStorage> comOutStorages) {
        this.comOutStorages = comOutStorages;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="comItem")

    public Set<ComInStorage> getComInStorages() {
        return this.comInStorages;
    }
    
    public void setComInStorages(Set<ComInStorage> comInStorages) {
        this.comInStorages = comInStorages;
    }
   








}