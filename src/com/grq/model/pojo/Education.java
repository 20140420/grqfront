package com.grq.model.pojo;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Education entity. @author MyEclipse Persistence Tools
 */

public class Education  implements java.io.Serializable {


    // Fields    

     private Integer educationId;
     private Date startDate;
     private Date finishDate;
     private String school;
     private Long graduationId;
     private Long degreeId;
     private String studyContent;
     private Set tbEmployees = new HashSet(0);


    // Constructors

    /** default constructor */
    public Education() {
    }

	/** minimal constructor */
    public Education(Date startDate, Date finishDate, String school, Long graduationId, Long degreeId, String studyContent) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.school = school;
        this.graduationId = graduationId;
        this.degreeId = degreeId;
        this.studyContent = studyContent;
    }
    
    /** full constructor */
    public Education(Date startDate, Date finishDate, String school, Long graduationId, Long degreeId, String studyContent, Set tbEmployees) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.school = school;
        this.graduationId = graduationId;
        this.degreeId = degreeId;
        this.studyContent = studyContent;
        this.tbEmployees = tbEmployees;
    }

   
    // Property accessors

    public Integer getEducationId() {
        return this.educationId;
    }
    
    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return this.finishDate;
    }
    
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getSchool() {
        return this.school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }

    public Long getGraduationId() {
        return this.graduationId;
    }
    
    public void setGraduationId(Long graduationId) {
        this.graduationId = graduationId;
    }

    public Long getDegreeId() {
        return this.degreeId;
    }
    
    public void setDegreeId(Long degreeId) {
        this.degreeId = degreeId;
    }

    public String getStudyContent() {
        return this.studyContent;
    }
    
    public void setStudyContent(String studyContent) {
        this.studyContent = studyContent;
    }

    public Set getTbEmployees() {
        return this.tbEmployees;
    }
    
    public void setTbEmployees(Set tbEmployees) {
        this.tbEmployees = tbEmployees;
    }
   








}