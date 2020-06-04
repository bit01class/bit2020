package com.bit.day22;

public class Ex04 {

	public static void main(String[] args) {
		Thread me = Thread.currentThread();
		System.out.println(me.getName()+" start...");
		
		Thread thr=new Thread(){
			public void run(){
				Thread you = Thread.currentThread();
				System.out.println(you==this);
				System.out.println(you.getName()+"start...");
				for(int i='A'; i<='Z'; i++){
					System.out.print((char)i+" ");
				}
				System.out.println("\n"+getName()+"end...");
			}
		};
		thr.start();
		
		System.out.println(me.getName()+" end...");
	}

}
