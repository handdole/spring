package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  HomeController{
	
	@RequestMapping("home.go")
	public void home() {
		System.out.println("������ ���ڶ�� ��û�� ������.");
	}
	
	
}