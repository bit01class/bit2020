package com.bit.day20;

import java.util.ArrayList;

class Lec1<T>{
	T obj;
	void setObj(T obj){
		this.obj=obj;
	}
	T getObj(){
		return obj;
	}
	
//	void func(java.util.List<? super Number> list){
	void func(java.util.List<? extends Number> list){
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
// WildCard Generic Type
// < ? super Number> Number 기준 위로
// < ? extends Number> Number 기준 아래 

public class Ex11 {

	public static void main(String[] args) {
//		ArrayList<Number> list=new ArrayList<Number>();
//		ArrayList<Object> list=new ArrayList<Object>();
//		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		Lec1<Number> lec = new Lec1<>();
		lec.func(list);
	}

}
















