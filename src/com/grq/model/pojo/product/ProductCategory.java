package com.grq.model.pojo.product;

// default package

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 * ProductCategory entity. ��Ʒ���
 * 
 * @author MyEclipse Persistence Tools ��Ȫ
 */

public class ProductCategory implements Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id; // �����
	private String name; // �������
	private int level = 1; // ���
	private ProductCategory parent;// �����
	private Set<ProductCategory> children;// �Ӳ�Ʒ���
	private Set<ProductInfo> products = new TreeSet<ProductInfo>();// ������Ʒ

	// Constructors

	/** default constructor */
	public ProductCategory() {
	}

	/** minimal constructor */
	public ProductCategory(String name) {
		this.name = name;
	}

	/** full constructor */
	public ProductCategory(ProductCategory parent, String name, Integer level,
			Set<ProductCategory> children, Set<ProductInfo> products) {
		this.parent = parent;
		this.name = name;
		this.level = level;
		this.children = children;
		this.products = products;
	}

	// Property accessors ���Է�����

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ProductCategory getParent() {
		return parent;
	}

	public void setParent(ProductCategory parent) {
		this.parent = parent;
	}

	public Set<ProductCategory> getChildren() {
		return children;
	}

	public void setChildren(Set<ProductCategory> children) {
		this.children = children;
	}

	public Set<ProductInfo> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductInfo> products) {
		this.products = products;
	}
}