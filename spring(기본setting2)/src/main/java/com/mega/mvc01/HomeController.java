package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  HomeController{
	
	@RequestMapping("home.go")
	public void home() {
		System.out.println("집으로 가자라는 요청이 들어왔음.");
	}
	
	
}