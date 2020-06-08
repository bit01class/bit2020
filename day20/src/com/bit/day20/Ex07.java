package com.bit.day20;

public class Ex07 {

	public static void main(String[] args) {
		java.util.Map map1=new java.util.HashMap();
		// key의 중복은 불가능
		// value의 중복은 가능
		
		map1.put("key1", "val1");
		map1.put("key2", "val2");
		map1.put("key3", "val1");
		map1.put("key4", null);
		
		map1.put("key1", "abcd");
		map1.put(1234, "ABCD");
		map1.put(true, "ABCDabcd");
		map1.put(null, "1234");
		
		System.out.println(map1.get("key5"));

	}

}












