package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("Check.do")
	public void check(String id , String pw , @RequestParam("etc") String etc) {
		System.out.println("id 잘왔니?" + id);
		System.out.println("pw 잘왔니?" + pw);
		System.out.println("etc 잘왔니?" + etc);
	}
}
