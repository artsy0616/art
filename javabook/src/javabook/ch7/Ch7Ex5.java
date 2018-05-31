package javabook.ch7;

import java.io.*;
import java.util.*;

public class Ch7Ex5 {

	public static void main(String[] args) {
		System.out.println("## 간단 메모장 v1.0 ##");
		System.out.println("## 저장할 파일명: ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		System.out.println("## 저장은 마지막 라인에 q 입력\n");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:/dev/" + filename));
			String s;
			while(!(s = reader.readLine()).equals("q")) {
				writer.write(s + "/r/n");
			}
			reader.close();
			writer.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("## 프로그램을 종료합니다.");
		System.out.println(filename + " 저장되었습니다.!!");
	}
}
