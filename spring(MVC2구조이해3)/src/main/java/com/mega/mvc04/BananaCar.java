package com.mega.mvc04;

public class BananaCar implements Car {

	@Override
	public void run() {
		System.out.println("바나나 차가 나가신다.");
	}

	@Override
	public void speedUp() {
		System.out.println("바나나 차가 가속을 낸다.");
	}

}
