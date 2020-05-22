package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abcdefg");
		//sb1.reverse();
		System.out.println(sb1);
		
//		char[] dest=new char[sb1.length()];
//		sb1.getChars(0, sb1.length(), dest, 0);
		char[] dest={'#','#','#','#','#','#','#'};
		sb1.getChars(2, 5, dest, 2);
		
		for(int i=0; i<dest.length; i++){
			System.out.println(dest[i]);
		}
		
	}

}
