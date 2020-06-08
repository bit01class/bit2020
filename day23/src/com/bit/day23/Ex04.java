package com.bit.day23;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex04 extends Frame{
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			g.drawString("환영합니다", 800/2, 600/2);
			g.setColor(Color.RED);
			g.drawLine(100, 100, 200, 200);
			
			g.draw3DRect(300, 100, 100, 150,true);
			g.setColor(Color.BLUE);
			g.drawOval(500, 100, 100, 150);
			g.drawArc(0, 300, 200, 200, 0, 90);
//			g.drawRect(300, 100, 100, 150);
//			g.setColor(Color.BLUE);
//			g.drawOval(500, 100, 100, 150);
//			g.drawArc(0, 300, 200, 200, 0, 90);
//			g.fillRect(300, 100, 100, 150);
//			g.setColor(Color.BLUE);
//			g.fillOval(500, 100, 100, 150);
//			g.fillArc(0, 300, 200, 200, 0, 90);
		}
	}
	
	public Ex04() {
		java.awt.Canvas can=new MyCanvas();
		add(can);
		setSize(800,600);
		setLocation(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
