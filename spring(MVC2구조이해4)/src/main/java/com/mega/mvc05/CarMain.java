package com.mega.mvc05;

public class CarMain {
	public static void main(String[] args) {
		KCCWindow w = new KCCWindow();
		Car car = new BananaCar(w);
		car.run();
		car.stop();
	}
}
