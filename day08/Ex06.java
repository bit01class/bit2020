package com.bit.day08;

class Ex66{
	static int su1=1234;
	int su2=4321;
}

class Ex06{

  public static void main(String[] args){
	System.out.println(com.bit.day08.Ex66.su1);	
	System.out.println(Ex66.su1);
	Ex66 you =new Ex66();
	System.out.println(you.su2);	
  }

}