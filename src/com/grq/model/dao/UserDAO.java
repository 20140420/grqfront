package com.grq.model.dao;

import java.util.List;

import com.grq.model.bean.User;


/**
 * �û��ӿ�
 * @author JiangQuan
 */
public interface UserDAO {
	/**
	 * ����id�����û�
	 * @param userId ��Ҫ���ҵ��û�userId
	 */
	User get(Integer userId);
	
	/**
	 * �����û�
	 * @param user ��Ҫ���ӵ��û�
	 */
	void save(User user);
	
	/**
	 * �޸��û�
	 * @param user ��Ҫ�޸ĵ��û�
	 */
	void update(User user);
	
	/**
	 * ɾ���û�
	 * @param userId ��Ҫɾ�����û�userId
	 */
	void delete(Integer userId);
	
	/**
	 * ɾ���û�
	 * @param user ��Ҫɾ�����û�
	 */
	void delete(User user);
	
	/**
	 * ��ѯȫ���û�
	 * @return ���ȫ���û�
	 */
	List<User> findAll();
	
	/**
	 * �������䡢��������û�
	 * @param email ��ѯ���������
	 * @param password ��ѯ���������
	 * @return ��Ӧ���û�
	 */
	User findUserByNameAndPass(String email,String password);

}
