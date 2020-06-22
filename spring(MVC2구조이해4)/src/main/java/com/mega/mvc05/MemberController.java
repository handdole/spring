package com.mega.mvc05;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //�̱������� ���� ��ü�� �ּҸ� �־���.(����)
	//DI(Dependency Injection): ������ ����
	
	//��Ʈ�� ó�� ������ �޼ҵ�� �����.
	@RequestMapping("insert.do")
	public String insert(MemberDTO memberDTO ) {
		System.out.println("��Ʈ�ѷ� insert()ȣ�� ����.");
		dao.insert(memberDTO);
		return "list";
	}
	
	@RequestMapping("check.do")
	public String login(MemberDTO memberDTO ) {
		System.out.println("��Ʈ�ѷ� login() ȣ�� ����.");
		int result = dao.login(memberDTO);
		String page = "";
		if (result == 1) {
			page = "ok";
		} else {
			page = "no"; //�������� ��û�϶�� ��?
		}
		return page;
	}
	
	@RequestMapping("select.do")
	public void find(String find , Model model) {
		System.out.println("�˻��� �׸��� " + find);
		ArrayList<String> list= dao.select(find);
		String result = "";
		for (String s : list) {
			result = result + s + " ";
		}
		model.addAttribute("list", result); //string�� view ���� �Ѱ��� 
		//model ��ü�� frontcontroller�� ���� viewtemplate������ ���� �ѱ� �� ����.
		//session���ٴ� ���� ������ �����͸� ���� �� �� ����.
		model.addAttribute("find",find);
	}
	
	
}
