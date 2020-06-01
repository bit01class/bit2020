package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	private static class Student{
		int num;
		String name;
		int kor,eng,math;
		
		public Student() {
		}
		
		int tot(){
			return kor+eng+math;
		}
		
		double avg(){
			return tot()*100/3/100.0;
		}
	}
	
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
				Student stu=null;
				stu=new Student();
				System.out.print("학번>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("1")){
				System.out.println("-------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng
										+"\t"+stu.math+"\t"+stu.tot()+"\t"+stu.avg());
					
				}
			}else if(input.equals("3")){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					if(stu.num==num){
						System.out.print("국어("+stu.kor+")>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("영어("+stu.eng+")>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("수학("+stu.math+")>");
						stu.math=Integer.parseInt(sc.nextLine());
						break;
					}
				}
			}else if(input.equals("4")){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=(Student) data.get(i);
					if(stu.num==num){
						data.remove(i);
						break;
					}
				}
			}
		}
		System.out.println("이용해 주셔서 감사합니다");
	}

}

















