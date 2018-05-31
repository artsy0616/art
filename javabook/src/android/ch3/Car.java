package android.ch3;

public class Car {
	String color;
	int speed = 0;
	
	static int carCount = 0;						//<- 인스턴스 정적변수
	final static int MAXSPEED = 200;				//<- 상수
	final static int MINSPEED = 0;
	
	static int currentCarCount() {				//<- static 정적 메서드
		return carCount;
	}
	
	Car(String color, int speed){
		this.color = color; 
		this.speed = speed;
		carCount++;
	}
	

//	//--생성자 추가
//	Car(String color, int speed){
//		this.color = color;
//		this.speed = speed;
//	}
//	//--생성자 추가
	
	
	//--메서드 오버로딩
	Car(int speed){
		this.speed = speed;
	}
	
	Car(){
		
	}
	
	void upspeed(double valrue) {
		if(speed >= 200)
			speed = 200;
		else
			speed = speed + (int) valrue;		//<- 형변환(캐스트) 연산자
	}
	//--메서드 오버로딩
	
	
	int getSpeed() {
		return speed;
	}
	
	void upSpeed(int value) {
		if (speed + value >= 200)
			speed = 200;
		else
			speed = speed + value;
	}
	
	void downSpeed(int value) {
		if (speed - value <= 0)
			speed = 0;
		else
			speed = speed - value;
	}
	
	String getColor() {
		return color;
	}

}
