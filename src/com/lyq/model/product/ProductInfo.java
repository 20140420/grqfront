package com.lyq.model.product;
// default package


import java.io.Serializable;
import java.util.Date;

import com.grq.model.Sex;


/**
 * ProductInfo entity. 商品信息
 * @author MyEclipse Persistence Tools 姜泉
 */

public class ProductInfo  implements Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;                            // 商品编号
    private UploadFile uploadFile;                 // 上传文件
    private String name;                           // 商品名称
    private String description;                    // 商品说明
    private Date createTime = new Date();          // 上架时间
    private Float baseprice;                      // 商品采购价格
    private Float marketprice;                   // 现在市场价格
    private Float sellprice;                     // 商城销售价格
    private Sex sexrequest;                      // 所属性别
    private Boolean commend = false;            // 是否是推荐商品（默认值为false）
    private Integer clickcount = 1;           // 访问量（统计受欢迎的程度）
    private Integer sellCount = 0;             // 销售数量（统计热销商品）
    private ProductCategory category;            // 所属类别


    // Constructors

    /** default constructor */
    public ProductInfo() {
    }

	/** minimal constructor */
    public ProductInfo(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public ProductInfo(ProductCategory category, UploadFile uploadFile, String name, String description, Date createTime, Float baseprice, Float marketprice, Float sellprice, Sex sexrequest, Boolean commend, Integer clickcount, Integer sellCount) {
        this.category = category;
        this.uploadFile = uploadFile;
        this.name = name;
        this.description = description;
        this.createTime = createTime;
        this.baseprice = baseprice;
        this.marketprice = marketprice;
        this.sellprice = sellprice;
        this.sexrequest = sexrequest;
        this.commend = commend;
        this.clickcount = clickcount;
        this.sellCount = sellCount;
    }

   
    // Property accessors 属性访问器

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public UploadFile getUploadFile() {
        return this.uploadFile;
    }
    
    public void setUploadFile(UploadFile uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getBaseprice() {
        return this.baseprice;
    }
    
    public void setBaseprice(Float baseprice) {
        this.baseprice = baseprice;
    }

    public Float getMarketprice() {
        return this.marketprice;
    }
    
    public void setMarketprice(Float marketprice) {
        this.marketprice = marketprice;
    }

    public Float getSellprice() {
        return this.sellprice;
    }
    
    public void setSellprice(Float sellprice) {
        this.sellprice = sellprice;
    }

    public Sex getSexrequest() {
        return this.sexrequest;
    }
    
    public void setSexrequest(Sex sexrequest) {
        this.sexrequest = sexrequest;
    }

    public Boolean getCommend() {
        return this.commend;
    }
    
    public void setCommend(Boolean commend) {
        this.commend = commend;
    }

    public Integer getClickcount() {
        return this.clickcount;
    }
    
    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    public Integer getSellCount() {
        return this.sellCount;
    }
    
    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

}