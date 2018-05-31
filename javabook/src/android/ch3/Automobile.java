package android.ch3;

public class Automobile extends Car {			//<- Car 클래스 상속
	
	int seatNum;									//<- 인스턴스 변수
	int getSeatNum() {
		return seatNum;
	}
	
	void upSpeed(int value) {						//<- 메서드 오버라이딩
		if(speed + value >= 300)
			speed = 300;
		else
			speed = speed +value;
	}

}

