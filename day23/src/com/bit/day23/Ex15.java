package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex15 extends Frame implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트발생");
	}
	
	public Ex15() {
		Panel p=new Panel();		
		TextField tf=new TextField(15);
		tf.addActionListener(this);
		p.add(tf);
		List cho=new List();
		cho.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("list의 이벤트");
			}
		});
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		p.add(cho);
		
		Button btn=new Button("버튼");
		btn.addActionListener(this);
		p.add(btn);
		add(p);
		setSize(500,300);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex15();

	}

}
