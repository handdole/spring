package com.mega.mvc02;
//평범한 자바파일 :POJO(Plain Old Java Object)


public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println("dao에서 받은 dto내용\n" + dto);
	}

}
