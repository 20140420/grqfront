package com.grq.controller.action;

public class IndexMenuAction {

	/**
	 * ��ҳshark��ť
	 * @return
	 * @throws Exception
	 */
	public String shark() throws Exception{

		return "shark";
	}
	
	/**
	 * ��ҳsnake��ť
	 * @return
	 * @throws Exception
	 */
	public String snake() throws Exception{
		System.out.println("�����¼ִ�и÷�����������IndexMenuAction�ļ�snake");
		return "snake";
	}
	
}
