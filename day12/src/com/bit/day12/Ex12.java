package com.bit.day12;

public class Ex12 {

	public static void main(String[] args) {
		// �ֹι�ȣ�Է�:090206-3124567
        // >> ����� 00�� �����Դϴ�
        
        // �ֹι�ȣ�Է�:990206-2124567
        // >> ����� 00�� �����Դϴ�

        // �ֹι�ȣ�Է�:9902062124567
        // >> �Է������� �ٽ�Ȯ���ϼ���(000000-0000000)
        // �ֹι�ȣ�Է�:99020602124567
        // >> �Է������� �ٽ�Ȯ���ϼ���(000000-0000000)
        // �ֹι�ȣ�Է�:990206-212456
        // >> �ֹι�ȣ �ڸ����� �ٽ� Ȯ���ϼ���
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String input=null;
		char[] ju1=new char[6];
		char[] ju2=new char[7];
		System.out.print("�ֹι�ȣ�Է�:");
		input=sc.nextLine();
		try{
			for(int i=0; i<ju1.length; i++){
				ju1[i]=(char)('0'+Integer.parseInt(""+input.charAt(i)));
			}
			if(input.charAt(6)!='-'){
				Exception err=new Exception();
				throw err;
			}
			for(int i=0; i<ju2.length; i++){
				ju2[i]=(char)('0'+Integer.parseInt(""+input.charAt(i+ju1.length+1)));
			}
		}catch(Exception e){
			System.out.println("�ٽ� Ȯ���Ͻð� �Է����ּ���");
		}
		System.out.println("ó���Ϸ�...");
	}

}


























