package com.grq.model.bean;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * SilverProfit entity. @author MyEclipse Persistence Tools
 */

public class SilverProfit  implements java.io.Serializable {


    // Fields    

     private Integer silverProfitId;
     private String STotalProfit;
     private String SMouthProfit;
     private String SWeekProfit;
     private String SDayProfit;
     private Set silvers = new HashSet(0);


    // Constructors

    /** default constructor */
    public SilverProfit() {
    }

    
    /** full constructor */
    public SilverProfit(String STotalProfit, String SMouthProfit, String SWeekProfit, String SDayProfit, Set silvers) {
        this.STotalProfit = STotalProfit;
        this.SMouthProfit = SMouthProfit;
        this.SWeekProfit = SWeekProfit;
        this.SDayProfit = SDayProfit;
        this.silvers = silvers;
    }

   
    // Property accessors

    public Integer getSilverProfitId() {
        return this.silverProfitId;
    }
    
    public void setSilverProfitId(Integer silverProfitId) {
        this.silverProfitId = silverProfitId;
    }

    public String getSTotalProfit() {
        return this.STotalProfit;
    }
    
    public void setSTotalProfit(String STotalProfit) {
        this.STotalProfit = STotalProfit;
    }

    public String getSMouthProfit() {
        return this.SMouthProfit;
    }
    
    public void setSMouthProfit(String SMouthProfit) {
        this.SMouthProfit = SMouthProfit;
    }

    public String getSWeekProfit() {
        return this.SWeekProfit;
    }
    
    public void setSWeekProfit(String SWeekProfit) {
        this.SWeekProfit = SWeekProfit;
    }

    public String getSDayProfit() {
        return this.SDayProfit;
    }
    
    public void setSDayProfit(String SDayProfit) {
        this.SDayProfit = SDayProfit;
    }

    public Set getSilvers() {
        return this.silvers;
    }
    
    public void setSilvers(Set silvers) {
        this.silvers = silvers;
    }
   








}