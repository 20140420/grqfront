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

}
