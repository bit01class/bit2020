package com.bit.day20;

public class Ex01 {

	public static void main(String[] args) {
		// Vector
		java.util.Vector vec01=new java.util.Vector();
		vec01.addElement("ù��°");
		vec01.addElement("�ι�°");
		vec01.addElement("����°");
		vec01.addElement("�׹�°");
		
		vec01.insertElementAt("3��°", 2);
//		vec01.removeElementAt(3);
		
//		vec01.removeElement("�ι�°");
		
		
		java.util.Enumeration em=vec01.elements();
		
		System.out.println("----------------");
		String ele = (String)em.nextElement();
		ele="1234";
		System.out.println("----------------");
		
		java.util.Enumeration em2=vec01.elements();
		while(em2.hasMoreElements()){
			System.out.println(em2.nextElement());
		}
		
//		System.out.println(vec01.elementAt(0));
//		System.out.println(vec01.elementAt(1));
//		System.out.println(vec01.elementAt(2));
//		System.out.println(vec01.elementAt(3));
//		System.out.println(vec01.elementAt(4));

	}

}











