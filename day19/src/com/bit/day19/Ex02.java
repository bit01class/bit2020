package com.bit.day19;

public class Ex02 {

	public static void main(String[] args) {
		java.util.LinkedList list=new java.util.LinkedList();
		list.add(1);
		list.add(12);
		list.add(123);
		list.add("절반");
		list.add(1234);
		list.add(12345);
		list.add("여기까지");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}

	}

}
