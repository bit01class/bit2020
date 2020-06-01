package com.bit.day19;

public class Ex07 {

	public static void main(String[] args) {
		java.util.Deque deq=new java.util.LinkedList();
		deq.offerFirst("첫번째");
		deq.offerFirst("두번째");
		deq.offerFirst("세번째");
		deq.offerFirst("네번째");
		//  queue(first in first out)
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
		// stack(first in last out)
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println("-----------------------");
		deq.offerLast("1번째");
		deq.offerLast("2번째");
		deq.offerLast("3번째");
		deq.offerLast("4번째");
		//  queue(first in first out)
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
		// stack(first in last out)
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
	}

}














