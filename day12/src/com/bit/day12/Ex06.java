package com.bit.day12;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("main start...");
		for(int i=0; i<=5; i++){
			try{
			func01(i);
			}catch(java.lang.ArrayIndexOutOfBoundsException e){
				System.out.println(e.toString());
			}
		}
		System.out.println("main end...");
	}
	
	public static void func01(int a) throws ArrayIndexOutOfBoundsException{
		System.out.println("에러발생전");
		int[] arr ={1,2,3,4,5};
//		try{
		System.out.println(arr[a]);
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("스스로 해결함");
//		}
		System.out.println("에러발생안함");
	}

}
