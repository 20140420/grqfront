package com.grq.model.bean;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Security entity. @author MyEclipse Persistence Tools
 */

public class Security  implements java.io.Serializable {


    // Fields    

     private Integer securityId;
     private String secretQuestion;
     private String secretAnswer;
     private Set players = new HashSet(0);


    // Constructors

    /** default constructor */
    public Security() {
    }

	/** minimal constructor */
    public Security(String secretQuestion, String secretAnswer) {
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
    }
    
    /** full constructor */
    public Security(String secretQuestion, String secretAnswer, Set players) {
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.players = players;
    }

   
    // Property accessors

    public Integer getSecurityId() {
        return this.securityId;
    }
    
    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public String getSecretQuestion() {
        return this.secretQuestion;
    }
    
    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return this.secretAnswer;
    }
    
    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public Set getPlayers() {
        return this.players;
    }
    
    public void setPlayers(Set players) {
        this.players = players;
    }
   








}