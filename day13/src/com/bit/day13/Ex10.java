package com.bit.day13;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String title="�л������������α׷�(ver 0.1.0)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		// �й� ���� ���� ����
		System.out.print("���ο�:");
		int su=sc.nextInt();
		
		int[][] data=null;
		data=new int[su][];
		System.out.println(title);
		System.out.println("------------------------------");
		int input=0;
		int idx=0;
		int cnt=0;
		while(true){
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0){break;}
			if(input==2&&su>cnt){
				int[] stu=new int[4];
				data[idx++]=stu;
				cnt++;
				stu[0]=cnt;
				System.out.print("����>>");
				stu[1]=sc.nextInt();
				System.out.print("����>>");
				stu[2]=sc.nextInt();
				System.out.print("����>>");
				stu[3]=sc.nextInt();
			}
			if(input==1){
				System.out.println("�й�\t������\t������\t������\t���հ�\t�����");
				System.out.println("������������������������������������������������������������������������������������������������������������");
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					System.out.print(stu[0]+"\t��");
					System.out.print(stu[1]+"\t��");
					System.out.print(stu[2]+"\t��");
					System.out.print(stu[3]+"\t��");
					System.out.print(stu[1]+stu[2]+stu[3]+"\t��");
					System.out.println((stu[1]+stu[2]+stu[3])*100/3/100.0);
				}
			}
			if(input==4){
				int tmp=-1;
				System.out.print("�й�>>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					if(stu[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=null;}
				
			}
			if(input==3){
				int tmp=-1;
				int[] stu=new int[4];
				System.out.print("�й�>>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu2=data[i];
					if(stu2==null){continue;}
					if(stu2[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=stu;}
				stu[0]=cnt;
				System.out.print("����>>");
				stu[1]=sc.nextInt();
				System.out.print("����>>");
				stu[2]=sc.nextInt();
				System.out.print("����>>");
				stu[3]=sc.nextInt();
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}













