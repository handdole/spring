package com.mega.mvc04;

public class AppleCar implements Car {

	@Override
	public void run() {
		System.out.println("������ �̾Ҵ� �� ��������");
	}

	@Override
	public void speedUp() {
		System.out.println("���ӵ��� 400km��");
	}

}
