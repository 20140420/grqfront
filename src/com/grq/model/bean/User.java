package com.grq.model.bean;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private Employee employee;
     private Asset asset;
     private UOnline UOnline;
     private Player player;
     private String email;
     private String password;
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Employee employee, Asset asset, UOnline UOnline, Player player, String email, String password) {
        this.employee = employee;
        this.asset = asset;
        this.UOnline = UOnline;
        this.player = player;
        this.email = email;
        this.password = password;
    }
    
    /** full constructor */
    public User(Employee employee, Asset asset, UOnline UOnline, Player player, String email, String password, Set assets) {
        this.employee = employee;
        this.asset = asset;
        this.UOnline = UOnline;
        this.player = player;
        this.email = email;
        this.password = password;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public UOnline getUOnline() {
        return this.UOnline;
    }
    
    public void setUOnline(UOnline UOnline) {
        this.UOnline = UOnline;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}