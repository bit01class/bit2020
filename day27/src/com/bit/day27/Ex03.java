package com.bit.day27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File(".\\copy\\7z1900-x64.exe");
		String path="https://www.7-zip.org/a/7z1900-x64.exe";
		URL url=null;
		java.net.URLConnection conn=null;
		java.io.InputStream is=null;
		java.io.InputStreamReader isr=null;
		java.io.OutputStream os=null;
		try {
			url=new URL(path);
			conn=url.openConnection();
			is=conn.getInputStream();
			os=new FileOutputStream(file);
//			isr=new InputStreamReader(is);
			int su=-1;
			while((su=is.read())!=-1){
				os.write(su);
//				System.out.print((char)su);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}







