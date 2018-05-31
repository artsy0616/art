package javabook.ch5;

public class HelloWorldV3 {
	String msg;																//<- 인스턴스 변수
	
	public HelloWorldV3() {												//<- 생성자(인스턴스 변수 초기화)
		msg = "Hello World !!";
	}
	
	public HelloWorldV3(String msg) {									//<- 메서드 오버로딩 .. 생성자(파라미터)
		this.msg = msg;														//<- 변수 이름과 멤버 변수 이름이 같아서 this로 지칭
	}
	
	public HelloWorldV3(String msg, int option) {						//<- 메서드 오버로딩 .. 생성자(파라미터)
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", 안녕하세요?";
	}
	
	public void print() {													//<- 일반 메서드
		System.out.println(msg);
	}

	public static void main(String[] args) {								//<- 메인 메서드
		HelloWorldV3 hello1 = new HelloWorldV3();						//<- 인스턴스 변수 생성과 생성자 호출
		hello1.print();
		HelloWorldV3 hello2 = new HelloWorldV3("My Hello World!!");		//<- 인스턴스 변수 생성과 생성자 호출
		hello2.print();
		HelloWorldV3 hello3 = new HelloWorldV3("Hello", 2);				//<- 인스턴스 변수 생성과 생성자 호출
		hello3.print();
	}

}