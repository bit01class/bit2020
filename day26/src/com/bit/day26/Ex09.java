package com.bit.day26;

class Lec09 extends Thread{
	int tot;
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		for(int i=0; i<50; i++){
			System.out.println(i+"를 누적합니다");
			tot+=i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" end...");
	}
}

public class Ex09 {
	// getState() 스레드의 상태확인
	// Thread.State.NEW
	// Thread.State.RUNNABLE
	// Thread.State.BLOCKED
	// Thread.State.TIMED_WAITING
	// Thread.State.WAITING
	// Thread.State.TERMINATED
	public static void toggle(Lec09 lec){
		if(lec.getState()==Thread.State.NEW){
			lec.start();
		}else if(lec.getState()==Thread.State.RUNNABLE){
			lec.suspend();
		}else if(lec.getState()==Thread.State.TIMED_WAITING){
			lec.stop();
		}
	}
	
	public static void main(String[] args) {
		Lec09 lec=new Lec09();
		lec.start();// 시작
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		toggle(lec);
//		lec.suspend();// 일시정지
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.resume();// 재개
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.stop();// 종료
		

	}

}



