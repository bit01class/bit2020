package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		String path="data.bin";
		String path2="data2.bin";
		
		File src=new File(path);
		File target=new File(path2);
		
		FileReader fr=null;
		FileWriter fw=null;
		char[] cbuf=new char[5];
		try {
			fr=new FileReader(src);
			fw=new FileWriter(target);
			
			while(true){
				int su=fr.read(cbuf,0,cbuf.length);
				if(su==-1){break;}
				fw.write(cbuf,0,su);
			}
			fw.flush();
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}














