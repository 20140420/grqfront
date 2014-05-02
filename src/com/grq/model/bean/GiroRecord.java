package com.grq.model.bean;
// default package

import java.sql.Timestamp;


/**
 * GiroRecord entity. @author MyEclipse Persistence Tools
 */

public class GiroRecord  implements java.io.Serializable {


    // Fields    

     private Integer giroRecordId;
     private Timestamp giroTime;
     private Double giroValue;
     private Double rmbDesirable;
     private Double rmbAvailable;
     private Integer silverDesirable;
     private Integer giroGiver;
     private Integer giroTaker;
     private String giroExplain;
     private Integer giroType;
     private Boolean giroState;


    // Constructors

    /** default constructor */
    public GiroRecord() {
    }

    
    /** full constructor */
    public GiroRecord(Timestamp giroTime, Double giroValue, Double rmbDesirable, Double rmbAvailable, Integer silverDesirable, Integer giroGiver, Integer giroTaker, String giroExplain, Integer giroType, Boolean giroState) {
        this.giroTime = giroTime;
        this.giroValue = giroValue;
        this.rmbDesirable = rmbDesirable;
        this.rmbAvailable = rmbAvailable;
        this.silverDesirable = silverDesirable;
        this.giroGiver = giroGiver;
        this.giroTaker = giroTaker;
        this.giroExplain = giroExplain;
        this.giroType = giroType;
        this.giroState = giroState;
    }

   
    // Property accessors

    public Integer getGiroRecordId() {
        return this.giroRecordId;
    }
    
    public void setGiroRecordId(Integer giroRecordId) {
        this.giroRecordId = giroRecordId;
    }

    public Timestamp getGiroTime() {
        return this.giroTime;
    }
    
    public void setGiroTime(Timestamp giroTime) {
        this.giroTime = giroTime;
    }

    public Double getGiroValue() {
        return this.giroValue;
    }
    
    public void setGiroValue(Double giroValue) {
        this.giroValue = giroValue;
    }

    public Double getRmbDesirable() {
        return this.rmbDesirable;
    }
    
    public void setRmbDesirable(Double rmbDesirable) {
        this.rmbDesirable = rmbDesirable;
    }

    public Double getRmbAvailable() {
        return this.rmbAvailable;
    }
    
    public void setRmbAvailable(Double rmbAvailable) {
        this.rmbAvailable = rmbAvailable;
    }

    public Integer getSilverDesirable() {
        return this.silverDesirable;
    }
    
    public void setSilverDesirable(Integer silverDesirable) {
        this.silverDesirable = silverDesirable;
    }

    public Integer getGiroGiver() {
        return this.giroGiver;
    }
    
    public void setGiroGiver(Integer giroGiver) {
        this.giroGiver = giroGiver;
    }

    public Integer getGiroTaker() {
        return this.giroTaker;
    }
    
    public void setGiroTaker(Integer giroTaker) {
        this.giroTaker = giroTaker;
    }

    public String getGiroExplain() {
        return this.giroExplain;
    }
    
    public void setGiroExplain(String giroExplain) {
        this.giroExplain = giroExplain;
    }

    public Integer getGiroType() {
        return this.giroType;
    }
    
    public void setGiroType(Integer giroType) {
        this.giroType = giroType;
    }

    public Boolean getGiroState() {
        return this.giroState;
    }
    
    public void setGiroState(Boolean giroState) {
        this.giroState = giroState;
    }
   








}