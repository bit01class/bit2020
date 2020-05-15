package com.bit.day07;

public class Ex01{
  // 메서드
  // 1. 정적메서드,클래스메서드,static메서드...
  // 2. 인스턴스 메서드,non-static 메서드...

  public void func01(){
	System.out.println("non-static method...");
	System.out.println("인스턴스 메서드");
  }

  public static void func02(){
	System.out.println("static메서드");
	System.out.println("클래스메서드");
	System.out.println("정적메서드");
  }

  public static void main(String[] args){
	func02();
	System.out.println("----------------");
	// 클래스명 참조변수 = new 클래스명();
	Ex01 me=new Ex01();
	me.func01();
	System.out.println("----------------");
	me.func02();//(비권장)
  }

}









