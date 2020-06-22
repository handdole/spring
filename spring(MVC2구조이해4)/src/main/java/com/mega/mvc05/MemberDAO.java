package com.mega.mvc05;
//평범한 자바파일 :POJO(Plain Old Java Object)

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component  //어노테이션....사기네 ; (@service : 처리와 관련된 클래스)
public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println("dao에서 받은 dto내용\n" + dto);
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
		if (find.equals("자동차")) {
			list.add("벤츠");
			list.add("BMW");
			list.add("소렌토");
		}else {
			list.add("보잉747");
			list.add("콩코드");
		}
		return list;
	}
}
