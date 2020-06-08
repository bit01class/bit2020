package com.bit.day21;

import java.io.File;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		String path=".";
		File file=new File(path);
		if(file.exists()){
			String[] temp=file.list();
			String[] dirs=new String[temp.length+2];
			dirs[0]=".";
			dirs[1]="..";
			System.arraycopy(temp, 0, dirs, 2, temp.length);
			for(int i=0; i<dirs.length; i++){
				String filename=dirs[i];
				File f=new File(filename);
				long time=f.lastModified();
				Date day=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat();
				sdf.applyPattern("YYYY-MM-dd a hh:mm");
				String msg=sdf.format(day);
				System.out.print(msg+"\t");
				if(f.isDirectory()){
					System.out.print("<DIR>\t");
				}else{
					System.out.print("\t"+f.length());					
				}
				
				
				System.out.print("\t");
				System.out.println(dirs[i]);
				
			}
			
		}else{
			System.out.println("err");
		}
	}

}
















