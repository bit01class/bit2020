package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	private static class Student{
		int num;
		String name;
		int kor,eng,math;
		
		public Student() {
		}
		
		int tot(){
			return kor+eng+math;
		}
		
		double avg(){
			return tot()*100/3/100.0;
		}
	}
	
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
				Student stu=null;
				stu=new Student();
				System.out.print("�й�>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("�̸�>");
				stu.name=sc.nextLine();
				System.out.print("����>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.math=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("1")){
				System.out.println("-------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("-------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng
										+"\t"+stu.math+"\t"+stu.tot()+"\t"+stu.avg());
					
				}
			}else if(input.equals("3")){
				System.out.print("�й�>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					if(stu.num==num){
						System.out.print("����("+stu.kor+")>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("����("+stu.eng+")>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("����("+stu.math+")>");
						stu.math=Integer.parseInt(sc.nextLine());
						break;
					}
				}
			}else if(input.equals("4")){
				System.out.print("�й�>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					if(stu.num==num){
						data.remove(i);
						break;
					}
				}
			}
		}
		System.out.println("�̿��� �ּż� �����մϴ�");
	}

}

















