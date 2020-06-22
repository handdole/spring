package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("list.do")
	public void list(Model m) {
		List<MemberDTO> list = dao.list();
		m.addAttribute("list", list);
	}
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO , Model m) {
		MemberDTO dto = dao.select(memberDTO);
		m.addAttribute("dto" , dto);  //dto 하나 보낼 때
	}
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) {
		dao.insert(memberDTO);
	}
	
	@RequestMapping("delete.do")
	public void delete(MemberDTO memberDTO) {
		dao.delete(memberDTO);
	}
	
	@RequestMapping("update.do")
	public void update(MemberDTO memberDTO) {
		dao.update(memberDTO);
	}
	
}

