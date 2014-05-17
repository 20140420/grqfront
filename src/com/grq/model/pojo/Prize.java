package com.grq.model.pojo;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Prize entity. @author MyEclipse Persistence Tools
 */

public class Prize  implements java.io.Serializable {


    // Fields    

     private Integer prizeId;
     private String prizeName;
     private Integer prizeTimes;
     private String prizeProbability;
     private Integer addition;
     private Set games = new HashSet(0);


    // Constructors

    /** default constructor */
    public Prize() {
    }

	/** minimal constructor */
    public Prize(String prizeName, Integer prizeTimes, String prizeProbability, Integer addition) {
        this.prizeName = prizeName;
        this.prizeTimes = prizeTimes;
        this.prizeProbability = prizeProbability;
        this.addition = addition;
    }
    
    /** full constructor */
    public Prize(String prizeName, Integer prizeTimes, String prizeProbability, Integer addition, Set games) {
        this.prizeName = prizeName;
        this.prizeTimes = prizeTimes;
        this.prizeProbability = prizeProbability;
        this.addition = addition;
        this.games = games;
    }

   
    // Property accessors

    public Integer getPrizeId() {
        return this.prizeId;
    }
    
    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeName() {
        return this.prizeName;
    }
    
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public Integer getPrizeTimes() {
        return this.prizeTimes;
    }
    
    public void setPrizeTimes(Integer prizeTimes) {
        this.prizeTimes = prizeTimes;
    }

    public String getPrizeProbability() {
        return this.prizeProbability;
    }
    
    public void setPrizeProbability(String prizeProbability) {
        this.prizeProbability = prizeProbability;
    }

    public Integer getAddition() {
        return this.addition;
    }
    
    public void setAddition(Integer addition) {
        this.addition = addition;
    }

    public Set getGames() {
        return this.games;
    }
    
    public void setGames(Set games) {
        this.games = games;
    }
   








}