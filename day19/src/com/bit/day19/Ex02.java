package com.bit.day19;

public class Ex02 {

	public static void main(String[] args) {
		java.util.LinkedList list=new java.util.LinkedList();
		list.add(1);
		list.add(12);
		list.add(123);
		list.add("����");
		list.add(1234);
		list.add(12345);
		list.add("�������");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}

	}

}
