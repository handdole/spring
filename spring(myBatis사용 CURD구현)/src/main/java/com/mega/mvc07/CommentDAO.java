package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(CommentDTO dto) {
		my.insert("comment.insert", dto );
	}
	
	public List<CommentDTO> all(CommentDTO dto) {
		List<CommentDTO> list = my.selectList("comment.all", dto);
		return list;
	}
	
	
}
