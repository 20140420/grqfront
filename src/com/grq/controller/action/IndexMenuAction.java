package com.grq.controller.action;

public class IndexMenuAction {

	/**
	 * 主页shark按钮
	 * @return
	 * @throws Exception
	 */
	public String shark() throws Exception{

		return "shark";
	}
	
	/**
	 * 主页snake按钮
	 * @return
	 * @throws Exception
	 */
	public String snake() throws Exception{
		System.out.println("点击登录执行该方法，这里是IndexMenuAction文件snake");
		return "snake";
	}
	
}
