package com.mega.mvc05;

public class BananaCar implements Car {
	Window w ; 
	
	public BananaCar(Window w) {
		this.w = w;
	}

	@Override
	public void run() {
		System.out.println("부릉부릉 뻐네나차");
		w.open();  // 주소값
		//Car는 Window에 의존적이다. (dependency , 의존성이 있다. )
		//코드상으로는 해당 객체에 주소값만 있으면 됨.
		//필요할 때 창문 클래스를 복사해서 객체를 사용함.
	}

	@Override
	public void stop() {
		System.out.println("끼이이이익 뻐네너차");
		w.close();
	}

}
