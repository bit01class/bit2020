package com.bit.day19;

// 처리가 우선
// insert, update, delete 장점
// read 단점

public class BitLinkedList {
	private Node start;
	private int cnt;
	
	private class Node{
		Node next;
		Object val;
	}

	public void add(Object val){
		cnt++;
		Node node=new Node();
		node.val=val;
		if(cnt==1){
			start=node;
		}else{
			Node temp=start;
			while(true){
				if(temp.next==null){break;}
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public int size(){
		return cnt;
	}
	
	public Object get(int idx){
		// 0.start.val
		// 1.start.next.val
		// 2.start.next.next.val
		Node temp=start;
		for(int i=0; i<idx ; i++){
			temp=temp.next;
		}
		return temp.val;
	}
}


















