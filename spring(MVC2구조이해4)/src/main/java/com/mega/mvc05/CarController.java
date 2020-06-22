package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링 프레임 워크에 내가 컨트롤러야 라고 등록하는 역활 / 컨트롤러 상속을 받아서 역활
public class CarController {
	
	@Autowired //의존성을 맺어주는 것은 주소만 있으면 된다. / 한개이면 이거 한번만 해주면됨.
	@Qualifier("car1") // 찾아서 주입할 객체가 2개이상일 때 (car1은 bean의 이름)
	Car car;
	//외부 파일에서 만든 주소를 car변수에 spring이 찾아서 넣어줌.
	//car 상속이나 , 구현된 객체의 생성된 주소를 찾아서 주입
	
	
	@RequestMapping("car1.do")
	public void run1() {
		car.run();
	}
}
