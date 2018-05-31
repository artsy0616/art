package javabook.ch5;

public class HelloWorldV1 {
	String msg;																//<- 인스턴스 변수
	
	public HelloWorldV1() {												//<- 생성자(인스턴스 변수 초기화)
		msg = "Hello World !!";
	}
	
	public void print() {													//<- 일반 메서드
		System.out.println(msg);
	}

	public static void main(String[] args) {								//<- 메인 메서드
		HelloWorldV1 hello1 = new HelloWorldV1();						//<- 인스턴스 변수 생성과 생성자 호출
		hello1.print();

	}

}
