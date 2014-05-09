package com.grq.controller.action;

public class SharkAction {
	
	/**
	 * gheader页面
	 * @return
	 * @throws Exception
	 */
	public String gheader() throws Exception{
		System.out.println("这里是SharkAction文件");
		return "gheader";
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

		return "gpanel";
	}
	
	
	/**
	 * 导向grule页面
	 * @return
	 * @throws Exception
	 */
	public String grule() throws Exception{

		return "grule";
	}

}
