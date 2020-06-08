package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		String path="font.zip";
		String path2="font2.zip";
		File src=new File(path);
		File target=new File(path2);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		java.io.BufferedInputStream bis=null;
		java.io.BufferedOutputStream bos=null;
		byte[] buf=new byte[8];
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(target);
			
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			
			while(true){
				int su=bis.read(buf);
				if(su==-1){break;}
				bos.write(buf,0,su);
			}
			bos.flush();// 버퍼의 참과 상관없이 작성
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bis!=null){bis.close();}
				if(bos!=null){bos.close();}
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}














