package com.mega.mvc04;

public class ApplePhone implements Phone {

	@Override
	public void call() {
		System.out.println("��ȭ �Ŵ��� ...");
	}

	@Override
	public String called(String person) {
		System.out.println("������ ��ȭ ���");
		return "���Ѽ�";
	}

	@Override
	public void text() {
		System.out.println("���ں���.");
	}

}
