package com.bit.day18;

import java.text.DateFormat;

public class Ex01 {

	public static void main(String[] args) {
		// �ֹι�ȣ Ȯ��
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String msg=null;
		char[] origin= {'0','1','2','3','4','5','6','7','8','9'};
		char[] target= {'��','��','��','��','��','��','��','ĥ','��','��'};
		int age=1;
		char gender='#';
		while(true){
			System.out.print("�ֹι�ȣ>>");
			msg=sc.nextLine();
			if(msg.length()!=14){
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���");
				continue;
			}
			if(msg.charAt(6)!='-'){
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���");
				continue;
			}
			
			//���̻�����-���̻�����ĥ
			for(int i=0; i<msg.length(); i++) {
				if(i==6) {continue;}
				if(!Character.isDigit(msg.charAt(i))){
					for(int j=0; j<target.length; j++) {
						if(msg.charAt(i)==target[j]) {
							String before=msg.substring(0,i);
							String after=msg.substring(i+1);
							msg=before+origin[j]+after;
						}
					}
				}
			}
			boolean boo=false;
			for(int i=0; i<msg.length(); i++){
				if(i==6){continue;}
				char temp=msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println("�Է��� �ٽ� Ȯ���ϼ���");
					boo=true;
					break;
				}
			}
			if(boo){continue;}
			//123456-1234567
			// ('1'-'0')*10+('2'-'0');
			// 000000-0000000 -> ���ϰ�������-��ĥ�ȱ�������
			int year=Integer.parseInt(msg.substring(0, 2));
			java.util.Date now=new java.util.Date();
			DateFormat now2 = java.text.DateFormat.getInstance();
			String result = now2.format(now);
			int nowYear=Integer.parseInt(result.substring(0,2));
			gender=msg.charAt(7);
			if(gender=='1'||gender=='2') {
				age=(2000+nowYear)-(year+1900)+1;
			}else {
				age=(2000+nowYear)-(year+2000)+1;
			}
			if(gender=='1'||gender=='3') {
				gender='��';
			}else if(gender=='2'||gender=='4') {
				gender='��';
			}
			break;
		}
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�");
	}

}








