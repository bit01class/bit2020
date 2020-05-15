package com.bit.day07;

class Ex06{

  public static int func(int a){
	System.out.println("func run...");
	if(a==0){
		return 0;
	}
	a--;
	return func(a);
  }

  public static void main(String[] args){
	// 메서드의 재귀적 활용
	// 함수 - 재귀함수
	func(5);

  }

}