package com.grq.model.pojo;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * UOnline entity. @author MyEclipse Persistence Tools
 */

public class UOnline  implements java.io.Serializable {


    // Fields    

     private Integer UOnlineId;
     private String nickname;
     private String headPic;
     private Integer totalSilver;
     private Integer gameNumber;
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public UOnline() {
    }

    
    /** full constructor */
    public UOnline(String nickname, String headPic, Integer totalSilver, Integer gameNumber, Set users) {
        this.nickname = nickname;
        this.headPic = headPic;
        this.totalSilver = totalSilver;
        this.gameNumber = gameNumber;
        this.users = users;
    }

   
    // Property accessors

    public Integer getUOnlineId() {
        return this.UOnlineId;
    }
    
    public void setUOnlineId(Integer UOnlineId) {
        this.UOnlineId = UOnlineId;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadPic() {
        return this.headPic;
    }
    
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Integer getTotalSilver() {
        return this.totalSilver;
    }
    
    public void setTotalSilver(Integer totalSilver) {
        this.totalSilver = totalSilver;
    }

    public Integer getGameNumber() {
        return this.gameNumber;
    }
    
    public void setGameNumber(Integer gameNumber) {
        this.gameNumber = gameNumber;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}