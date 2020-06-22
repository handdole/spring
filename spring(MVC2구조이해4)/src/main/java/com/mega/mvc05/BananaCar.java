package com.mega.mvc05;

public class BananaCar implements Car {
	Window w ; 
	
	public BananaCar(Window w) {
		this.w = w;
	}

	@Override
	public void run() {
		System.out.println("�θ��θ� ���׳���");
		w.open();  // �ּҰ�
		//Car�� Window�� �������̴�. (dependency , �������� �ִ�. )
		//�ڵ�����δ� �ش� ��ü�� �ּҰ��� ������ ��.
		//�ʿ��� �� â�� Ŭ������ �����ؼ� ��ü�� �����.
	}

	@Override
	public void stop() {
		System.out.println("���������� ���׳���");
		w.close();
	}

}
