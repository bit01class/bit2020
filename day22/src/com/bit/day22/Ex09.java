package com.bit.day22;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JLabel;

public class Ex09 extends Frame{
	
	Ex09(){
		Panel p=new Panel();
		Panel p2=new Panel();
		
//		p2.setBackground(Color.BLUE);
		p.setLayout(new GridLayout(1,2));
		
		Button btn1=new Button();
		btn1.setLabel("한글");
		
		Font font=null;
		font=new Font("궁서",Font.ITALIC,32);
		btn1.setFont(font);
		
		javax.swing.JLabel la1=new JLabel();
		la1.setText("출력합니다");
		la1.setFont(font);
		System.out.println(la1.getText());
		
		p2.add(la1);
		p.add(btn1);
		p.add(p2);
		add(p);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();

	}

}
