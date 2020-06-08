package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex04 {
	Ex02 in;

	public static void main(String[] args) {
//		File file=new File("data.bin");
//		try {
//			Scanner sc=new Scanner(file);
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		// -128~127 // 0~255
//		byte[] by={(byte)176,(byte)161};
//		System.out.println(new String(by));
		InputStream inn = System.in;
		try {
			System.out.println(inn.read());
			System.out.println(inn.read());
			System.out.println(inn.read());
			System.out.println(inn.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
