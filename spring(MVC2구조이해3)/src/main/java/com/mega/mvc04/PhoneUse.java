package com.mega.mvc04;

public class PhoneUse {
	public static void main(String[] args) {
		ApplePhone ap = new ApplePhone();
		ap.call();
		String a = ap.called("���Ѽ�");
		System.out.println(a);
		ap.text();
	}
}
