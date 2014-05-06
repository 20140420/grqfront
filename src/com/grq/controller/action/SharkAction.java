package com.grq.controller.action;

public class SharkAction {
	
	/**
	 * gheader页面
	 * @return
	 * @throws Exception
	 */
	public String gheader() throws Exception{

		return "gheader";
	}
	
	/**
	 * 导向uinquiryaccount页面
	 * @return
	 * @throws Exception
	 */
	public String uinquiryaccount() throws Exception{

		return "uinquiryaccount";
	}
	
	/**
	 * 导向usilverbuy页面
	 * @return
	 * @throws Exception
	 */
	public String usilverbuy() throws Exception{

		return "usilverbuy";
	}
	
	/**
	 * 导向usilversell页面
	 * @return
	 * @throws Exception
	 */
	public String usilversell() throws Exception{

		return "usilversell";
	}
	
	/**
	 * 导向grule页面
	 * @return
	 * @throws Exception
	 */
	public String grule() throws Exception{

		return "grule";
	}
	
	/**
	 * 工具chattool页面
	 * @return
	 * @throws Exception
	 */
	public String chattool() throws Exception{

		return "chattool";
	}
	
	/**
	 * gdial页面
	 * @return
	 * @throws Exception
	 */
	public String gdial() throws Exception{

		return "gdial";
	}
	
	/**
	 * gpanel页面
	 * @return
	 * @throws Exception
	 */
	public String gpanel() throws Exception{
		System.out.println("这里是SharkAction文件gpanel");
		return "gpanel";
	}

}
