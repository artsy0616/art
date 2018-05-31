package javabook.ch5;

// 쇼핑몰 규격을 정의한 인터페이스, 모든 쇼핑몰은 IShop 인터페이스를 구현해야 한다. 
public interface IShop {
	public abstract void setTitle(String title);				//<- 쇼핑몰 제목 이름 설정
	public abstract void genUser();								//<- 사용자 생성
	public abstract void genProduct();							//<- 상품 생성
	public abstract void start();								//<- 실행하는 시작 메서드
}
