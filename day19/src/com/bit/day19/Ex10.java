package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.2.0)
		// �ڷᱸ��Ȱ��
		// �޴� 1.���� 2.�Է� 3.���� 4.���� 0.����>>>
		// �й� �̸� ���� ���� ���� �հ� ���
		ArrayList data=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(ver 0.2.0)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>>";
		String input=null;
		
		System.out.println(title);
		for(int i=0; i<title.length(); i++){
			System.out.print("--");
		}
		System.out.println("\n");
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){break;}
			else if(input.equals("2")){
				System.out.print("�й�>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("�̸�>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("����>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("����>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("����>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
			}else if(input.equals("1")){
				System.out.println("----------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("----------------------------------------------");
				for(int i=0; i<data.size(); i++){
					int num=(int)data.get(i++);
					String name=(String)data.get(i++);
					int kor=(int)data.get(i++);
					int eng=(int)data.get(i++);
					int math=(int)data.get(i);
					int tot=kor+eng+math;
					double avg=tot*100/3/100.0;
					System.out.print(num+"\t"+name+"\t"+kor+"\t"+eng
										+"\t"+math+"\t"+tot+"\t"+avg+"\n");
				}
			}else if(input.equals("3")){
				System.out.print("�й�>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				// 0,5,10,15,20
				int idx=-1;
				for(int i=0; i<data.size(); i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;
					}
				}
				if(idx>-1){
					idx++;
					System.out.print("�̸�>");
					input=sc.nextLine();
					data.set(idx++,input);
					System.out.print("����>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("����>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("����>");
					input=sc.nextLine();
					data.set(idx, Integer.parseInt(input));
				}
			}else if(input.equals("4")){
				System.out.print("�й�>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				// 0,5,10,15,20
				int idx=-1;
				for(int i=0; i<data.size(); i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;
					}
				}
				if(idx>-1){
					for(int i=0; i<5; i++){
						data.remove(idx);
					}
				}
			}
		}// while end
		System.out.println("�̿��� �ּż� �����մϴ�");
		
	}

}





























