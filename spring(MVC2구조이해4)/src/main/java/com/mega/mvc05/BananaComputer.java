package com.mega.mvc05;

public class BananaComputer implements Computer {
	
	Mouse m;
	@Override
	public void start() {
		m = new MickyMouse();
		m.click();
	}

	@Override
	public void off() {
		System.out.println("�ٳ��� ���� ������~");
	}

}
