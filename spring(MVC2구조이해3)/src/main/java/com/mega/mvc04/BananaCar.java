package com.mega.mvc04;

public class BananaCar implements Car {

	@Override
	public void run() {
		System.out.println("�ٳ��� ���� �����Ŵ�.");
	}

	@Override
	public void speedUp() {
		System.out.println("�ٳ��� ���� ������ ����.");
	}

}
