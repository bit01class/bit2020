package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex09 extends Frame{
	
	public Ex09() {
//		setResizable(false);
		Panel p=new Panel();	
		p.setLayout(null);
		Button btn1=new Button("¹öÆ°1");
		btn1.setSize(200, 200);
		btn1.setLocation(0	,0);
		TextField tf1=new TextField(55);
		tf1.setLocation(200, 0);
		tf1.setSize(100,50);
		p.add(tf1);
		p.add(btn1);
		add(p);
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();

	}

}
