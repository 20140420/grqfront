package com.grq.model.pojo.product;
// default package

import java.io.Serializable;



/**
 * UploadFile entity. 上传文件对象
 * @author MyEclipse Persistence Tools 姜泉
 * 
 */

public class UploadFile  implements Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 编号
	private Integer id;
	// 文件路径
    private String path;

    // Constructors

    /** default constructor */
    public UploadFile() {
    }

	/** minimal constructor */
    public UploadFile(String path) {
        this.path = path;
    }
    
    // Property accessors 属性访问器

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
}