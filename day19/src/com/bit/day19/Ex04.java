package com.bit.day19;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		
		ArrayList list2=new ArrayList(list1);
		list2.add(4444);
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println("---------------------");
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
	}

}
