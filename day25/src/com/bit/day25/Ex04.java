package com.bit.day25;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String path="data1.txt";
		File file = new File(path);
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		java.io.PrintStream ps=null;
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			ps=new PrintStream(bos);
			while(true){
				String msg=sc.nextLine();
				if(msg.isEmpty())break;
				byte[] by=msg.getBytes();
//				fos.write(by);
//				fos.write("\r\n".getBytes());
//				bos.write(by);
				ps.println(msg);
				System.out.write(by);
//				System.out.println(Arrays.toString(by));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ps!=null)ps.close();
				if(bos!=null)bos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}














