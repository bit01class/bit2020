package com.bit.day26;

public class Ex07 extends Thread {
	Ex07 ex07;
	
	public void setEx07(Ex07 me){
		ex07=me;
	}
	
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		if(ex07!=null){
			try {
				ex07.join();
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
		System.out.println(getName()+" end...");
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex07 me=new Ex07();
		Ex07 you=new Ex07();
		me.setEx07(you);
		you.setEx07(me);
		me.start();
		you.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.interrupt();
		System.out.println("main end...");
	}

}







