package com.bit.day19;

public class BitArrayList {
	// 열람 우선
	// read 장점
	// insert, update, delete 시 단점

	private Object[] arr;
	
	public BitArrayList(){
		arr=new Object[0];
	}
	
	public void add(Object su){
		Object[] temp=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=temp;
		arr[arr.length-1]=su;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
	
	public int size(){
		return arr.length;
	}
}











