package com.mega.mvc04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Speak implements ServletContextListener {
	
	@Override
	//������Ʈ�� ���۵Ǵ� ���� �˷���. (�ڵ� ȣ��)
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("mvc04 ���ؽ�Ʈ ���۵�.");
	}

	@Override
	//������Ʈ�� ���� ���� �˷���. (�ڵ� ȣ��)
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("mvc04 ���ؽ�Ʈ ��!");
	}

}
