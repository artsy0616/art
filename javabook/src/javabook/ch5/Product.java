package javabook.ch5;

// 쇼핑몰 상품 정의를 위한 추상 클래스,
// 다양한 상품 종류를 지원하려고 기본 정보 설정과 출력만 추상 클래스에서 지정하고
// 추가 정보는 서브 클래스에서 구현하도록 유도한다.
public abstract class Product {
	// 상품 이름과 가격 변수
	String pname;
	int price;
	
	// 상품 이름과 가격을 출력하는 기본 정보 출력 메서드
	public void printDetail() {
		System.out.print("상품명: " + pname + " , ");
		System.out.print("가격: " + price + " , ");
		printExtra();											//<- printExtra() 메서드를 호출하여 추가 정보를 출력
	}
	
	public abstract void printExtra();						//<- 추가 정보를 출력하는 메서드. 추상 메서드로 선언해서 Product 클래스를 상속받는
																//	클래스에서 구현해야함. 내용은 printDetail() 메서드에서 호출하여 실행
}
