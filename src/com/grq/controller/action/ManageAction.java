package com.grq.controller.action;

public class ManageAction {
	
	/**
	 * mbody页面
	 * @return
	 * @throws Exception
	 */
	public String mbody() throws Exception{
		System.out.println("这里是ManageAction文件mbody");
		return "mbody";
	}
	
	/**
	 * mfooter页面
	 * @return
	 * @throws Exception
	 */
	public String mfooter() throws Exception{

		return "mfooter";
	}
	
	/**
	 * usidebar页面
	 * @return
	 * @throws Exception
	 */
	public String usidebar() throws Exception{

		return "usidebar";
	}
	
	/**
	 * msidebar页面
	 * @return
	 * @throws Exception
	 */
	public String msidebar() throws Exception{

		return "msidebar";
	}
	
	/**
	 * usilverbuy页面
	 * @return
	 * @throws Exception
	 */
	public String usilverbuy() throws Exception{

		return "usilverbuy";
	}
	
	/**
	 * usilversell页面
	 * @return
	 * @throws Exception
	 */
	public String usilversell() throws Exception{

		return "usilversell";
	}

}
