package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		String path="font.zip";
		String path2="font2.zip";
		File file=new File(path);
		File file2=new File(path2);
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		byte[] buf=new byte[32];
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(file);
			fos=new FileOutputStream(file2);
			while(true){
				int su=fis.read(buf,0,buf.length);
//				System.out.println("읽어드린 갯수:"+su);
				if(su==-1){break;}
				fos.write(buf,0,su);
			}
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










