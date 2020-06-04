package com.bit.day22;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("main start...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
	}

}
