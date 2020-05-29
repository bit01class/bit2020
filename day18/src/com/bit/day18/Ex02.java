package com.bit.day18;

import java.text.DateFormat;

public class Ex02 {

	public static void main(String[] args) {
		// 주민번호 확인
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String msg=null;
		char[] origin= {'0','1','2','3','4','5','6','7','8','9'};
		char[] target= {'공','일','이','삼','사','오','육','칠','팔','구'};
		int age=1;
		char gender='#';
		while(true){
			System.out.print("주민번호>>");
			msg=sc.nextLine();
			
			System.out.println(msg);
			int year=0;
			try{
				year=Integer.parseInt(msg.substring(0, 2));
			}catch(NumberFormatException e){
				String temp=msg.substring(0, 2);
				char[] temp2=new char[2];
				for(int i=0; i<temp.length(); i++){
					char ch=temp.charAt(i);
					for(int j=0; j<target.length; j++){
						if(target[j]==ch){temp2[i]=origin[j];}
					}
				}
				System.out.println(java.util.Arrays.toString(temp2));
				try{
					year=Integer.parseInt(new String(temp2));
				}catch(NumberFormatException ex){
					System.out.println("입력을 다시 확인하세요");
					continue;
				}
			}
			java.util.Date now=new java.util.Date();
			DateFormat now2 = java.text.DateFormat.getInstance();
			String result = now2.format(now);
			int nowYear=Integer.parseInt(result.substring(0,2));
			gender=msg.charAt(7);
			if(gender=='1'||gender=='2'||gender=='일'||gender=='이') {
				age=(2000+nowYear)-(year+1900)+1;
			}else {
				age=(2000+nowYear)-(year+2000)+1;
			}
			if(gender=='1'||gender=='3'||gender=='일'||gender=='삼') {
				gender='남';
			}else if(gender=='2'||gender=='4'||gender=='이'||gender=='사') {
				gender='여';
			}
			break;
		}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");
	}

}








