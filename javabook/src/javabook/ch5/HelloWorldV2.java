package javabook.ch5;

public class HelloWorldV2 {
	String msg;																//<- 인스턴스 변수
	
	public HelloWorldV2() {												//<- 생성자(인스턴스 변수 초기화)
		msg = "Hello World !!";
	}
	
	public HelloWorldV2(String msg) {									//<- 메서드 오버로딩 .. 생성자(파라미터)
		this.msg = msg;														//<- 변수 이름과 멤버 변수 이름이 같아서 this로 지칭
	}
	
	public void print() {													//<- 일반 메서드
		System.out.println(msg);
	}

	public static void main(String[] args) {								//<- 메인 메서드
		HelloWorldV2 hello1 = new HelloWorldV2();						//<- 인스턴스 변수 생성과 생성자 호출
		hello1.print();
		HelloWorldV2 hello2 = new HelloWorldV2("My Hello World!!");		//<- 인스턴스 변수 생성과 생성자 호출
		hello2.print();

	}

}
