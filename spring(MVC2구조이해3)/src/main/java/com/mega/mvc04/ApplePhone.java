package com.mega.mvc04;

public class ApplePhone implements Phone {

	@Override
	public void call() {
		System.out.println("전화 거는중 ...");
	}

	@Override
	public String called(String person) {
		System.out.println("부재중 전화 기록");
		return "박한솔";
	}

	@Override
	public void text() {
		System.out.println("문자보냄.");
	}

}
