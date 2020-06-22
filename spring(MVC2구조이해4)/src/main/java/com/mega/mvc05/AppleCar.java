package com.mega.mvc05;

public class AppleCar implements Car {
	Window w ; 
	
	public AppleCar(Window w) {
		this.w = w;
	} 

	@Override
	public void run() {
		System.out.println("�θ��θ� ����ī");
		w.open();  // �ּҰ�
		//Car�� Window�� �������̴�. (dependency , �������� �ִ�. )
		//�ڵ�����δ� �ش� ��ü�� �ּҰ��� ������ ��.
		//�ʿ��� �� â�� Ŭ������ �����ؼ� ��ü�� �����.
	}

	@Override
	public void stop() {
		System.out.println("���������� ����ī");
		w.close();
	}

}
