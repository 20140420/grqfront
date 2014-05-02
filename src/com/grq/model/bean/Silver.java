package com.grq.model.bean;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Silver entity. @author MyEclipse Persistence Tools
 */

public class Silver  implements java.io.Serializable {


    // Fields    

     private Integer silverId;
     private SilverProfit silverProfit;
     private Integer silverTotal;
     private Integer silverDesirable;
     private Integer silverAvailable;
     private Integer silverFrozen;
     private Integer silverRemain;
     private Integer silverInitial;
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public Silver() {
    }

	/** minimal constructor */
    public Silver(SilverProfit silverProfit) {
        this.silverProfit = silverProfit;
    }
    
    /** full constructor */
    public Silver(SilverProfit silverProfit, Integer silverTotal, Integer silverDesirable, Integer silverAvailable, Integer silverFrozen, Integer silverRemain, Integer silverInitial, Set assets) {
        this.silverProfit = silverProfit;
        this.silverTotal = silverTotal;
        this.silverDesirable = silverDesirable;
        this.silverAvailable = silverAvailable;
        this.silverFrozen = silverFrozen;
        this.silverRemain = silverRemain;
        this.silverInitial = silverInitial;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getSilverId() {
        return this.silverId;
    }
    
    public void setSilverId(Integer silverId) {
        this.silverId = silverId;
    }

    public SilverProfit getSilverProfit() {
        return this.silverProfit;
    }
    
    public void setSilverProfit(SilverProfit silverProfit) {
        this.silverProfit = silverProfit;
    }

    public Integer getSilverTotal() {
        return this.silverTotal;
    }
    
    public void setSilverTotal(Integer silverTotal) {
        this.silverTotal = silverTotal;
    }

    public Integer getSilverDesirable() {
        return this.silverDesirable;
    }
    
    public void setSilverDesirable(Integer silverDesirable) {
        this.silverDesirable = silverDesirable;
    }

    public Integer getSilverAvailable() {
        return this.silverAvailable;
    }
    
    public void setSilverAvailable(Integer silverAvailable) {
        this.silverAvailable = silverAvailable;
    }

    public Integer getSilverFrozen() {
        return this.silverFrozen;
    }
    
    public void setSilverFrozen(Integer silverFrozen) {
        this.silverFrozen = silverFrozen;
    }

    public Integer getSilverRemain() {
        return this.silverRemain;
    }
    
    public void setSilverRemain(Integer silverRemain) {
        this.silverRemain = silverRemain;
    }

    public Integer getSilverInitial() {
        return this.silverInitial;
    }
    
    public void setSilverInitial(Integer silverInitial) {
        this.silverInitial = silverInitial;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}