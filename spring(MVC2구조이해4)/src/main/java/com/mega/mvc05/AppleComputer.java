package com.mega.mvc05;

public class AppleComputer implements Computer {
	
	Mouse m;
	
	@Override
	public void start() {
		m = new MiniMouse();
		m.click();
	}

	@Override
	public void off() {
		System.out.println("컴터가 꺼집니당.");
	}

}
