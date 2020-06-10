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

public class Ex11 extends Thread implements ActionListener{
	JButton[] btns;

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}
	}

	public static void main(String[] args) {
		Ex11 me=new Ex11();
		Frame f=new Frame();
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setLayout(new BorderLayout());
		Label north=new Label("농구공을 선택하세요");
		Label sorth=new Label("스코어:"+"");
		
		Panel east=new Panel();
		Button begin=new Button("시작");
		begin.addActionListener(me);
		Button exit=new Button("종료");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		east.add(begin);
		east.add(exit);
		
		Panel center=new Panel();
		center.setLayout(new GridLayout(4,4));
		me.btns=new JButton[16];
		for(int i=0; i<me.btns.length; i++){
			me.btns[i]=new JButton();
			me.btns[i].setEnabled(false);
			center.add(me.btns[i]);
		}
		
		f.add(BorderLayout.NORTH,north);
		f.add(BorderLayout.SOUTH,sorth);
		f.add(BorderLayout.EAST,east);
		f.add(BorderLayout.CENTER,center);
		f.setSize(1125,1000);
		f.setLocation(200, 0);
		f.setVisible(true);
	}

}











