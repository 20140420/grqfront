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
 * ����Action��������Action�ĸ���
 * @author JiangQuan
 */
public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {
	private static final long serialVersionUID = 1L;
	
	protected int pageNo = 1;//��ǰҳ
	protected int pageSize = 4;//ÿҳ��ʾ������

	
	public static final String LIST = "list";
	public static final String EDIT = "edit";
	public static final String ADD = "add";
	public static final String SELECT = "select";

	
	// ע��Dao
	@Autowired
	protected ProductCategoryDao categoryDao;
	@Autowired
	protected ProductDao productDao;
	@Autowired
	protected UploadFileDao uploadFileDao;

	// Map���͵�request
	protected Map<String, Object> request;
	// Map���͵�session
	protected Map<String, Object> session;
	// Map���͵�application
	protected Map<String, Object> application;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		// ��ȡMap���͵�request��ֵ
		this.request = request;
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		// ��ȡMap���͵�application��ֵ
		this.application = application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// ��ȡMap���͵�session��ֵ
		this.session = session;
	}
	
	// ������
	public String add() throws Exception {
		return ADD;
	}
	public String select() throws Exception {
		return SELECT;
	}
}
