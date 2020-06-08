package com.bit.day23;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame implements WindowListener{
	
	public Ex05() {
		addWindowListener(this);
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();

	}
	public void windowActivated(WindowEvent e) {
		System.out.println("âȰ��ȭ");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose();
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("��Ȱ��ȭ");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("���ּ�ȭ");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("â����");
	}

}
