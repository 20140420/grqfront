package com.grq.model.dao;

import java.util.List;

import com.grq.model.bean.User;


/**
 * 用户接口
 * @author JiangQuan
 */
public interface UserDAO {
	/**
	 * 根据id查找用户
	 * @param userId 需要查找的用户userId
	 */
	User get(Integer userId);
	
	/**
	 * 增加用户
	 * @param user 需要增加的用户
	 */
	void save(User user);
	
	/**
	 * 修改用户
	 * @param user 需要修改的用户
	 */
	void update(User user);
	
	/**
	 * 删除用户
	 * @param userId 需要删除的用户userId
	 */
	void delete(Integer userId);
	
	/**
	 * 删除用户
	 * @param user 需要删除的用户
	 */
	void delete(User user);
	
	/**
	 * 查询全部用户
	 * @return 获得全部用户
	 */
	List<User> findAll();
	
	/**
	 * 根据邮箱、密码查找用户
	 * @param email 查询所需的邮箱
	 * @param password 查询所需的密码
	 * @return 对应的用户
	 */
	User findUserByNameAndPass(String email,String password);

}
