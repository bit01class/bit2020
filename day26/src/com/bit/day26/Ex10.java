package com.bit.day26;

public class Ex10 extends Thread {
	boolean end=true;
	boolean running;
	int cnt;
	@Override
		public void run() {
			while(end){
				if(running){
	                System.out.println(getName()+" is working..");
	            }else{
	                // flag�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
	                Thread.yield();
	            }
			}
		}

	public static void main(String[] args) {
		Ex10 me = new Ex10();
		Ex10 you = new Ex10();
		me.start();
		you.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=false;
		you.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.end=false;
		you.end=false;
	}

}










