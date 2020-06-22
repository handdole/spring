package com.mega.mvc07;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommentController {

	@Autowired
	CommentDAO dao;
	
	@RequestMapping("commentadd.do")
	public void add(CommentDTO commentDTO){
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
				
		String date = format1.format (System.currentTimeMillis());
		commentDTO.setDate(date);
		dao.insert(commentDTO);
	}
	@RequestMapping("commentall.do")
	public void all(CommentDTO commentDTO , Model m){
		List<CommentDTO> list = dao.all(commentDTO);
		m.addAttribute("list", list);
	}
}
