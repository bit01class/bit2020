package com.bit.day14;

public class Ex11 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.1.1)
		// �й� �̸� ���� ���� ����
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] data=null;
		System.out.print("�ѿ�>>");
		int limit=Integer.parseInt(sc.nextLine());
		data=new String[limit];
		int err=0;
		int cnt=0;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			String input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){err=0;
				//����
				System.out.println("����������������������������������������������������������������������������������������������������������");
				System.out.println("�й�\t���̸�\t������\t������\t������\t�����");				
				System.out.println("����������������������������������������������������������������������������������������������������������");
				for(int i=0; i<data.length; i++){
					if(data[i]==null){continue;}
					String msg=data[i];
					String[] stu=msg.split(",");
					int num=Integer.parseInt(stu[0]);
					String name=stu[1];
					int kor=Integer.parseInt(stu[2]);
					int eng=Integer.parseInt(stu[3]);
					int math=Integer.parseInt(stu[4]);
					double avg=(kor+eng+math)*100/3/100.0;
					System.out.println(num+"\t��"+name+"\t��"+kor+"\t��"+eng+"\t��"+math+"\t��"+avg);
				}
				System.out.println("����������������������������������������������������������������������������������������������������������\n");
			}else if(input.equals("2")){err=0;
				//�Է�
			    if(cnt<limit){
					cnt++;
					System.out.print("�̸�>>");
					String name=sc.nextLine();
					System.out.print("����>>");
					int kor=Integer.parseInt(sc.nextLine());
					System.out.print("����>>");
					int eng=Integer.parseInt(sc.nextLine());
					System.out.print("����>>");
					int math=Integer.parseInt(sc.nextLine());
					
					data[cnt-1]=cnt+","+name+","+kor+","+eng+","+math;
			    }else{
			    	System.out.println("�Է��� �л��� �����ϴ�");
			    }
			}else if(input.equals("3")){err=0;
				//����
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.print("�̸�>>");
				String name=sc.nextLine();
				System.out.print("����>>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>>");
				int math=Integer.parseInt(sc.nextLine());
				
				data[num-1]=num+","+name+","+kor+","+eng+","+math;
				
			}else if(input.equals("4")){err=0;
				//����
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				data[num-1]=null;
			}else{
				err++;
				System.out.println("�޴��� Ȯ���Ͻð� �Է����ּ���\n\n");
				if(err>3){
					System.out.println("�̿����� �ٽ� Ȯ���Ͻð� �̿�ٶ��ϴ�");
					break;
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}





