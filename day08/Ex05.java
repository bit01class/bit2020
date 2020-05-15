package com.bit.day08;

class Ex05{
  static int a=10;
  public static void func1(){
	a++;
}
  public static void main(String[] args){
	int a=1234;
	func1();
	Ex05 me1=new Ex05();
	Ex05.func1();
	Ex05 me2=new Ex05();
	System.out.println("me1 a="+a);	
	System.out.println("me2 a="+a);
	me1.a++;
	System.out.println("me1의 a++");
	System.out.println("me1 a="+me1.a);	
	System.out.println("me2 a="+me2.a);
	me1.a++;
	System.out.println("me1의 a++");
	System.out.println("me1 a="+me1.a);	
	System.out.println("me2 a="+me2.a);
  }

}







