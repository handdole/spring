package com.mega.mvc05;

import javax.swing.JOptionPane;


public class CarMain2 {
	public static Window w;
	public static void main(String[] args) {
		Factory factory = new Factory();
		
		String name = JOptionPane.showInputDialog("kcc,lg¡ﬂ º±≈√");
		
		w = (Window) factory.getBean(name);
		Car car = new BananaCar(w);
		car.run();
		car.stop();
	}
}
