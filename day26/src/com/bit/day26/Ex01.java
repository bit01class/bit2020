package com.bit.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 {

	public static void main(String[] args) {
		// ObjectStream - needs 객체 직렬화 Serializable
		// 객체 직렬화의 대상의 멤버필드
		String path="data1.bin";
		File file=new File(path);
		
			try {
				if(!file.exists()) file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			Student stu=new Student(1,"홍길동",90,80,70);
			oos.writeObject(stu);
			stu.show();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






















