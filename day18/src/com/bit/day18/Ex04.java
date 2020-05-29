package com.bit.day18;

public class Ex04 {

	public static void main(String[] args) {
		//磊丰备炼 按眉 积己
		com.bit.day18.BitArray list=new BitArray();
		list.add('#');
		list.add(true);
		list.add(1234);
		list.add(3.14);
		list.add("abcde");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}




















