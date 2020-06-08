package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> data=null;
		data=new ArrayList<>();
		String path="data.bin";
		// Map Ȱ�� �����������α׷�
		// data loading
		File loadFile=new File(path);
		FileInputStream fis=null;
		ArrayList<Byte> buf=new ArrayList<>();
		if(loadFile.exists()){
			try {
				fis=new FileInputStream(loadFile);
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					buf.add((byte)su);
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
		
			Object[] obj=buf.toArray();
			byte[] by=new byte[obj.length];
			
			for(int i=0; i<by.length; i++){
				by[i]=(byte)obj[i];
			}
			String msg=new String(by);
			String[] msgs=msg.split("\n");
			for(int i=0; i<msgs.length; i++){
				String temp=msgs[i];
				String[] ele=temp.split(",");
				HashMap<String,String> map=new HashMap<>();
				map.put("num", ele[0]);
				map.put("name", ele[1]);
				map.put("kor", ele[2]);
				map.put("eng", ele[3]);
				map.put("math", ele[4]);
				data.add(map);
			}
		}
		/////
		String title="�����������α׷�(ver 0.2.2)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		System.out.println(title);
		System.out.println("-------------------------------\n\n");
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer,Object[]> data2=null;
		HashMap<Integer,Object> data3=null;
		HashMap<Integer,HashMap<String,Object>> data4=null;
		
		
		String input=null;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				// save
				String tempDate="";
				File file=new File(path);
				FileOutputStream fos=null;
				// ���Ͽ� �����͸� �ۼ��ϱ� ����
				// ���� ������ �������� ������ ������ ����
				if(!file.exists()){
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				// ���Ͽ� �����͸� ���� �ۼ��ϱ� ����
				// �����͸� ���ڿ��� ����
				// ���� ���ڿ��� �о�帱 �� 
				// �󸶸�ŭ ������ �о�帱�� ���д����� ����
				// ���л��� \n�� ��������
				// ���л��� �� ������(�й�,�̸�,����,����,����)�� ,�� ��������
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu=data.get(i);
					String num=stu.get("num");
					String name=stu.get("name");
					String kor=stu.get("kor");
					String eng=stu.get("eng");
					String math=stu.get("math");
					tempDate+=num+","+name+","+kor+","+eng+","+math+"\n";
				}
				// ������� ���ڿ��� ���Ͽ� �ۼ�
				try {
					fos=new FileOutputStream(file);
					byte[] su=tempDate.getBytes();
					for(int i=0; i<su.length; i++){
						fos.write((int)su[i]);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						if(fos!=null){fos.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}else if("1".equals(input)){
				//����
				System.out.println("--------------------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("--------------------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu=data.get(i);
					int num=Integer.parseInt(stu.get("num"));
					String name=stu.get("name");
					int kor=Integer.parseInt(stu.get("kor"));
					int eng=Integer.parseInt(stu.get("eng"));
					int math=Integer.parseInt(stu.get("math"));
					int total=kor+eng+math;
					double avg=total*100/3/100.0;
					System.out.print(num+"\t");
					System.out.print(name+"\t");
					System.out.print(kor+"\t");
					System.out.print(eng+"\t");
					System.out.print(math+"\t");
					System.out.print(total+"\t");
					System.out.println(avg);
				}
				System.out.println("--------------------------------------------------------------");
			}else if("2".equals(input)){
				//�Է�
				HashMap<String,String> stu=null;
				stu=new HashMap<>();
				System.out.print("�й�>>");
				stu.put("num", sc.nextLine());
				System.out.print("�̸�>>");
				stu.put("name", sc.nextLine());
				System.out.print("����>>");
				stu.put("kor", sc.nextLine());
				System.out.print("����>>");
				stu.put("eng", sc.nextLine());
				System.out.print("����>>");
				stu.put("math", sc.nextLine());
				data.add(stu);
			}else if("3".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						stu.put("num",input);
						System.out.print("�̸�>>");
						stu.put("name", sc.nextLine());
						System.out.print("����>>");
						stu.put("kor", sc.nextLine());
						System.out.print("����>>");
						stu.put("eng", sc.nextLine());
						System.out.print("����>>");
						stu.put("math", sc.nextLine());
					}
				}
			}else if("4".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						data.remove(i);
						break;
					}
				}
			}else{
				System.out.println("�Է¿���");
				System.out.println("�ٽ�Ȯ���Ͻð� �Է��ϼ���");
			}
		}
	}

}













