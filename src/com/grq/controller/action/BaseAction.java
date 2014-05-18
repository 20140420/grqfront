package com.grq.controller.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.grq.model.dao.ProductCategoryDao;
import com.grq.model.dao.ProductDao;
import com.grq.model.dao.UploadFileDao;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 基本Action对象，其它Action的父类
 * @author JiangQuan
 */
public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {
	private static final long serialVersionUID = 1L;
	
	protected int pageNo = 1;//当前页
	protected int pageSize = 4;//每页显示多少条

	
	public static final String LIST = "list";
	public static final String EDIT = "edit";
	public static final String ADD = "add";
	public static final String SELECT = "select";

	
	// 注入Dao
	@Autowired
	protected ProductCategoryDao categoryDao;
	@Autowired
	protected ProductDao productDao;
	@Autowired
	protected UploadFileDao uploadFileDao;

	// Map类型的request
	protected Map<String, Object> request;
	// Map类型的session
	protected Map<String, Object> session;
	// Map类型的application
	protected Map<String, Object> application;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		// 获取Map类型的request赋值
		this.request = request;
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		// 获取Map类型的application赋值
		this.application = application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// 获取Map类型的session赋值
		this.session = session;
	}
	
	// 处理方法
	public String add() throws Exception {
		return ADD;
	}
	public String select() throws Exception {
		return SELECT;
	}
}
