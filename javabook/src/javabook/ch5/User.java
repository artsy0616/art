package javabook.ch5;

public class User {
	// 사용자 이름
	private String name;
	
	// 결제 유형 - enum
	private PayType payType;
	
	// 이름과 결제 정보를 파라미터로 가지는 생성자
	public User(String name, PayType payType) {				//<- 생성자로 이름과 결제 정보를 받아서 설정
		this.name = name;										//<- 파라미터값으로 멤버 변수값 초기화
		this.payType = payType;									//<- 파라미터값으로 멤버 변수값 초기화
	}

	public String getName() {									//<- 이름 정보 리턴
		return name;
	}
	
	public void setName(String name) {						//<- 이름 정보 설정
		this.name = name;
	}
	
	public PayType getPayType() {								//<- 결제 정보 리턴
		return payType;
	}
	
	public void setPayType(PayType payType) {					//<- 결제 정보 설정
		this.payType = payType;
	}
}
