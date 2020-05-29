package com.bit.day14;

public class Ex13 {

	public static void main(String[] args) {
		java.util.Random ran=new java.util.Random();
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(ran.nextInt());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(45)+1);// 0,1,2
	}

}
