package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex11 extends Frame{
	static java.awt.TextField tf1;

	public Ex11() {
		Font font=new Font(Font.MONOSPACED, Font.BOLD,22);
		Panel p=new Panel();
		p.setBackground(Color.BLUE);
		tf1=new TextField(5);
		tf1.setText("");
		tf1.setEchoChar('#');
		p.add(tf1);
		
		Button btn=new Button("¹öÆ°");
		btn.setFont(font);
		btn.setSize(100, 100);
		p.add(btn);
		
		add(p);
		// 1920*1080
		setLocation(1920/2-500/2,1080/2-300/2);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex11();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tf1.getText());
	}

}

















