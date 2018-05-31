package javabook.ch5;

public class HelloWorld {
	private String msg;												//<- 인스턴스 변수(private .. 클래스 내에서만 접근이 가능)
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld() {												//<- 생성자(인스턴스 변수 초기화)
		msg = "Hello World !!";
	}
	
	public HelloWorld(String msg) {									//<- 메서드 오버로딩 .. 생성자(파라미터)
		this.msg = msg;													//<- 변수 이름과 멤버 변수 이름이 같아서 this로 지칭
	}
	
	public HelloWorld(String msg, int option) {						//<- 메서드 오버로딩 .. 생성자(파라미터)
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", 안녕하세요?";
	}

	public void print() {												//<- 일반 메서드
		// System.out.println(msg);
		count++;
		System.out.println("[" + count + "]" + prefix + msg);
	}

	public String getMsg() {											//<- getter 메서드로 현재 멤버변수값 리턴
		return msg;
	}

	public void setMsg(String msg) {									//<- setter 메서드로 파라미터로 받은 변수값을 멤버변수값으로 설정
		this.msg = msg;
	}
}


