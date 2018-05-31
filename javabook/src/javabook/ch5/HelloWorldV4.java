package javabook.ch5;

public class HelloWorldV4 {
	private String msg;													//<- 인스턴스 변수(private .. 클래스 내에서만 접근이 가능)
	
	public HelloWorldV4() {												//<- 생성자(인스턴스 변수 초기화)
		msg = "Hello World !!";
	}
	
	public HelloWorldV4(String msg) {									//<- 메서드 오버로딩 .. 생성자(파라미터)
		this.msg = msg;														//<- 변수 이름과 멤버 변수 이름이 같아서 this로 지칭
	}
	
	public HelloWorldV4(String msg, int option) {						//<- 메서드 오버로딩 .. 생성자(파라미터)
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", 안녕하세요?";
	}

	public String getMsg() {												//<- getter 메서드로 현재 멤버변수값 리턴
		return msg;
	}

	public void setMsg(String msg) {										//<- setter 메서드로 파라미터로 받은 변수값을 멤버변수값으로 설정
		this.msg = msg;
	}

	public void print() {													//<- 일반 메서드
		System.out.println(msg);
	}

	public static void main(String[] args) {								//<- 메인 메서드
		HelloWorldV4 hello1 = new HelloWorldV4();						//<- 인스턴스 변수 생성과 생성자 호출
		hello1.print();
		HelloWorldV4 hello2 = new HelloWorldV4("My Hello World!!");		//<- 인스턴스 변수 생성과 생성자 호출
		hello2.print();
		HelloWorldV4 hello3 = new HelloWorldV4("Hello", 2);				//<- 인스턴스 변수 생성과 생성자 호출
		hello3.print();
		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());
	}

}
