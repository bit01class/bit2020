package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
		// 예외처리
		String msg="1234aaa";
//		for(int i=0; i<msg.length(); i++){
//			if(Character.isDigit(msg.charAt(i))){
//				
//			}else{
//				System.out.println("숫자가 아닌 문자가 들어갔습니다");
//				return ;
//			}
//		}
		try{
			System.out.println("다음줄에서 에러가 발생할수도 있습니다");
			Integer su=new Integer(msg);
			System.out.println("다행히 에러가 없었네요");
			System.out.println("su="+su);
		}catch(NumberFormatException err){
			System.out.println(err.toString());
		}
		System.out.println("프로그램은 실행했었습니다");
	}

}
