package com.bit.day12;

public class Ex11 {

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
		char gender='��';
		int age=1;
		boolean boo=false;
		do{
			System.out.print("�ֹι�ȣ�Է�:");
			input=sc.nextLine();
			char[] arr=input.toCharArray();
			///valid///
			if(arr.length==14&&arr[6]=='-'){
					boolean temp=true;
					for(int i=0; i<arr.length; i++){
						if(i==6){continue;}
						if(arr[i]<'0'||arr[i]>'9'){temp=false;break;}
					}
					if(temp){boo=true;}
			}
			///////////
			if(boo){
				char[] arr2=new char[2];
				for(int i=0; i<arr2.length; i++){
					arr2[i]=arr[i];
				}
				String year1=new String(arr2);
				if(arr[7]=='1'||arr[7]=='2'){year1=19+year1;}
				if(arr[7]=='3'||arr[7]=='4'){year1=20+year1;}
				age+=2020-Integer.parseInt(year1);
				if(arr[7]=='1'||arr[7]=='3'){gender='��';}
				System.out.println("����� ���̴� "+age+"���� "+gender+"���Դϴ�");
			}else{
				System.out.println("�ٽ� Ȯ���Ͻð� �Է����ּ���");
			}
		}while(!boo);
	}

}



















