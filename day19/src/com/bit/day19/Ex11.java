package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

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
				Object[] stu=new Object[5];
				System.out.print("�й�>");
				stu[0]=Integer.parseInt(sc.nextLine());
				System.out.print("�̸�>");
				stu[1]=sc.nextLine();
				System.out.print("����>");
				stu[2]=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu[3]=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu[4]=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("1")){
				System.out.println("---------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("---------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					Object[] stu=(Object[])data.get(i);
					int tot=(int)stu[2]+(int)stu[3]+(int)stu[4];
					double avg=tot*100/3/100.0;
					System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]
									+"\t"+stu[4]+"\t"+tot+"\t"+avg);
				}
			}else if(input.equals("4")){
				System.out.print("�й�>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					Object[] stu = (Object[]) data.get(i);
					if((int)stu[0]==num){idx=i;}
				}
				if(idx>-1){data.remove(idx);}else{
					System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
				}
			}else if(input.equals("3")){
				System.out.print("�й�>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					Object[] stu = (Object[]) data.get(i);
					if((int)stu[0]==num){idx=i;}
				}
				if(idx>-1){
					Object[] stu=new Object[]{num,"-",0,0,0};
					System.out.print("�̸�>");
					stu[1]=sc.nextLine();
					System.out.print("����>");
					stu[2]=Integer.parseInt(sc.nextLine());
					System.out.print("����>");
					stu[3]=Integer.parseInt(sc.nextLine());
					System.out.print("����>");
					stu[4]=Integer.parseInt(sc.nextLine());
					data.set(idx, stu);
				}else{
					System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
				}
			}
			
		}
		System.out.println("�̿��� �ּż� �����մϴ�");
	}

}






















