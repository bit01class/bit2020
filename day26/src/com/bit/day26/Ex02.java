package com.bit.day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("data1.bin");

		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			Student stu=(Student) ois.readObject();
			stu.show();
			System.out.println("�й�:"+stu.num);
			System.out.println("�̸�:"+stu.name);
			System.out.println("����:"+stu.kor);
			System.out.println("����:"+stu.eng);
//			System.out.println("����:"+stu.math);
			System.out.println(stu);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}













