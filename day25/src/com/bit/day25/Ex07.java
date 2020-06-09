package com.bit.day25;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.3.0)
		String path="data3.bin";
		File file = new File(path);
			try {
				if(!file.exists())file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.3.0)";
		String bar="";
		String input=null;
		for(int i=0; i<title.length(); i++) bar+="--";
		
		System.out.println(title);
		System.out.println(bar);
		System.out.println();
		System.out.println();
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		while(true){
			System.out.print("1.보기 2.입력 0.종료>>");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				break;
			}else if(input.equals("1")){
				System.out.println(bar);
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println(bar);
				try {
					fis=new FileInputStream(file);
					dis=new DataInputStream(fis);
					while(true){
						int su=dis.read();
						if(su==-1)break;
						int num=dis.readInt();
						String name=dis.readUTF();
						int kor=dis.readInt();
						int eng=dis.readInt();
						int math=dis.readInt();
						System.out.print(num+"\t");
						System.out.print(name+"\t");
						System.out.print(kor+"\t");
						System.out.print(eng+"\t");
						System.out.println(math+"\t");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();					
//				} catch (EOFException e){
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						if(dis!=null)dis.close();
						if(fis!=null)fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}else if(input.equals("2")){
				System.out.print("학번>>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>>");
				String name=sc.nextLine();
				System.out.print("국어>>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>>");
				int math=Integer.parseInt(sc.nextLine());
				
				// 임시파일 복사
				File temp=new File("temp.bin");
				try {
					if(!temp.exists())temp.createNewFile();
					fis=new FileInputStream(file);
					fos=new FileOutputStream(temp);
					while(true){
						int su=fis.read();
						if(su==-1)break;
						fos.write(su);
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						if(fis!=null)fis.close();
						if(fos!=null)fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				try {
					fis=new FileInputStream(temp);
					fos=new FileOutputStream(file);
					dis=new DataInputStream(fis);
					dos=new DataOutputStream(fos);
					while(true){
						int su=dis.read();
						if(su==-1)break;
						dos.write(su);
						dos.writeInt(dis.readInt());
						dos.writeUTF(dis.readUTF());
						dos.writeInt(dis.readInt());
						dos.writeInt(dis.readInt());
						dos.writeInt(dis.readInt());						
					}
					dos.write(0);
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						if(dis!=null)dis.close();
						if(dos!=null)dos.close();
						if(fis!=null)fis.close();
						if(fos!=null)fos.close();
						temp.delete();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
				
			}
		}
	}

}


















