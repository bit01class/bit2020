package com.bit.day08;

class Ex03{
  static int a;

  public static void func01(){
	a++;
	System.out.println("a="+a);
  }

  public static void func02(){
	a++;
	int b=a;
	System.out.println("b="+b);
  }

  public static void main(String[] args){
	a=1234;
	func01();
	func02();
  }


}