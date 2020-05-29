package com.bit.day14;

interface Remote{
	void on();
	void off();
	void work();
} 

class Tv2 implements Remote{
	public void on() {
		System.out.println("전원을 공급한다");
	}
	public void off() {
		System.out.println("전원을 차단한다");
	}
	public void work() {
		System.out.println("화면을 띄운다");
	}
	
}

class Radio2 implements Remote{
	public void on() {
		System.out.println("밧데리를 통해 전원을 공급한다");
	}
	public void off() {
		System.out.println("밧데리 전원을 공급을 차단한다");
		
	}
	public void work() {
		System.out.println("주파수를 찾아 소리를 출력한다");
	}
	
}


public class Ex06{

	public static void main(String[] args) {
		Remote remote=null;
		
		remote=new Tv2();
		remote.on();
		remote.work();
		remote.off();
		remote=new Radio2();
		remote.on();
		remote.work();
		remote.off();

	}

}


















