package com.mega.mvc05;
//����� �ڹ����� :POJO(Plain Old Java Object)

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component  //������̼�....���� ; (@service : ó���� ���õ� Ŭ����)
public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println("dao���� ���� dto����\n" + dto);
	}
	
	public int login(MemberDTO dto) {
		int result = 0; // not login
		String id = "root";
		String pw = "1234";
		if (id.equals(dto.getId()) && pw.equals(dto.getPw())) {
			result = 1; // ok login
		}
		return result;
	}
	
	public ArrayList<String> select(String find) {
		ArrayList<String> list = new ArrayList<String>();
		if (find.equals("�ڵ���")) {
			list.add("����");
			list.add("BMW");
			list.add("�ҷ���");
		}else {
			list.add("����747");
			list.add("���ڵ�");
		}
		return list;
	}
}
