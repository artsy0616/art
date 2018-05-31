package android.ch3;

class Tiger extends Animal {							//<- 부모 클래스(Animal)에서 상속 받음
	int age;
	void move() {										//<- 재정의 오버라이딩
		System.out.println("네발로 이동한다.");
		
	}

}
