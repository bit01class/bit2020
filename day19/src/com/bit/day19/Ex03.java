package com.bit.day19;

public class Ex03 {

	public static void main(String[] args) {
		java.util.ArrayList list=new java.util.ArrayList();
		java.util.LinkedList list2=new java.util.LinkedList();
		for(int i=0; i<99999; i++){
			list2.add(i);
		}
		long before=System.currentTimeMillis();
		Object temp=null;
		for(int i=0; i<99999; i++){
			temp=list2.get(i);
		}
		long after=System.currentTimeMillis();
		System.out.println(after-before);

	}

}
