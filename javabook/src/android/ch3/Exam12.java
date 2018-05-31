package android.ch3;

interface iAnimal{														//<- 다중상속에 대한 구현
	abstract void eat();
}

public class Exam12 {
	
	public static void main(String[] args) {
		iCat cat = new iCat();
		cat.eat();														//<- cat대한 eat를 호출
		
		iTiger tiger = new iTiger();
		tiger.move();
		tiger.eat();
	}
	
	static class iCat implements iAnimal {							//<- 다른 클래스로 구현할 때 implements
		public void eat() {
			System.out.println("생선을 좋아한다.");
		}
	}
	
	static class iTiger extends Animal implements iAnimal {		//<- 상속과 다중상속
		void move() {
			System.out.println("네발로 이동한다.");
		}

		public void eat() {
			System.out.println("멧돼지를 잡아먹는다.");
		}
	}
	
}
