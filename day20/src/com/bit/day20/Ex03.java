package com.bit.day20;

import java.util.TreeSet;

public class Ex03 {

	public static void main(String[] args) {
		java.util.TreeSet set01=new TreeSet();
		
		set01.add("ù��°");
		set01.add("�ι�°");
		set01.add("����°");
		set01.add("�׹�°");
		set01.add("�ι�°");
		
		System.out.println(set01.size());

		java.util.Iterator ite=set01.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
//		System.out.println("----------------------");
//		Iterator ite2 = set01.iterator();
//		for(int i=0; i<set01.size(); i++){
//			System.out.println(ite.next());
//		}
		
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
	}

}

















