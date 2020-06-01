package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.2.0)
		// 자료구조활용
		// 메뉴 1.보기 2.입력 3.수정 4.삭제 0.종료>>>
		// 학번 이름 국어 영어 수학 합계 평균
		ArrayList data=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.2.0)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>>";
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
				Object[] stu=new Object[5];
				System.out.print("학번>");
				stu[0]=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu[1]=sc.nextLine();
				System.out.print("국어>");
				stu[2]=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu[3]=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu[4]=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("1")){
				System.out.println("---------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("---------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					Object[] stu=(Object[])data.get(i);
					int tot=(int)stu[2]+(int)stu[3]+(int)stu[4];
					double avg=tot*100/3/100.0;
					System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]
									+"\t"+stu[4]+"\t"+tot+"\t"+avg);
				}
			}else if(input.equals("4")){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					Object[] stu = (Object[]) data.get(i);
					if((int)stu[0]==num){idx=i;}
				}
				if(idx>-1){data.remove(idx);}else{
					System.out.println("해당 학번이 존재하지 않습니다");
				}
			}else if(input.equals("3")){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<data.size(); i++){
					Object[] stu = (Object[]) data.get(i);
					if((int)stu[0]==num){idx=i;}
				}
				if(idx>-1){
					Object[] stu=new Object[]{num,"-",0,0,0};
					System.out.print("이름>");
					stu[1]=sc.nextLine();
					System.out.print("국어>");
					stu[2]=Integer.parseInt(sc.nextLine());
					System.out.print("영어>");
					stu[3]=Integer.parseInt(sc.nextLine());
					System.out.print("수학>");
					stu[4]=Integer.parseInt(sc.nextLine());
					data.set(idx, stu);
				}else{
					System.out.println("해당 학번이 존재하지 않습니다");
				}
			}
			
		}
		System.out.println("이용해 주셔서 감사합니다");
	}

}






















