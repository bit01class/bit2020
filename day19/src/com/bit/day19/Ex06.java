package com.bit.day19;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		// Queue - ���Լ���(first-in-first-out)
		
		java.util.Queue list=new LinkedList();
		list.offer("ù��°");//list.add()
		list.offer("�ι�°");
		list.offer("����°");
		list.offer("�׹�°");
		
//		for(int i=0; i<4; i++){
//			String msg=(String)list.peek();
//			System.out.println(msg);
//			list.poll();
//		}
		while(list.peek()!=null){//list.element()
			String msg=(String)list.poll();//list.remove()
			System.out.println(msg);
		}

	}

}
















