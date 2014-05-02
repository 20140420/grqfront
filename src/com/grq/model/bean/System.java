package com.grq.model.bean;
// default package



/**
 * System entity. @author MyEclipse Persistence Tools
 */

public class System  implements java.io.Serializable {


    // Fields    

     private Integer systemId;
     private String webServer;
     private String webDatabase;
     private String webOther;


    // Constructors

    /** default constructor */
    public System() {
    }

    
    /** full constructor */
    public System(String webServer, String webDatabase, String webOther) {
        this.webServer = webServer;
        this.webDatabase = webDatabase;
        this.webOther = webOther;
    }

   
    // Property accessors

    public Integer getSystemId() {
        return this.systemId;
    }
    
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getWebServer() {
        return this.webServer;
    }
    
    public void setWebServer(String webServer) {
        this.webServer = webServer;
    }

    public String getWebDatabase() {
        return this.webDatabase;
    }
    
    public void setWebDatabase(String webDatabase) {
        this.webDatabase = webDatabase;
    }

    public String getWebOther() {
        return this.webOther;
    }
    
    public void setWebOther(String webOther) {
        this.webOther = webOther;
    }
   








}