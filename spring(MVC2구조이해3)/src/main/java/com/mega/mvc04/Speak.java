package com.mega.mvc04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Speak implements ServletContextListener {
	
	@Override
	//프로젝트가 시작되는 것을 알려줌. (자동 호출)
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("mvc04 컨텍스트 시작됨.");
	}

	@Override
	//프로젝트가 죽은 것을 알려줌. (자동 호출)
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("mvc04 컨텍스트 끝!");
	}

}
