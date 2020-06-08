package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		// ByteStream - input

		File file=new File("ex08.bin");
		java.io.FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(file);
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}











