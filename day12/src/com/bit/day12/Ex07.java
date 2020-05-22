package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main start...");
		try{
		func01();
		}catch(Exception e){
			System.out.println("È¸ÇÇ");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();//
		}
		System.out.println("main end...");
	}
	
	public static void func01() throws NumberFormatException{
//		NumberFormatException err=new NumberFormatException();
//		throw err;
		int a=Integer.parseInt("a");
	}

}
