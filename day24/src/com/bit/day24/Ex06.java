package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		String path="data.bin";
		File file=new File(path);
		FileInputStream fis=null;
//		List<Byte> list=new ArrayList<Byte>();
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				int cnt=0;
				while(true){
					byte[] buf=new byte[34];
//				for(int i=0; i<file.length(); i++){
					int su=fis.read(buf);
					if(su==-1){break;}
//					list.add((byte)su);
					System.out.println("cnt:"+(++cnt));
					System.out.println(new String(buf));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(fis!=null){fis.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
//			byte[] bys=list.toArray(new byte[0]);
//			byte[] by=new byte[list.size()];
//			for(int i=0; i<list.size(); i++){
//				by[i]=list.get(i);
//			}
//			System.out.println(new String(by));
		}
	}

}

















