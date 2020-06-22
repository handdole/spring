package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<MemberDTO> list() {
		List<MemberDTO> list = my.selectList("member.list");
		return list;
	}
	
	public MemberDTO select(MemberDTO dto) {
		MemberDTO dto2 = my.selectOne("member.select", dto);
		return dto2;
	}
	
	public void insert(MemberDTO dto) {
		my.insert("member.insert", dto);
	}
	
	public void delete(MemberDTO dto) {
		my.delete("member.delete", dto);
	}
	
	public void update(MemberDTO dto) {
		my.update("update", dto);
	}
	
}
