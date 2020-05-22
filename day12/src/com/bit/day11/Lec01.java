package com.bit.day11;

public class Lec01 {
	//클래스의 접근제한자 - public , default
	//그외 
	//public > protected >= default > private
	// protected - default와 같으나 상속을 통해서는 추가 접근허용
	protected Lec01(){}
	
	protected int su;
	
	protected void func01(){
		System.out.println("Lec01 func01()...");
	}

}
