package com.grq.model.bean;
// default package



/**
 * GiroConfig entity. @author MyEclipse Persistence Tools
 */

public class GiroConfig  implements java.io.Serializable {


    // Fields    

     private Integer giroConfigId;
     private Integer convertBaseLimit;
     private String convertLimitRate;
     private String convertAddRate;
     private String cashDeductRate;
     private Integer cashTotalLimit;
     private Integer cashSingleLimit;


    // Constructors

    /** default constructor */
    public GiroConfig() {
    }

    
    /** full constructor */
    public GiroConfig(Integer convertBaseLimit, String convertLimitRate, String convertAddRate, String cashDeductRate, Integer cashTotalLimit, Integer cashSingleLimit) {
        this.convertBaseLimit = convertBaseLimit;
        this.convertLimitRate = convertLimitRate;
        this.convertAddRate = convertAddRate;
        this.cashDeductRate = cashDeductRate;
        this.cashTotalLimit = cashTotalLimit;
        this.cashSingleLimit = cashSingleLimit;
    }

   
    // Property accessors

    public Integer getGiroConfigId() {
        return this.giroConfigId;
    }
    
    public void setGiroConfigId(Integer giroConfigId) {
        this.giroConfigId = giroConfigId;
    }

    public Integer getConvertBaseLimit() {
        return this.convertBaseLimit;
    }
    
    public void setConvertBaseLimit(Integer convertBaseLimit) {
        this.convertBaseLimit = convertBaseLimit;
    }

    public String getConvertLimitRate() {
        return this.convertLimitRate;
    }
    
    public void setConvertLimitRate(String convertLimitRate) {
        this.convertLimitRate = convertLimitRate;
    }

    public String getConvertAddRate() {
        return this.convertAddRate;
    }
    
    public void setConvertAddRate(String convertAddRate) {
        this.convertAddRate = convertAddRate;
    }

    public String getCashDeductRate() {
        return this.cashDeductRate;
    }
    
    public void setCashDeductRate(String cashDeductRate) {
        this.cashDeductRate = cashDeductRate;
    }

    public Integer getCashTotalLimit() {
        return this.cashTotalLimit;
    }
    
    public void setCashTotalLimit(Integer cashTotalLimit) {
        this.cashTotalLimit = cashTotalLimit;
    }

    public Integer getCashSingleLimit() {
        return this.cashSingleLimit;
    }
    
    public void setCashSingleLimit(Integer cashSingleLimit) {
        this.cashSingleLimit = cashSingleLimit;
    }
   








}