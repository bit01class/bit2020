package com.bit.day08;

class Ex04{
  int su=1234;

  public void plus(){
	su++;
  }

  public void func01(){
	System.out.println("func01 su="+su);
  }

  public static void main(String[] args){
	Ex04 me;
	me=new Ex04();
	//System.out.println(me.su);
	me.func01();
	me.plus();
	me.func01();
	me.plus();
	me.func01();
	me=new Ex04();
	me.plus();
	me.func01();
  }

}




