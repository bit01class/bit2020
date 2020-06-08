package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex15 extends Frame {
	Ex15(){
		java.awt.BorderLayout layout=new BorderLayout();
		java.awt.FlowLayout layout2=new FlowLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		Button btn3=new Button("버튼3");
		Panel west=new Panel();
		west.setLayout(layout2);
		Button btn4=new Button("버튼4");
		west.add(btn4);
		Panel center=new Panel();
		center.setLayout(layout2);
		Button btn5=new Button("버튼5");
		center.add(btn5);
		
		p.add(BorderLayout.NORTH,btn1);
		p.add(BorderLayout.SOUTH,btn2);
		p.add(BorderLayout.EAST,btn3);
		p.add(BorderLayout.WEST,west);
		p.add(BorderLayout.CENTER,center);
		
		add(p);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex15();

	}

}












