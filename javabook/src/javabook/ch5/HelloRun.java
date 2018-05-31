package javabook.ch5;

public class HelloRun {
	
	public void go() {													//<- 일반 메서드
		HelloWorld hello1 = new HelloWorld();							//<- 인스턴스 변수 생성과 생성자 호출
		hello1.print();
		
		HelloWorld hello2 = new HelloWorld("My Hello World!!");		//<- 인스턴스 변수 생성과 생성자 호출
		hello2.print();
		
		HelloWorld hello3 = new HelloWorld("Hello", 2);				//<- 인스턴스 변수 생성과 생성자 호출
		hello3.print();
		
		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());
		
		HelloWorld.prefix = "Greetings: ";								//<- '클래스 이름.변수 이름' 으로 접근
		hello2.print();
		hello3.print();
		
		HelloWorld.prefix = "인사말: ";
		hello2.print();
		hello3.print();
	}
	
	public static void main(String[] args) {							//<- 메인메서드
		HelloRun hr = new HelloRun();									//<- 인스턴스
		hr.go();														//<- go 메서드 호출
	}

}