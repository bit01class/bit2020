package com.bit.day07;

class Ex08{

  public static void main(String[] args){
	System.out.println("main start...");
	for(int i=1; i<11; i++){
		System.out.print("확인 ");
		if(i%2!=0){continue;}
		//if(i>2){break;}
		//if(i>2){return;}
		System.out.println("반복"+(i));
	}
	System.out.println("main end...");
  }

}