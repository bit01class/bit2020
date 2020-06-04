package com.bit.day22;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex15 extends Frame {

	public Ex15() {
		Panel p=new Panel();
		
		java.awt.List list=new List(5,true);
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.addItem("item5");
//		list.add("item1");
//		list.add("item2");
//		list.add("item3");
//		list.add("item4");
		list.select(2);
		
		p.add(list);
		add(p);
		java.awt.Dimension dim=new Dimension(500,300);
		setSize(dim);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex15();
	}

}







