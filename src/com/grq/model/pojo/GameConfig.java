package com.grq.model.pojo;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * GameConfig entity. @author MyEclipse Persistence Tools
 */

public class GameConfig  implements java.io.Serializable {


    // Fields    

     private Integer gameConfigId;
     private Integer initialDividend;
     private Integer observeLength;
     private Integer betLength;
     private Integer displayLength;
     private Integer waitLength;
     private Integer turnNumber;
     private Integer maximalTimes;
     private Double commissionRate;
     private Integer betLimit;
     private Integer singleBet;
     private Set tbGames = new HashSet(0);


    // Constructors

    /** default constructor */
    public GameConfig() {
    }

	/** minimal constructor */
    public GameConfig(Integer initialDividend, Integer observeLength, Integer betLength, Integer displayLength, Integer waitLength, Integer turnNumber, Integer maximalTimes, Double commissionRate, Integer betLimit, Integer singleBet) {
        this.initialDividend = initialDividend;
        this.observeLength = observeLength;
        this.betLength = betLength;
        this.displayLength = displayLength;
        this.waitLength = waitLength;
        this.turnNumber = turnNumber;
        this.maximalTimes = maximalTimes;
        this.commissionRate = commissionRate;
        this.betLimit = betLimit;
        this.singleBet = singleBet;
    }
    
    /** full constructor */
    public GameConfig(Integer initialDividend, Integer observeLength, Integer betLength, Integer displayLength, Integer waitLength, Integer turnNumber, Integer maximalTimes, Double commissionRate, Integer betLimit, Integer singleBet, Set tbGames) {
        this.initialDividend = initialDividend;
        this.observeLength = observeLength;
        this.betLength = betLength;
        this.displayLength = displayLength;
        this.waitLength = waitLength;
        this.turnNumber = turnNumber;
        this.maximalTimes = maximalTimes;
        this.commissionRate = commissionRate;
        this.betLimit = betLimit;
        this.singleBet = singleBet;
        this.tbGames = tbGames;
    }

   
    // Property accessors

    public Integer getGameConfigId() {
        return this.gameConfigId;
    }
    
    public void setGameConfigId(Integer gameConfigId) {
        this.gameConfigId = gameConfigId;
    }

    public Integer getInitialDividend() {
        return this.initialDividend;
    }
    
    public void setInitialDividend(Integer initialDividend) {
        this.initialDividend = initialDividend;
    }

    public Integer getObserveLength() {
        return this.observeLength;
    }
    
    public void setObserveLength(Integer observeLength) {
        this.observeLength = observeLength;
    }

    public Integer getBetLength() {
        return this.betLength;
    }
    
    public void setBetLength(Integer betLength) {
        this.betLength = betLength;
    }

    public Integer getDisplayLength() {
        return this.displayLength;
    }
    
    public void setDisplayLength(Integer displayLength) {
        this.displayLength = displayLength;
    }

    public Integer getWaitLength() {
        return this.waitLength;
    }
    
    public void setWaitLength(Integer waitLength) {
        this.waitLength = waitLength;
    }

    public Integer getTurnNumber() {
        return this.turnNumber;
    }
    
    public void setTurnNumber(Integer turnNumber) {
        this.turnNumber = turnNumber;
    }

    public Integer getMaximalTimes() {
        return this.maximalTimes;
    }
    
    public void setMaximalTimes(Integer maximalTimes) {
        this.maximalTimes = maximalTimes;
    }

    public Double getCommissionRate() {
        return this.commissionRate;
    }
    
    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getBetLimit() {
        return this.betLimit;
    }
    
    public void setBetLimit(Integer betLimit) {
        this.betLimit = betLimit;
    }

    public Integer getSingleBet() {
        return this.singleBet;
    }
    
    public void setSingleBet(Integer singleBet) {
        this.singleBet = singleBet;
    }

    public Set getTbGames() {
        return this.tbGames;
    }
    
    public void setTbGames(Set tbGames) {
        this.tbGames = tbGames;
    }
   








}