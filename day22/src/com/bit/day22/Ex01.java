package com.bit.day22;

public class Ex01 extends Thread {

	public void run() {
		System.out.println("thread start...");
		for(int i=0; i<10; i++){
			System.out.println("thread work..");
		}
		System.out.println("thread end...");
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex01 me =new Ex01();
		me.start();
		
		for(int i=0; i<5; i++){
			String temp=new String("test"+i);
			System.out.println("main work...");
		}
		System.out.println("main end...");
	}

}












