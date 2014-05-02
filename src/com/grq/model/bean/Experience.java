package com.grq.model.bean;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Experience entity. @author MyEclipse Persistence Tools
 */

public class Experience  implements java.io.Serializable {


    // Fields    

     private Integer experienceId;
     private Date joinDate;
     private Date leaveDat;
     private String corporateName;
     private String branch;
     private String post;
     private Integer salary;
     private String jobContent;
     private String leaveReason;
     private Set employees = new HashSet(0);


    // Constructors

    /** default constructor */
    public Experience() {
    }

	/** minimal constructor */
    public Experience(Date joinDate, Date leaveDat, String corporateName, String branch, String post, Integer salary, String jobContent, String leaveReason) {
        this.joinDate = joinDate;
        this.leaveDat = leaveDat;
        this.corporateName = corporateName;
        this.branch = branch;
        this.post = post;
        this.salary = salary;
        this.jobContent = jobContent;
        this.leaveReason = leaveReason;
    }
    
    /** full constructor */
    public Experience(Date joinDate, Date leaveDat, String corporateName, String branch, String post, Integer salary, String jobContent, String leaveReason, Set employees) {
        this.joinDate = joinDate;
        this.leaveDat = leaveDat;
        this.corporateName = corporateName;
        this.branch = branch;
        this.post = post;
        this.salary = salary;
        this.jobContent = jobContent;
        this.leaveReason = leaveReason;
        this.employees = employees;
    }

   
    // Property accessors

    public Integer getExperienceId() {
        return this.experienceId;
    }
    
    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    public Date getJoinDate() {
        return this.joinDate;
    }
    
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getLeaveDat() {
        return this.leaveDat;
    }
    
    public void setLeaveDat(Date leaveDat) {
        this.leaveDat = leaveDat;
    }

    public String getCorporateName() {
        return this.corporateName;
    }
    
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPost() {
        return this.post;
    }
    
    public void setPost(String post) {
        this.post = post;
    }

    public Integer getSalary() {
        return this.salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getJobContent() {
        return this.jobContent;
    }
    
    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public String getLeaveReason() {
        return this.leaveReason;
    }
    
    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }
   








}