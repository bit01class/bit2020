package com.bit.day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(111);
		list1.add(2222);
		list1.add(1,3333);
		
		ArrayList list2=new ArrayList();
//		list2.addAll(list1);
//		list2.clear();
		
		ArrayList list3 = (ArrayList)list1.clone();
		list1.add(4444);
		list1.add(3333);
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.contains(4444));
		System.out.println(list1.indexOf(3333));
		System.out.println(list1.lastIndexOf(3333));
		System.out.println(list2.isEmpty());
		list1.add("add");
		list1.remove("add");
//		list1.removeAll(list3);
		list1.set(0, 1111);
		list1.trimToSize();
		System.out.println("------------------------");
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("------------------------");
		Object[] arr = list1.toArray();
		int[] arr2=new int[arr.length];
		
		for(int i=0; i<arr2.length; i++){
			arr2[i]=(int)arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}













