package com.grq.model.bean;
// default package

import com.grq.model.bean.Prize;


/**
 * Game entity. @author MyEclipse Persistence Tools
 */

public class Game  implements java.io.Serializable {


    // Fields    

     private Integer gameId;
     private Prize Prize;
     private GameRecord gameRecord;
     private GameConfig gameConfig;
     private String gameName;
     private Integer gameType;


    // Constructors

    /** default constructor */
    public Game() {
    }

	/** minimal constructor */
    public Game(GameRecord gameRecord, GameConfig gameConfig, String gameName, Integer gameType) {
        this.gameRecord = gameRecord;
        this.gameConfig = gameConfig;
        this.gameName = gameName;
        this.gameType = gameType;
    }
    
    /** full constructor */
    public Game(Prize Prize, GameRecord gameRecord, GameConfig gameConfig, String gameName, Integer gameType) {
        this.Prize = Prize;
        this.gameRecord = gameRecord;
        this.gameConfig = gameConfig;
        this.gameName = gameName;
        this.gameType = gameType;
    }

   
    // Property accessors

    public Integer getGameId() {
        return this.gameId;
    }
    
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Prize getTbPrize() {
        return this.Prize;
    }
    
    public void setTbPrize(Prize Prize) {
        this.Prize = Prize;
    }

    public GameRecord getGameRecord() {
        return this.gameRecord;
    }
    
    public void setGameRecord(GameRecord gameRecord) {
        this.gameRecord = gameRecord;
    }

    public GameConfig getGameConfig() {
        return this.gameConfig;
    }
    
    public void setGameConfig(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }

    public String getGameName() {
        return this.gameName;
    }
    
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getGameType() {
        return this.gameType;
    }
    
    public void setGameType(Integer gameType) {
        this.gameType = gameType;
    }
   








}