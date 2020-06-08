package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		String path1="C:\\Users\\bitmap\\Pictures\\data-structure.png";
		File source=new File(path1);
		FileInputStream fis=null;
		
		String path2=".\\copy\\copy.png";
		File target=new File(path2);
		FileOutputStream fos=null;
		File par=new File(target.getParent());
		par.mkdirs();
		try {
			if(!target.exists()){target.createNewFile();}
			fis=new FileInputStream(source);
			fos=new FileOutputStream(target);
			
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				fos.write(su);
			}
			System.out.println("º¹»ç³¡....");
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












