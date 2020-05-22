package com.bit.day13;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println("buffer size:"+sb1.capacity());
		StringBuffer sb2=new StringBuffer(3);
		System.out.println("buffer size:"+sb2.capacity());
		for(int i=0; i<8; i++){
			sb2.append(i);
			System.out.println(sb2+":"+sb2.capacity());
		}
		for(int i=0; i<3; i++){
			sb2.delete(sb2.length()-1, sb2.length());
			System.out.println(sb2+":"+sb2.capacity());
		}
		sb2.trimToSize();
		System.out.println(sb2+":"+sb2.capacity());
	}

}













