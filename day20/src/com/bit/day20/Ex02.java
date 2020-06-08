package com.bit.day20;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		Vector vec1=new Vector();
		System.out.println(vec1.capacity());
		for(int i=0; i<21; i++){
			vec1.addElement(i);
		}
		System.out.println(vec1.capacity());
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		Vector vec2=new Vector(list);
		System.out.println(vec2.capacity());
		
//		Vector vec3=new Vector(3);
		Vector vec3=new Vector(3,2);
		System.out.println(vec3.capacity());
		for(int i=0; i<6; i++){
			vec3.addElement(i);
		}
		System.out.println(vec3.capacity());
//		Enumeration em = vec2.elements();
//		while(em.hasMoreElements()){
//			System.out.println(em.nextElement());
//		}
	}

}


















