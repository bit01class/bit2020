package com.bit.day13;

public class Ex08 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.1.0)
		// ���ڿ��̿�
		
		// 1.���� 2.�Է� 3.���� 4.���� 0.����>>2
		// ����>
		// ����>
		// ����>
		//
		// 1.���� 2.�Է� 3.���� 4.���� 0.����>>1
		//
		// �й�	������	������	������	������	���հ�		�����
		// ------------------------------------------------------
		// 1	����浿	��90		��90		��90		��270		��90
		// 2	���̸���	��90		��90		��90		��270		��90
		// 3	��ȫ�浿	��90		��90		��90		��270		��90
		//
		// 1.���� 2.�Է� 3.���� 4.���� 0.����>>3
		// �й�>
		// ����>
		// ����>
		// ����>
		//
		// 1.���� 2.�Է� 3.���� 4.���� 0.����>>4
		// �й�>
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String title="�л������������α׷�(ver 0.1.0)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
//		String input="";
		int input=0;
		
		String data="�й�\t������\t������\t������\t���հ�\t�����\n";
		data+="������������������������������������������������������������������������������������������������������������\n";
		System.out.println(title);
		System.out.println("-------------------------------------------------");
		int cnt=0;
		while(true){
			System.out.print(menu);
//			input=sc.nextLine();
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println(data);
			}
			if(input==2){
				cnt++;
				System.out.print("����>>");
				int kor=sc.nextInt();
				System.out.print("����>>");
				int eng=sc.nextInt();
				System.out.print("����>>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum*100/3/100.0;
				data+=cnt+"\t��"+kor+"\t��"+eng+"\t��"+math+"\t��"+sum+"\t��"+avg+"\n";
			}
			if(input==3){
				System.out.print("�й�>>");
				int num=sc.nextInt();
				System.out.print("����>>");
				int kor=sc.nextInt();
				System.out.print("����>>");
				int eng=sc.nextInt();
				System.out.print("����>>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum*100/3/100.0;
				
				String msg=num+"\t��"+kor+"\t��"+eng+"\t��"+math+"\t��"+sum+"\t��"+avg;
				
				int idx=data.indexOf("\n"+num);
				String data1=data.substring(0,idx+1);
				String data2=data.substring(data.indexOf("\n",idx+1));
				data=data1+msg+data2;
			}
			if(input==4){
				System.out.print("�й�>>");
				int num=sc.nextInt();
				
				int idx=data.indexOf("\n"+num);
				String data1=data.substring(0,idx+1);
				String data2=data.substring(data.indexOf("\n",idx+1));
				data=data1+data2;
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}





















