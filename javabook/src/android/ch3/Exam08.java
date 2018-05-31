package android.ch3;

import java.lang.Math;

public class Exam08 {

	public static void main(String[] args) {
		
		//--생성자 추가해서 파라미터 값으로 변경
		Car myCar1 = new Car("빨강", 0);
		Car myCar2 = new Car("파랑", 0);
		Car myCar3 = new Car("초록", 0);
		//--생성자 추가해서 파라미터 값으로 변경
		
		
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메서드) ==> " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);
		
		//--import java.lang.Math;
		System.out.println("PI의 값 ==> " + Math.PI);
		System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));

	}

}
