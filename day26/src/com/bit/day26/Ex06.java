package com.bit.day26;

public class Ex06 extends Thread{
	static int sum;
	int begin;
	int end;
	static Object key=new Object();
	
	public Ex06(int begin,int end) {
		this.begin=begin;
		this.end=end;
	}
	public void sum(int i){
			sum+=i+1;
			System.out.println();
	}
//	public void sum(int i){
//		int hap=i+1;
//		synchronized (key) {
//			sum=sum+hap;
//		}
//	}
	
//	public static synchronized void sum(int i){
//		int hap=i+1;
//		sum=sum+hap;
//	}
	
	@Override
	public void run() {
		for(int i=begin; i<end; i++)	sum(i);
	}

	public static void main(String[] args) {
		// 1~10000 까지의 합계를 구하시오
		// 1~5000 까지의 합계를 구하시오
		// 5001~10000 까지의 합계를 구하시오
		int sum=0;
		for(int i=0; i<50; i++)	sum+=i+1;
		for(int i=50; i<100; i++)	sum+=i+1;
		System.out.println("1~10000 까지의 합계:"+sum);
		Object key=new Object();
		Ex06 me=new Ex06(0,50);
		Ex06 you=new Ex06(50,100);
		me.start();
		you.start();
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("me+you:"+Ex06.sum);
	}

}















