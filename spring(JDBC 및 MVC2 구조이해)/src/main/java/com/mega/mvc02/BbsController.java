package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@RequestMapping("insert2.do")
	public void insert2(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
	}
}
