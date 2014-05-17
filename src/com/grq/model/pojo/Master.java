package com.grq.model.pojo;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Master entity. @author MyEclipse Persistence Tools
 */

public class Master  implements java.io.Serializable {


    // Fields    

     private Integer masterId;
     private Date beginStudyDate;
     private Date finishStudyDate;
     private String masterNick;
     private Integer masterPlayerId;
     private Set tbPlayers = new HashSet(0);


    // Constructors

    /** default constructor */
    public Master() {
    }

	/** minimal constructor */
    public Master(String masterNick, Integer masterPlayerId) {
        this.masterNick = masterNick;
        this.masterPlayerId = masterPlayerId;
    }
    
    /** full constructor */
    public Master(Date beginStudyDate, Date finishStudyDate, String masterNick, Integer masterPlayerId, Set tbPlayers) {
        this.beginStudyDate = beginStudyDate;
        this.finishStudyDate = finishStudyDate;
        this.masterNick = masterNick;
        this.masterPlayerId = masterPlayerId;
        this.tbPlayers = tbPlayers;
    }

   
    // Property accessors

    public Integer getMasterId() {
        return this.masterId;
    }
    
    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Date getBeginStudyDate() {
        return this.beginStudyDate;
    }
    
    public void setBeginStudyDate(Date beginStudyDate) {
        this.beginStudyDate = beginStudyDate;
    }

    public Date getFinishStudyDate() {
        return this.finishStudyDate;
    }
    
    public void setFinishStudyDate(Date finishStudyDate) {
        this.finishStudyDate = finishStudyDate;
    }

    public String getMasterNick() {
        return this.masterNick;
    }
    
    public void setMasterNick(String masterNick) {
        this.masterNick = masterNick;
    }

    public Integer getMasterPlayerId() {
        return this.masterPlayerId;
    }
    
    public void setMasterPlayerId(Integer masterPlayerId) {
        this.masterPlayerId = masterPlayerId;
    }

    public Set getTbPlayers() {
        return this.tbPlayers;
    }
    
    public void setTbPlayers(Set tbPlayers) {
        this.tbPlayers = tbPlayers;
    }
   








}