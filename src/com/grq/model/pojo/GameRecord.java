package com.grq.model.pojo;
// default package

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * GameRecord entity. @author MyEclipse Persistence Tools
 */

public class GameRecord  implements java.io.Serializable {


    // Fields    

     private Integer gameRecordId;
     private Integer playerId;
     private Integer prizeId;
     private Integer dayGameNumber;
     private Timestamp startTime;
     private Timestamp endTime;
     private Integer lastDividend;
     private Integer currentDividend;
     private Integer commission;
     private Integer totalBonus;
     private Integer totalChip;
     private Integer bird;
     private Integer beast;
     private Integer goldShark;
     private Integer silverShark;
     private Integer bomb;
     private Integer swallow;
     private Integer pigeon;
     private Integer peafowl;
     private Integer eagle;
     private Integer lion;
     private Integer panda;
     private Integer monkey;
     private Integer rabbit;
     private Set tbGames = new HashSet(0);


    // Constructors

    /** default constructor */
    public GameRecord() {
    }

	/** minimal constructor */
    public GameRecord(Integer playerId, Integer prizeId, Integer dayGameNumber, Timestamp startTime, Timestamp endTime, Integer lastDividend, Integer currentDividend, Integer commission, Integer totalBonus, Integer totalChip, Integer bird, Integer beast, Integer goldShark, Integer silverShark, Integer bomb, Integer swallow, Integer pigeon, Integer peafowl, Integer eagle, Integer lion, Integer panda, Integer monkey, Integer rabbit) {
        this.playerId = playerId;
        this.prizeId = prizeId;
        this.dayGameNumber = dayGameNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastDividend = lastDividend;
        this.currentDividend = currentDividend;
        this.commission = commission;
        this.totalBonus = totalBonus;
        this.totalChip = totalChip;
        this.bird = bird;
        this.beast = beast;
        this.goldShark = goldShark;
        this.silverShark = silverShark;
        this.bomb = bomb;
        this.swallow = swallow;
        this.pigeon = pigeon;
        this.peafowl = peafowl;
        this.eagle = eagle;
        this.lion = lion;
        this.panda = panda;
        this.monkey = monkey;
        this.rabbit = rabbit;
    }
    
    /** full constructor */
    public GameRecord(Integer playerId, Integer prizeId, Integer dayGameNumber, Timestamp startTime, Timestamp endTime, Integer lastDividend, Integer currentDividend, Integer commission, Integer totalBonus, Integer totalChip, Integer bird, Integer beast, Integer goldShark, Integer silverShark, Integer bomb, Integer swallow, Integer pigeon, Integer peafowl, Integer eagle, Integer lion, Integer panda, Integer monkey, Integer rabbit, Set tbGames) {
        this.playerId = playerId;
        this.prizeId = prizeId;
        this.dayGameNumber = dayGameNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastDividend = lastDividend;
        this.currentDividend = currentDividend;
        this.commission = commission;
        this.totalBonus = totalBonus;
        this.totalChip = totalChip;
        this.bird = bird;
        this.beast = beast;
        this.goldShark = goldShark;
        this.silverShark = silverShark;
        this.bomb = bomb;
        this.swallow = swallow;
        this.pigeon = pigeon;
        this.peafowl = peafowl;
        this.eagle = eagle;
        this.lion = lion;
        this.panda = panda;
        this.monkey = monkey;
        this.rabbit = rabbit;
        this.tbGames = tbGames;
    }

   
    // Property accessors

    public Integer getGameRecordId() {
        return this.gameRecordId;
    }
    
    public void setGameRecordId(Integer gameRecordId) {
        this.gameRecordId = gameRecordId;
    }

    public Integer getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPrizeId() {
        return this.prizeId;
    }
    
    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public Integer getDayGameNumber() {
        return this.dayGameNumber;
    }
    
    public void setDayGameNumber(Integer dayGameNumber) {
        this.dayGameNumber = dayGameNumber;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getLastDividend() {
        return this.lastDividend;
    }
    
    public void setLastDividend(Integer lastDividend) {
        this.lastDividend = lastDividend;
    }

    public Integer getCurrentDividend() {
        return this.currentDividend;
    }
    
    public void setCurrentDividend(Integer currentDividend) {
        this.currentDividend = currentDividend;
    }

    public Integer getCommission() {
        return this.commission;
    }
    
    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getTotalBonus() {
        return this.totalBonus;
    }
    
    public void setTotalBonus(Integer totalBonus) {
        this.totalBonus = totalBonus;
    }

    public Integer getTotalChip() {
        return this.totalChip;
    }
    
    public void setTotalChip(Integer totalChip) {
        this.totalChip = totalChip;
    }

    public Integer getBird() {
        return this.bird;
    }
    
    public void setBird(Integer bird) {
        this.bird = bird;
    }

    public Integer getBeast() {
        return this.beast;
    }
    
    public void setBeast(Integer beast) {
        this.beast = beast;
    }

    public Integer getGoldShark() {
        return this.goldShark;
    }
    
    public void setGoldShark(Integer goldShark) {
        this.goldShark = goldShark;
    }

    public Integer getSilverShark() {
        return this.silverShark;
    }
    
    public void setSilverShark(Integer silverShark) {
        this.silverShark = silverShark;
    }

    public Integer getBomb() {
        return this.bomb;
    }
    
    public void setBomb(Integer bomb) {
        this.bomb = bomb;
    }

    public Integer getSwallow() {
        return this.swallow;
    }
    
    public void setSwallow(Integer swallow) {
        this.swallow = swallow;
    }

    public Integer getPigeon() {
        return this.pigeon;
    }
    
    public void setPigeon(Integer pigeon) {
        this.pigeon = pigeon;
    }

    public Integer getPeafowl() {
        return this.peafowl;
    }
    
    public void setPeafowl(Integer peafowl) {
        this.peafowl = peafowl;
    }

    public Integer getEagle() {
        return this.eagle;
    }
    
    public void setEagle(Integer eagle) {
        this.eagle = eagle;
    }

    public Integer getLion() {
        return this.lion;
    }
    
    public void setLion(Integer lion) {
        this.lion = lion;
    }

    public Integer getPanda() {
        return this.panda;
    }
    
    public void setPanda(Integer panda) {
        this.panda = panda;
    }

    public Integer getMonkey() {
        return this.monkey;
    }
    
    public void setMonkey(Integer monkey) {
        this.monkey = monkey;
    }

    public Integer getRabbit() {
        return this.rabbit;
    }
    
    public void setRabbit(Integer rabbit) {
        this.rabbit = rabbit;
    }

    public Set getTbGames() {
        return this.tbGames;
    }
    
    public void setTbGames(Set tbGames) {
        this.tbGames = tbGames;
    }
   








}