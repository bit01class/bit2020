package com.bit.day25;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String path="data2.bin";
		File file=new File(path);
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			dis=new DataInputStream(bis);
			
			byte su1=0;
			short su2=0;
			int su3=0;
			long su4=0;
			float su5=0;
			double su6=0;
			char ch='@';
			boolean boo=false;
			String msg=null;
			
			int su=dis.read();
			su1=dis.readByte();
			su2=dis.readShort();
			su3=dis.readInt();
			su4=dis.readLong();
			su5=dis.readFloat();
			su6=dis.readDouble();
			ch=dis.readChar();
			boo=dis.readBoolean();
			msg=dis.readUTF();
			System.out.println(su);
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su5);
			System.out.println(su6);
			System.out.println(ch);
			System.out.println(boo);
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dis!=null)dis.close();
				if(bis!=null)bis.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}














