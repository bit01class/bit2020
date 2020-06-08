package com.bit.day21;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex14 extends Frame {
	static CardLayout layout;
	
	Ex14(){
		layout=new CardLayout();
		setLayout(layout);
		
		Panel p1=new Panel();
		Button btn1=new Button();
		btn1.setLabel("첫번째");
		p1.add(btn1);
		
		Panel p2=new Panel();
		Button btn2=new Button();
		btn2.setLabel("두번째");
		p2.add(btn2);
		
		Panel p3=new Panel();
		Button btn3=new Button();
		btn3.setLabel("세번째");
		p3.add(btn3);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		setSize(500, 300);
	}

	public static void main(String[] args) {
		Ex14 me = new Ex14();
		me.setVisible(true);
		
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1.다음 0.종료>");
			int su=sc.nextInt();
			if(su==0){break;}
			else if(su==1){layout.next(me);}
		}

	}

}














