package com.grq.model.bean;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 * 只获取了数据库里的几个字段,user_id\email\password
 */

public class User  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

	private Integer userId;
    private String email;
    private String password;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String username) {
        this.email = username;
    }
    
    /** full constructor */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

   
    // Property accessors


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

}