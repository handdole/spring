package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//POJO(����) ���� �̶�� �Ҹ�


@Controller //Annotation ǥ��. //����� �޾Ƴ� ���� == extends Controller
public class SearchController {
	
	@RequestMapping("find.mega") //find.mega�� ������ �Ǹ� �Ʒ� �޼ҵ带 �������� 
	public void find(String search) {
		System.out.println("find()�Լ� ȣ���.");
		System.out.println("�˻��� �����ʹ�" + search);
	}
	
	
}
