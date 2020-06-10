package com.bit.day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Ex12 extends Frame implements ActionListener {
	JButton[] btns;
	
	public Ex12() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new BorderLayout());
		Label north=new Label("농구공을 선택하세요");
		Label sorth=new Label("스코어:"+"");
		
		Panel east=new Panel();
		Button begin=new Button("시작");
		begin.addActionListener(this);
		Button exit=new Button("종료");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		east.add(begin);
		east.add(exit);
		
		Panel center=new Panel();
		center.setLayout(new GridLayout(4,4));
		btns=new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i]=new JButton();
			btns[i].setEnabled(false);
			center.add(btns[i]);
		}
		
		add(BorderLayout.NORTH,north);
		add(BorderLayout.SOUTH,sorth);
		add(BorderLayout.EAST,east);
		add(BorderLayout.CENTER,center);
		setSize(1125,1000);
		setLocation(200, 0);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}
	}
	

	public static void main(String[] args) {
		Ex12 me=new Ex12();

	}

}
