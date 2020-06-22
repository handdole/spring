package com.mega.mvc04;


//인터페이스는 객체 생성 불가 (new 불가 )
//인터페이스 내의 메소드는 불완전함.(추상적 , abstract)
//인터페이스 내의 메소드는 추상 메소드만 써야함.
public interface Car { // 자동차가 되기위한 규격이 들어간다. (기능에 대한 정의 )
	// interface에는 일반변수가 없음.
	// 차가 빨강색만 있는게 아니니까.

	public abstract void run(); // 달려야하는 기능이 있어야함. 기능에 대한 정의만
	// 디폴트 값 : public abstract 
	
	void speedUp(); // 가속기능이 있어야함.
	
	
}
