package com.grq.model.pojo;
// default package

import java.sql.Timestamp;


/**
 * Chart entity. @author MyEclipse Persistence Tools
 */

public class Chart  implements java.io.Serializable {


    // Fields    

     private Integer chartId;
     private Timestamp chartTime;
     private String chartWho;
     private String nickname;
     private String content;


    // Constructors

    /** default constructor */
    public Chart() {
    }

    
    /** full constructor */
    public Chart(Timestamp chartTime, String chartWho, String nickname, String content) {
        this.chartTime = chartTime;
        this.chartWho = chartWho;
        this.nickname = nickname;
        this.content = content;
    }

   
    // Property accessors

    public Integer getChartId() {
        return this.chartId;
    }
    
    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    public Timestamp getChartTime() {
        return this.chartTime;
    }
    
    public void setChartTime(Timestamp chartTime) {
        this.chartTime = chartTime;
    }

    public String getChartWho() {
        return this.chartWho;
    }
    
    public void setChartWho(String chartWho) {
        this.chartWho = chartWho;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
   








}