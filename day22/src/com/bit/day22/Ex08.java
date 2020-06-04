package com.bit.day22;

public class Ex08 extends Thread{

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex08 me=new Ex08();
		Ex08 you=new Ex08();
		me.start();
		you.start();
		
		try {
			me.join();
//			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end...");

	}

	public void run() {
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+"work"+i);
		}
	}

}
