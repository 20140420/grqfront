package com.grq.controller.service;

import com.grq.model.dao.UserDAO;

/**
 * ҵ���߼���ӿ�
 * @author JiangQuan
 */
public interface ActionManager {
	
	/**
	 * 
	 * 
	 */
	public UserDAO getUserDAO();
	
	/**
	 * 
	 * 
	 */
	public void setUserDAO(UserDAO userDAO);
	
	/**
	 * �������䡢������֤�û�
	 * @param email ��ѯ���������
	 * @param password ��ѯ���������
	 * @return ��Ӧ���û�
	 */
	Integer validLogin(String email, String password);

}
