package com.grq.controller.action;

public class SharkAction {
	
	/**
	 * ����chattoolҳ��
	 * @return
	 * @throws Exception
	 */
	public String chattool() throws Exception{

		return "chattool";
	}
	
	/**
	 * gdialҳ��
	 * @return
	 * @throws Exception
	 */
	public String gdial() throws Exception{

		return "gdial";
	}
	
	/**
	 * gpanelҳ��
	 * @return
	 * @throws Exception
	 */
	public String gpanel() throws Exception{
		System.out.println("������SharkAction�ļ�gpanel");
		return "gpanel";
	}

}
