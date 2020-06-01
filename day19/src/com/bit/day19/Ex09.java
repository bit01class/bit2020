package com.bit.day19;

import java.util.List;

public class Ex09 implements Cloneable {
	int su=1234;

	public static void main(String[] args) {
//		java.util.List list=new java.util.LinkedList();
//		int[] arr={1,3,5,7,9};
		List list = java.util.Arrays.asList(1,3,5,7,9);
		Object[] arr=list.toArray();
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		Ex09 me=new Ex09();
		try {
			Object obj=me.clone();
			System.out.println(obj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
















	