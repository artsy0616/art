package calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.Calculator;

public class CalculatorTest {

	@Test
	public void testMultiple() {
		// 하단의 내용은 기본 세팅되는 내용! 주석처리합니다.
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		assertEquals(63, cal.multiple(7, 9));
	}

}
