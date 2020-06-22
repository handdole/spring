package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //������ ������ ��ũ�� ���� ��Ʈ�ѷ��� ��� ����ϴ� ��Ȱ / ��Ʈ�ѷ� ����� �޾Ƽ� ��Ȱ
public class CarController {
	
	@Autowired //�������� �ξ��ִ� ���� �ּҸ� ������ �ȴ�. / �Ѱ��̸� �̰� �ѹ��� ���ָ��.
	@Qualifier("car1") // ã�Ƽ� ������ ��ü�� 2���̻��� �� (car1�� bean�� �̸�)
	Car car;
	//�ܺ� ���Ͽ��� ���� �ּҸ� car������ spring�� ã�Ƽ� �־���.
	//car ����̳� , ������ ��ü�� ������ �ּҸ� ã�Ƽ� ����
	
	
	@RequestMapping("car1.do")
	public void run1() {
		car.run();
	}
}
