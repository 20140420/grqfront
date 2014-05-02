package com.grq.model.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.grq.model.bean.User;
import com.grq.model.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return (User)getHibernateTemplate().get(User.class, id);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(User.class, userId));
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from tb_user");
	}

	@Override
	public User findUserByEmailAndPass(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println("验证用");
		//delete(2)；
		//String() args=(username,password);
		System.out.println("成功删除");
		List ul =getHibernateTemplate().find("from com.grq.model.bean.User user where user.email = '"+email+"'and au.password = '"+password+"'");
		
		if(ul.size()==1)
		{
			System.out.println("OK 会员登入123");
			return (User)ul.get(0);
		}
		return null;
	}
}
