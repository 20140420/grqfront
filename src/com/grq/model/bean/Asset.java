package com.grq.model.bean;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset  implements java.io.Serializable {


    // Fields    

     private Integer assetId;
     private User user;
     private Silver silver;
     private RMB RMB;
     private Integer giroConfigId;
     private Integer giroRecordId;
     private Double totalAsset;
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Asset() {
    }

	/** minimal constructor */
    public Asset(User user, Silver silver, RMB RMB, Integer giroConfigId, Integer giroRecordId) {
        this.user = user;
        this.silver = silver;
        this.RMB = RMB;
        this.giroConfigId = giroConfigId;
        this.giroRecordId = giroRecordId;
    }
    
    /** full constructor */
    public Asset(User user, Silver silver, RMB RMB, Integer giroConfigId, Integer giroRecordId, Double totalAsset, Set users) {
        this.user = user;
        this.silver = silver;
        this.RMB = RMB;
        this.giroConfigId = giroConfigId;
        this.giroRecordId = giroRecordId;
        this.totalAsset = totalAsset;
        this.users = users;
    }

   
    // Property accessors

    public Integer getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Silver getSilver() {
        return this.silver;
    }
    
    public void setSilver(Silver silver) {
        this.silver = silver;
    }

    public RMB getRMB() {
        return this.RMB;
    }
    
    public void setRMB(RMB RMB) {
        this.RMB = RMB;
    }

    public Integer getGiroConfigId() {
        return this.giroConfigId;
    }
    
    public void setGiroConfigId(Integer giroConfigId) {
        this.giroConfigId = giroConfigId;
    }

    public Integer getGiroRecordId() {
        return this.giroRecordId;
    }
    
    public void setGiroRecordId(Integer giroRecordId) {
        this.giroRecordId = giroRecordId;
    }

    public Double getTotalAsset() {
        return this.totalAsset;
    }
    
    public void setTotalAsset(Double totalAsset) {
        this.totalAsset = totalAsset;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}