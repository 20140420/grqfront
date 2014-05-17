package com.grq.model.pojo;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Apprentice entity. @author MyEclipse Persistence Tools
 */

public class Apprentice  implements java.io.Serializable {


    // Fields    

     private Integer apprenticeId;
     private Date beginTeachDate;
     private Date finishTeachDate;
     private String apprenticeNick;
     private Integer apprenticePlayerId;
     private Set tbPlayers = new HashSet(0);


    // Constructors

    /** default constructor */
    public Apprentice() {
    }

	/** minimal constructor */
    public Apprentice(String apprenticeNick, Integer apprenticePlayerId) {
        this.apprenticeNick = apprenticeNick;
        this.apprenticePlayerId = apprenticePlayerId;
    }
    
    /** full constructor */
    public Apprentice(Date beginTeachDate, Date finishTeachDate, String apprenticeNick, Integer apprenticePlayerId, Set tbPlayers) {
        this.beginTeachDate = beginTeachDate;
        this.finishTeachDate = finishTeachDate;
        this.apprenticeNick = apprenticeNick;
        this.apprenticePlayerId = apprenticePlayerId;
        this.tbPlayers = tbPlayers;
    }

   
    // Property accessors

    public Integer getApprenticeId() {
        return this.apprenticeId;
    }
    
    public void setApprenticeId(Integer apprenticeId) {
        this.apprenticeId = apprenticeId;
    }

    public Date getBeginTeachDate() {
        return this.beginTeachDate;
    }
    
    public void setBeginTeachDate(Date beginTeachDate) {
        this.beginTeachDate = beginTeachDate;
    }

    public Date getFinishTeachDate() {
        return this.finishTeachDate;
    }
    
    public void setFinishTeachDate(Date finishTeachDate) {
        this.finishTeachDate = finishTeachDate;
    }

    public String getApprenticeNick() {
        return this.apprenticeNick;
    }
    
    public void setApprenticeNick(String apprenticeNick) {
        this.apprenticeNick = apprenticeNick;
    }

    public Integer getApprenticePlayerId() {
        return this.apprenticePlayerId;
    }
    
    public void setApprenticePlayerId(Integer apprenticePlayerId) {
        this.apprenticePlayerId = apprenticePlayerId;
    }

    public Set getTbPlayers() {
        return this.tbPlayers;
    }
    
    public void setTbPlayers(Set tbPlayers) {
        this.tbPlayers = tbPlayers;
    }
   








}