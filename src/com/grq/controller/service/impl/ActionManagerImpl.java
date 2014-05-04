package com.grq.controller.service.impl;


import com.grq.controller.service.ActionManager;
//import com.grq.model.bean.User;
import com.grq.model.bean.User;
import com.grq.model.dao.UserDAO; 

/**
 * ҵ���߼���ӿ�ʵ����
 * @author JiangQuan
 */
public class ActionManagerImpl implements ActionManager {
	
	private UserDAO userDAO;

	@Override
	public UserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return this.userDAO;
	}

	@Override
	public void setUserDAO(UserDAO userDAO) {
		// TODO Auto-generated method stub
		this.userDAO = userDAO;
	}

	@Override
	public Integer validLogin(String email, String password) {
		// TODO Auto-generated method stub
		try{
			User user = userDAO.findUserByEmailAndPass(email, password);
			if (user != null)
			{
				return user.getUserId();
				//return user.getId();
			}else {
				System.out.println("cann't null��������ActionManagerImpl�ļ�");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}


}
