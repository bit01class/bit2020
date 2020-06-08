package com.bit.day21;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex13 {

	public static void main(String[] args) {
		Frame frame=new Frame();
		java.awt.Panel p=new Panel();
//		java.awt.FlowLayout layout=new FlowLayout();
		// GridLayout(세로,가로) - 우선순위: 세로
		java.awt.GridLayout layout=new GridLayout(3,2);
		p.setLayout(layout);
		
		Button btn01=new Button();
		btn01.setLabel("버튼1");
		Button btn02=new Button();
		btn02.setLabel("버튼2");
		Button btn03=new Button();
		btn03.setLabel("버튼3");
		Button btn04=new Button();
		btn04.setLabel("버튼4");
		Button btn05=new Button();
		btn05.setLabel("버튼5");
		
		p.add(btn01);
		p.add(btn02);
		p.add(btn03);
		p.add(btn04);
		p.add(btn05);
		
		frame.add(p);
		frame.setLocation(200, 200);
		frame.setSize(500,300);
		frame.setVisible(true);

	}

}
