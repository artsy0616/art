package javabook.ch3;

public class Ch3Ex4 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 14;
		
		int result1 = num1 * num2;
		int result2 = num1 % num2;
		
		System.out.printf("resdult : %d \n", result1);
		System.out.printf("resdult : %d \n", result2);
		System.out.println("--------------------");
		
		num1++;
		num2 *= 2;
		System.out.printf("num1++ : %d \n", num1);
		System.out.printf("num2 *= 2 : %d \n", num2);
		System.out.println("--------------------");
		
		System.out.printf("num1++ : %d \n", num1++);
		System.out.printf("--num1 : %d \n", --num1);

	}

}