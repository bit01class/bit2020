package com.bit.day23;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Lec16 implements WindowListener{
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}	
}

public class Ex16 extends Frame{
	
	public Ex16() {
		setTitle("Á¦¸ñ");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(500,300);
		setLocation(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex16();

	}

}
