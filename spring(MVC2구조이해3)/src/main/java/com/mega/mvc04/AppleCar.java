package com.mega.mvc04;

public class AppleCar implements Car {

	@Override
	public void run() {
		System.out.println("오빠차 뽑았다 널 데리러가");
	}

	@Override
	public void speedUp() {
		System.out.println("내속도는 400km로");
	}

}
