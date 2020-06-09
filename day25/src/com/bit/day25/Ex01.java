package com.bit.day25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path="data1.txt";
		File file = new File(path);
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			while(true){
				String msg=sc.nextLine();
				if(msg.equals("/exit"))break;
				fw.write(msg);
				fw.write("\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}











