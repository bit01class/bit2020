package com.bit.day26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex04 {

	public static void main(String[] args) {
		InputStream is=null;
		java.io.InputStreamReader isr=null;
		java.io.OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		char[] cbuf=new char[5];
		try {
//			is=new FileInputStream("test01.txt");
//			isr=new InputStreamReader(is);
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			osw=new OutputStreamWriter(System.out);
			bw= new BufferedWriter(osw);
			pw=new PrintWriter(bw);
			String msg=null;
			while((msg=br.readLine())!=null){
				pw.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













