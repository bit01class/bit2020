package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex12 extends Frame implements KeyListener {
	TextField tf;
	Label la;
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 누르는 순간:"+e.getKeyCode());
		int x=la.getX();
		int y=la.getY();
		if(e.getKeyCode()==38){
			la.setLocation(x, y-10);
		}else if(e.getKeyCode()==40){
			la.setLocation(x, y+10);
		}else if(e.getKeyCode()==39){
			if(x+10<=500-50){
				la.setLocation(x+10, y);
			}
		}else if(e.getKeyCode()==37){
			if(x-10>=0){
				la.setLocation(x-10, y);
			}
		}
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("키를 띄우는 순간:"+e.getKeyCode());
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("키를 눌림:"+e.getKeyCode());
	}
	
	public Ex12() {
		Panel p=new Panel();
		p.setLayout(null);
		
		tf=new TextField(10);
		//p.add(tf);
		
		Button btn=new Button();
		//p.add(btn);
		
		la=new Label("★");
		la.setSize(50, 50);
		la.setLocation(0,0);
		p.add(la);
		
		addKeyListener(this);
		add(p);
		setSize(500,300);
		setLocation(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12();
	}
}
