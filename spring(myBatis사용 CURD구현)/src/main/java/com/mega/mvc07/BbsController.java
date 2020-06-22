package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	
	public void commentlist() {
		
	}
	
	@RequestMapping("commentinsert.do")
	public void commentinsert(ReplyDTO replyDTO , String num , String comment) {
		replyDTO.setContent(comment);
		replyDTO.setbbsnum(num);
		replyDTO.setId("100");
		replyDTO.setWriter("handol");
		dao.insert(replyDTO);
	}
	
	@RequestMapping("bbslist.do")
	public void list(Model m) {
		List<BbsDTO> list = dao.list(); 
		m.addAttribute("list" , list);
	}
	
	@RequestMapping("bbsselect.do")
	public void select(ReplyDTO replyDTO , BbsDTO bbsDTO ,String num , Model m ) {
		bbsDTO.setNum(num);
		replyDTO.setbbsnum(num);
		List<ReplyDTO> list = dao.replyselect(replyDTO);
		BbsDTO dto = dao.select(bbsDTO);
		m.addAttribute("dto", dto);
		m.addAttribute("list",list);
	}
}
