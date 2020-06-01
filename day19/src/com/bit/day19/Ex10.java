package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {

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
				System.out.print("학번>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("이름>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("국어>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("영어>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("수학>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
			}else if(input.equals("1")){
				System.out.println("----------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------------------");
				for(int i=0; i<data.size(); i++){
					int num=(int)data.get(i++);
					String name=(String)data.get(i++);
					int kor=(int)data.get(i++);
					int eng=(int)data.get(i++);
					int math=(int)data.get(i);
					int tot=kor+eng+math;
					double avg=tot*100/3/100.0;
					System.out.print(num+"\t"+name+"\t"+kor+"\t"+eng
										+"\t"+math+"\t"+tot+"\t"+avg+"\n");
				}
			}else if(input.equals("3")){
				System.out.print("학번>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				// 0,5,10,15,20
				int idx=-1;
				for(int i=0; i<data.size(); i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;
					}
				}
				if(idx>-1){
					idx++;
					System.out.print("이름>");
					input=sc.nextLine();
					data.set(idx++,input);
					System.out.print("국어>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("영어>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("수학>");
					input=sc.nextLine();
					data.set(idx, Integer.parseInt(input));
				}
			}else if(input.equals("4")){
				System.out.print("학번>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				// 0,5,10,15,20
				int idx=-1;
				for(int i=0; i<data.size(); i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;
					}
				}
				if(idx>-1){
					for(int i=0; i<5; i++){
						data.remove(idx);
					}
				}
			}
		}// while end
		System.out.println("이용해 주셔서 감사합니다");
		
	}

}





























