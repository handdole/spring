package com.mega.mvc05;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //싱글톤으로 만든 객체의 주소를 넣어줌.(주입)
	//DI(Dependency Injection): 의존성 주입
	
	//컨트롤 처리 단위는 메소드로 만든다.
	@RequestMapping("insert.do")
	public String insert(MemberDTO memberDTO ) {
		System.out.println("컨트롤러 insert()호출 성공.");
		dao.insert(memberDTO);
		return "list";
	}
	
	@RequestMapping("check.do")
	public String login(MemberDTO memberDTO ) {
		System.out.println("컨트롤러 login() 호출 성공.");
		int result = dao.login(memberDTO);
		String page = "";
		if (result == 1) {
			page = "ok";
		} else {
			page = "no"; //브라우저에 요청하라고 함?
		}
		return page;
	}
	
	@RequestMapping("select.do")
	public void find(String find , Model model) {
		System.out.println("검색할 항목은 " + find);
		ArrayList<String> list= dao.select(find);
		String result = "";
		for (String s : list) {
			result = result + s + " ";
		}
		model.addAttribute("list", result); //string을 view 까지 넘겨줌 
		//model 객체는 frontcontroller를 통해 viewtemplate까지의 값을 넘길 수 있음.
		//session보다는 좁은 범위로 데이터를 유지 할 수 있음.
		model.addAttribute("find",find);
	}
	
	
}
