package com.bit.day13;

public class Ex08 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.1.0)
		// 문자열이용
		
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>>2
		// 국어>
		// 영어>
		// 수학>
		//
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>>1
		//
		// 학번	│성명	│국어	│영어	│수학	│합계		│평균
		// ------------------------------------------------------
		// 1	│김길동	│90		│90		│90		│270		│90
		// 2	│이말자	│90		│90		│90		│270		│90
		// 3	│홍길동	│90		│90		│90		│270		│90
		//
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>>3
		// 학번>
		// 국어>
		// 영어>
		// 수학>
		//
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>>4
		// 학번>
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.1.0)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
//		String input="";
		int input=0;
		
		String data="학번\t│국어\t│영어\t│수학\t│합계\t│평균\n";
		data+="──────────────────────────────────────────────────────\n";
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
				System.out.print("국어>>");
				int kor=sc.nextInt();
				System.out.print("영어>>");
				int eng=sc.nextInt();
				System.out.print("수학>>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum*100/3/100.0;
				data+=cnt+"\t│"+kor+"\t│"+eng+"\t│"+math+"\t│"+sum+"\t│"+avg+"\n";
			}
			if(input==3){
				System.out.print("학번>>");
				int num=sc.nextInt();
				System.out.print("국어>>");
				int kor=sc.nextInt();
				System.out.print("영어>>");
				int eng=sc.nextInt();
				System.out.print("수학>>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum*100/3/100.0;
				
				String msg=num+"\t│"+kor+"\t│"+eng+"\t│"+math+"\t│"+sum+"\t│"+avg;
				
				int idx=data.indexOf("\n"+num);
				String data1=data.substring(0,idx+1);
				String data2=data.substring(data.indexOf("\n",idx+1));
				data=data1+msg+data2;
			}
			if(input==4){
				System.out.print("학번>>");
				int num=sc.nextInt();
				
				int idx=data.indexOf("\n"+num);
				String data1=data.substring(0,idx+1);
				String data2=data.substring(data.indexOf("\n",idx+1));
				data=data1+data2;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}





















