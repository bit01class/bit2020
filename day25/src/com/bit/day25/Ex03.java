package com.bit.day25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// io���� ����Ʈ��Ʈ���� ���ڿ� ��Ʈ��
		// �׿� �ټ� �̸� ���� ���� ��Ʈ��
		// ���� ��Ʈ�� (���ڷ��̼� ����)
		Scanner sc=new Scanner(System.in);
		
		String path="data1.txt";
		File file=new File(path);
		FileWriter fw=null;
		BufferedWriter bw=null;
		java.io.PrintWriter pw=null;
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			while(true){
				String msg=sc.nextLine();
				if(msg.isEmpty())break;
//				bw.write(msg);
//				bw.newLine();
				pw.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}


















