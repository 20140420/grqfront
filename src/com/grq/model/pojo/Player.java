package com.grq.model.pojo;
// default package

import com.grq.model.pojo.Security;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Player entity. @author MyEclipse Persistence Tools
 */

public class Player  implements java.io.Serializable {


    // Fields    

     private Integer playerId;
     private Master master;
     private Apprentice apprentice;
     private Security Security;
     private String firstName;
     private String lastName;
     private String formerName;
     private String nickname;
     private String sex;
     private Integer age;
     private Date birthday;
     private String email;
     private Long telephone;
     private Integer qq;
     private String career;
     private String motto;
     private String cardHolder;
     private String bankName;
     private Long bankAccount;
     private String headPic;
     private String password;
     private Timestamp registeredTime;
     private Integer onlineLength;
     private Timestamp lastLoginTime;
     private Integer gameNumber;
     private Integer riskTolerance;
     private Boolean asterisk;
     private Integer apprenticeNumber;
     private String identityCard;
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Player() {
    }

	/** minimal constructor */
    public Player(Master master, Apprentice apprentice, Security Security, String firstName, String lastName, String formerName, String nickname, String sex, Integer age, Date birthday, String email, Long telephone, Integer qq, String career, String motto, String cardHolder, String bankName, Long bankAccount, String headPic, String password, Timestamp registeredTime, Integer onlineLength, Timestamp lastLoginTime, Integer gameNumber, Integer riskTolerance, Integer apprenticeNumber, String identityCard) {
        this.master = master;
        this.apprentice = apprentice;
        this.Security = Security;
        this.firstName = firstName;
        this.lastName = lastName;
        this.formerName = formerName;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.telephone = telephone;
        this.qq = qq;
        this.career = career;
        this.motto = motto;
        this.cardHolder = cardHolder;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.headPic = headPic;
        this.password = password;
        this.registeredTime = registeredTime;
        this.onlineLength = onlineLength;
        this.lastLoginTime = lastLoginTime;
        this.gameNumber = gameNumber;
        this.riskTolerance = riskTolerance;
        this.apprenticeNumber = apprenticeNumber;
        this.identityCard = identityCard;
    }
    
    /** full constructor */
    public Player(Master master, Apprentice apprentice, Security tbSecurity, String firstName, String lastName, String formerName, String nickname, String sex, Integer age, Date birthday, String email, Long telephone, Integer qq, String career, String motto, String cardHolder, String bankName, Long bankAccount, String headPic, String password, Timestamp registeredTime, Integer onlineLength, Timestamp lastLoginTime, Integer gameNumber, Integer riskTolerance, Boolean asterisk, Integer apprenticeNumber, String identityCard, Set users) {
        this.master = master;
        this.apprentice = apprentice;
        this.Security = tbSecurity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.formerName = formerName;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.telephone = telephone;
        this.qq = qq;
        this.career = career;
        this.motto = motto;
        this.cardHolder = cardHolder;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.headPic = headPic;
        this.password = password;
        this.registeredTime = registeredTime;
        this.onlineLength = onlineLength;
        this.lastLoginTime = lastLoginTime;
        this.gameNumber = gameNumber;
        this.riskTolerance = riskTolerance;
        this.asterisk = asterisk;
        this.apprenticeNumber = apprenticeNumber;
        this.identityCard = identityCard;
        this.users = users;
    }

   
    // Property accessors

    public Integer getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Master getMaster() {
        return this.master;
    }
    
    public void setMaster(Master master) {
        this.master = master;
    }

    public Apprentice getApprentice() {
        return this.apprentice;
    }
    
    public void setApprentice(Apprentice apprentice) {
        this.apprentice = apprentice;
    }

    public Security getTbSecurity() {
        return this.Security;
    }
    
    public void setTbSecurity(Security tbSecurity) {
        this.Security = tbSecurity;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFormerName() {
        return this.formerName;
    }
    
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Integer getQq() {
        return this.qq;
    }
    
    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public String getCareer() {
        return this.career;
    }
    
    public void setCareer(String career) {
        this.career = career;
    }

    public String getMotto() {
        return this.motto;
    }
    
    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getCardHolder() {
        return this.cardHolder;
    }
    
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getBankAccount() {
        return this.bankAccount;
    }
    
    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getHeadPic() {
        return this.headPic;
    }
    
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisteredTime() {
        return this.registeredTime;
    }
    
    public void setRegisteredTime(Timestamp registeredTime) {
        this.registeredTime = registeredTime;
    }

    public Integer getOnlineLength() {
        return this.onlineLength;
    }
    
    public void setOnlineLength(Integer onlineLength) {
        this.onlineLength = onlineLength;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getGameNumber() {
        return this.gameNumber;
    }
    
    public void setGameNumber(Integer gameNumber) {
        this.gameNumber = gameNumber;
    }

    public Integer getRiskTolerance() {
        return this.riskTolerance;
    }
    
    public void setRiskTolerance(Integer riskTolerance) {
        this.riskTolerance = riskTolerance;
    }

    public Boolean getAsterisk() {
        return this.asterisk;
    }
    
    public void setAsterisk(Boolean asterisk) {
        this.asterisk = asterisk;
    }

    public Integer getApprenticeNumber() {
        return this.apprenticeNumber;
    }
    
    public void setApprenticeNumber(Integer apprenticeNumber) {
        this.apprenticeNumber = apprenticeNumber;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }
    
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}