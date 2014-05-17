package com.grq.model.pojo;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * PowerConfig entity. @author MyEclipse Persistence Tools
 */

public class PowerConfig  implements java.io.Serializable {


    // Fields    

     private Integer powerConfigId;
     private Boolean webConfig;
     private Boolean userConfig;
     private Boolean assetConfig;
     private Boolean operateConfig;
     private Set employees = new HashSet(0);


    // Constructors

    /** default constructor */
    public PowerConfig() {
    }

	/** minimal constructor */
    public PowerConfig(Boolean webConfig, Boolean userConfig, Boolean assetConfig, Boolean operateConfig) {
        this.webConfig = webConfig;
        this.userConfig = userConfig;
        this.assetConfig = assetConfig;
        this.operateConfig = operateConfig;
    }
    
    /** full constructor */
    public PowerConfig(Boolean webConfig, Boolean userConfig, Boolean assetConfig, Boolean operateConfig, Set employees) {
        this.webConfig = webConfig;
        this.userConfig = userConfig;
        this.assetConfig = assetConfig;
        this.operateConfig = operateConfig;
        this.employees = employees;
    }

   
    // Property accessors

    public Integer getPowerConfigId() {
        return this.powerConfigId;
    }
    
    public void setPowerConfigId(Integer powerConfigId) {
        this.powerConfigId = powerConfigId;
    }

    public Boolean getWebConfig() {
        return this.webConfig;
    }
    
    public void setWebConfig(Boolean webConfig) {
        this.webConfig = webConfig;
    }

    public Boolean getUserConfig() {
        return this.userConfig;
    }
    
    public void setUserConfig(Boolean userConfig) {
        this.userConfig = userConfig;
    }

    public Boolean getAssetConfig() {
        return this.assetConfig;
    }
    
    public void setAssetConfig(Boolean assetConfig) {
        this.assetConfig = assetConfig;
    }

    public Boolean getOperateConfig() {
        return this.operateConfig;
    }
    
    public void setOperateConfig(Boolean operateConfig) {
        this.operateConfig = operateConfig;
    }

    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }
   








}