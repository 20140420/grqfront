package com.grq.controller.action;

import com.opensymphony.xwork2.ActionSupport;
import com.grq.controller.service.ActionManager;

/**
 * 编写处理登录请求的Action类
 * @author JiangQuan
 */
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	protected ActionManager mgr;  //该对象采用 Spring依赖注入
	
	private String email;
	private String password;
	
	public String execute() throws Exception {
		System.out.println("点击登录执行该方法，这里是LoginAction文件");
		if(email.equals("") || email == null){
			return "FAILURE";
		}
		
		Integer userId =mgr.validLogin(email, password);
		if(userId != null){
			System.out.println("合法用户");
			return "login_user";//这里设计
		} else {
			addActionError("邮箱/密码不匹配");
			System.out.println("非法用户， 这里是LoginAction文件");
			return "FAILURE";
		}

	}
	
	public String getPassword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPassword(String password){
		this.password = password;		
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setMgr(ActionManager mgr)
	{
		this.mgr = mgr;
	}
	
	public ActionManager getMgr()
	{
		return mgr;
	}

}
