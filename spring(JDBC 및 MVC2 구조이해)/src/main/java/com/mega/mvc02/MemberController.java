package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO , MemberDAO dao) {
		//controller의 메소드 내에 들어가는 생성된 객체는 
		//new를 통해서 만들어진 프로토 타입 패턴으로 만들어진 것.
		System.out.println(memberDTO);
		//dao 처리
		dao.insert(memberDTO);
	}
}
