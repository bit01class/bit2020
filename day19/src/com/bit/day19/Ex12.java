package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

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
		}
		System.out.println("�̿��� �ּż� �����մϴ�");
	}

}
