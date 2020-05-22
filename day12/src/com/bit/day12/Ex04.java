package com.bit.day12;

public class Ex04 {

	public static void main(String[] args) {
		String msg="100";
		int[] arr=new int[10];
		try{
			int su = Integer.parseInt(msg);
			double su2=10.0/su;
			arr[su]=(int)su2;
			System.out.println("10/"+msg+"="+su2);
		}catch(Exception e){
			System.out.println("에러를 회피했습니다");
		}
	}

}
