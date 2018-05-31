package javabook.ch7;

import java.io.*;


public class Ch7Ex3 {

	public static void main(String[] args) {
		String path = "c:/dev/tmpfile.txt";
		File file = new File(path);
		
		try {
			FileWriter fw = new FileWriter(file);
			for(int i = 'A'; i <= 'z'; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("Done...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}