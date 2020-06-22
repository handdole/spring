package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO , MemberDAO dao) {
		//controller�� �޼ҵ� ���� ���� ������ ��ü�� 
		//new�� ���ؼ� ������� ������ Ÿ�� �������� ������� ��.
		System.out.println(memberDTO);
		//dao ó��
		dao.insert(memberDTO);
	}
}
