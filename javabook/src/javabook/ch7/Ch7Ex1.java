package javabook.ch7;

import java.io.*;

public class Ch7Ex1 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		try {
			int input = in.read();
			System.out.println(input);
			out.write(input);
			 out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
