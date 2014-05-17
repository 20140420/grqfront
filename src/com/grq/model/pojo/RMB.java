package com.grq.model.pojo;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * RMB entity. @author MyEclipse Persistence Tools
 */

public class RMB  implements java.io.Serializable {


    // Fields    

     private Integer rmbId;
     private Double rmbTotal;
     private Double rmbDesirable;
     private Double rmbAvailable;
     private Double rmbFrozen;
     private Double rmbRemain;
     private Double rmbInvest;
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public RMB() {
    }

    
    /** full constructor */
    public RMB(Double rmbTotal, Double rmbDesirable, Double rmbAvailable, Double rmbFrozen, Double rmbRemain, Double rmbInvest, Set assets) {
        this.rmbTotal = rmbTotal;
        this.rmbDesirable = rmbDesirable;
        this.rmbAvailable = rmbAvailable;
        this.rmbFrozen = rmbFrozen;
        this.rmbRemain = rmbRemain;
        this.rmbInvest = rmbInvest;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getRmbId() {
        return this.rmbId;
    }
    
    public void setRmbId(Integer rmbId) {
        this.rmbId = rmbId;
    }

    public Double getRmbTotal() {
        return this.rmbTotal;
    }
    
    public void setRmbTotal(Double rmbTotal) {
        this.rmbTotal = rmbTotal;
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

    public Double getRmbFrozen() {
        return this.rmbFrozen;
    }
    
    public void setRmbFrozen(Double rmbFrozen) {
        this.rmbFrozen = rmbFrozen;
    }

    public Double getRmbRemain() {
        return this.rmbRemain;
    }
    
    public void setRmbRemain(Double rmbRemain) {
        this.rmbRemain = rmbRemain;
    }

    public Double getRmbInvest() {
        return this.rmbInvest;
    }
    
    public void setRmbInvest(Double rmbInvest) {
        this.rmbInvest = rmbInvest;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}