package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("Check.do")
	public void check(String id , String pw , @RequestParam("etc") String etc) {
		System.out.println("id �߿Դ�?" + id);
		System.out.println("pw �߿Դ�?" + pw);
		System.out.println("etc �߿Դ�?" + etc);
	}
}
