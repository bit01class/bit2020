package com.bit.day18;

public class BitArray implements BitStack,Queue {
	Object[] arr;
	
	public BitArray(){
		arr=new Object[0];
	}
	
	public void add(Object a){
		Object[] temp=new Object[arr.length+1];
		// 기존값
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		// 신규
		temp[temp.length-1]=a;
		arr=temp;
	}
	
	public int size(){
		return arr.length;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
	
	public void push(Object obj){
		add(obj);
	}
	
	public Object pull(){
		Object obj=arr[0];
		remove(0);
		return obj;
	}
	
	public Object pop(){
		Object obj=arr[arr.length-1];
		remove(arr.length-1);
		return obj;
	}
	
	public void remove(int idx){
		if(arr.length>0){
			Object[] temp=new Object[arr.length-1];
			//before
			for(int i=0; i<idx; i++){
				temp[i]=arr[i];
			}
			//after
			for(int i=idx; i<temp.length; i++){
				temp[i]=arr[i+1];
			}
			arr=temp;
		}
	}
}


















