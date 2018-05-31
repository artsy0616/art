package javabook.ch5;

// Product 추상 클래스를 상속받아 구현한 SmartTV 클래스
public class SmartTV extends Product {
	String resolution;															//<- 해상도
	
	public SmartTV(String pname, int price, String resoltion) {				//<- 생성자 상품 이름, 가격, 해상도 정보를 받아서 처리
		this.pname = pname;
		this.price = price;
		this.resolution = resoltion;
	}
	
	@Override
	public void printExtra() {												//<- 인터페이스에 정의된 추상 메서드를 오버라이딩.
		System.out.println("해상도: " + resolution);							//	추가 정보인 해상도 정보를 출력
	}
}
