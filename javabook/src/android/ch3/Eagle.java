package android.ch3;

class Eagle extends Animal {							//<- 부모 클래스(Animal)에서 상속 받음
	String home;
	void move() {										//<- 재정의 오버라이딩
		System.out.println("날개로 이동한다.");
		
	}

}
