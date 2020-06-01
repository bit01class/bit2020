package com.bit.day19;

public class Ex01 {

	public static void main(String[] args) {
		java.util.ArrayList list=new java.util.ArrayList();
		list.add("1");
		list.add("12");
		list.add("123");
		list.add("문자열도");
		list.add("1234");
		list.add("12345");
		list.add("여기까지");

		for(int i=0; i<list.size(); i++){
			String item = (String)list.get(i);
			System.out.println(item);
		}
		
	}

}















