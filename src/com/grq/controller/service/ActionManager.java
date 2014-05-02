package com.grq.controller.service;

import com.grq.model.dao.UserDAO;

/**
 * 业务逻辑层接口
 * @author JiangQuan
 */
public interface ActionManager {
	
	/**
	 * 根据邮箱、密码验证用户
	 * @param email 查询所需的邮箱
	 * @param password 查询所需的密码
	 * @return 对应的用户
	 */
	Integer validLogin(String email, String password);
	
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

}
