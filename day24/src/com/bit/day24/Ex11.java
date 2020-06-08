package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		String path="data.bin";
		File file=new File(path);

		FileReader fr=null;
		char[] cbuf=new char[5];
		try {
			fr=new FileReader(file);
			while(true){
				int su=fr.read(cbuf);
				if(su==-1){break;}
				for(int i=0; i<su; i++){
					System.out.print(cbuf[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













