package com.bit.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

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
		}
		System.out.println("이용해 주셔서 감사합니다");
	}

}
