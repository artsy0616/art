package javabook.ch5;

// Product 추상 클래스를 상속받아 구현한 CellPhone 클래스
public class CellPhone extends Product {
	String carrier;																//<- 통신사
	
	public CellPhone(String pname, int price, String carrier) {				//<- 생성자 상품 이름, 가격, 통신사 정보를 받아서 처리
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	
	@Override
	public void printExtra() {												//<- 인터페이스에 정의된 추상 메서드를 오버라이딩.
		System.out.println("통신사: " + carrier);								//	추가 정보인 통신사 정보를 출력
	}
}
