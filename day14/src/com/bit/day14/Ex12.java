package com.bit.day14;

class Student{
	int num;
	String name;
	int kor,eng,math;
	char gender;
	int age;
	
	Student(int num){
		this.num=num;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("�ѿ�>>");
		int max=Integer.parseInt(sc.nextLine());
		Student[] data=new Student[max];
		int cnt=0;
		while(true){
			System.out.print("1.��� 2.�Է� 3.���� 4.���� 0.����>>");
			String input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("����������������������������������������������������������������������������������������������������������");
				System.out.println("�й�\t���̸�\t������\t������\t������\t�����");				
				System.out.println("����������������������������������������������������������������������������������������������������������");
				for(int i=0; i<data.length; i++){
					Student stu=data[i];
					if(stu==null){continue;}
					System.out.print(stu.num+"\t");
					System.out.print(stu.name+"\t");
					System.out.print(stu.kor+"\t");
					System.out.print(stu.eng+"\t");
					System.out.print(stu.math+"\t");
					System.out.println((stu.kor+stu.eng+stu.math)*100/3/100.0);
				}
				
			}else if(input.equals("2")&&cnt<max){
				Student stu=new Student(++cnt);
				System.out.print("�̸�>>");
				stu.name=sc.nextLine();
				System.out.print("����>>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[cnt-1]=stu;
			}else if(input.equals("3")){
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				Student stu=new Student(num);
				System.out.print("�̸�>>");
				stu.name=sc.nextLine();
				System.out.print("����>>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[num-1]=stu;
			}else if(input.equals("4")){
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				data[num-1]=null;
			}
			
		}
	}

}












