package com.mega.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("insert2.do")
	public String insert2(ProductDTO productdto) {
		System.out.println("컨트롤러 실행");
		return "result";
	}
}
