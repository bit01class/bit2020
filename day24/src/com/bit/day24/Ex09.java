package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		String path="data.bin";
		File file=new File(path);
		byte[] buf=new byte[10];
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			fis=new FileInputStream(file);
			//��(2)��(2)��(2)��(2) (1)��(2)��(2)��(2)��(2)��(2)
			fos.write("���ڿ��� ����մϴ�".getBytes());
			while(true){
				int su=fis.read(buf);
				if(su==-1){break;}
				System.out.println(new String(buf,0,su));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}














