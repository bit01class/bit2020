package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame implements MouseListener {
	
	public Ex07() {
		Panel p=new Panel();
		
		Button btn=new Button("버튼");
		this.addMouseListener(this);
		p.add(btn);
		
		add(p);
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("CLICK");
	}
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("in 마우스");
	}
	public void mouseExited(MouseEvent arg0) {
		System.out.println("out 마우스");
	}
	public void mousePressed(MouseEvent arg0) {
		System.out.println("버튼 누르는 순간");
	}
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("버튼을 띄우는 순간");
	}

}
