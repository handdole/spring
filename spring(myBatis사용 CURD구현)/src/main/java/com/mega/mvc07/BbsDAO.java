package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ReplyDTO dto) {
		my.insert("reply.insert", dto);
	}
	
	public List<ReplyDTO> replyselect(ReplyDTO dto) {
		List<ReplyDTO> list = my.selectList("reply.list" , dto);
		return list;
	}
	
	public BbsDTO select(BbsDTO bbsDTO ) {
		BbsDTO dto = my.selectOne("bbs.select",bbsDTO);
		return dto;
	}
	
	public List<BbsDTO> list() {
		List<BbsDTO> list = my.selectList("bbs.list");
		System.out.println(list.get(0).getNum());
		System.out.println(list.get(1).getNum());
		System.out.println(list.get(2).getNum());
		return list;
	}
	
}
