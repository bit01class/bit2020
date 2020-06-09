package com.bit.day25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		// ByteArrayStream
		String path="data1.txt";
		File file =new File(path);
		FileInputStream fis=null;
		java.io.ByteArrayOutputStream baos=null;
		java.io.ByteArrayInputStream bais=null;
		try {
			fis=new FileInputStream(file);
			baos=new ByteArrayOutputStream();
			
			while(true){
				int su=fis.read();
				if(su==-1)break;
				baos.write(su);
			}
			byte[] result=baos.toByteArray();
			System.out.println(Arrays.toString(result));
			bais=new ByteArrayInputStream(result);
			while(true){
				int su=bais.read();
				if(su==-1)break;
				System.out.print((byte)su+",");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(baos!=null)baos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}














