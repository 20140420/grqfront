package com.grq.model.pojo.product;
// default package

import java.io.Serializable;



/**
 * UploadFile entity. �ϴ��ļ�����
 * @author MyEclipse Persistence Tools ��Ȫ
 * 
 */

public class UploadFile  implements Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ���
	private Integer id;
	// �ļ�·��
    private String path;

    // Constructors

    /** default constructor */
    public UploadFile() {
    }

	/** minimal constructor */
    public UploadFile(String path) {
        this.path = path;
    }
    
    // Property accessors ���Է�����

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