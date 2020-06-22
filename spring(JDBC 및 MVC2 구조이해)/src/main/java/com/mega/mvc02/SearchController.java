package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//POJO(포조) 파일 이라고 불름


@Controller //Annotation 표시. //상속을 받아논 상태 == extends Controller
public class SearchController {
	
	@RequestMapping("find.mega") //find.mega와 맵핑이 되면 아래 메소드를 실행해줘 
	public void find(String search) {
		System.out.println("find()함수 호출됨.");
		System.out.println("검색할 데이터는" + search);
	}
	
	
}
