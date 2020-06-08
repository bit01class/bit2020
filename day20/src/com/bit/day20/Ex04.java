package com.bit.day20;

import java.util.HashSet;
import java.util.Iterator;

class MyCar implements Comparable{
	int su;
	MyCar(int a){su=a;}
	
	public int compareTo(Object obj) {
		return su-((MyCar)obj).su;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		java.util.Set set1=new java.util.TreeSet();
		set1.add(new MyCar(1));
		set1.add(new MyCar(2));
		set1.add(new MyCar(3));
		set1.add(new MyCar(4));
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()){
			MyCar car = (MyCar)ite.next();
			System.out.println(car.su);
		}

	}

}















