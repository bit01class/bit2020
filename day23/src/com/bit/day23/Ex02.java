package com.bit.day23;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex02 extends Frame {
	
	public Ex02() {
		java.awt.Menu mn1=new Menu();
		mn1.setLabel("File");
		java.awt.MenuItem mn1_1=new MenuItem();
		mn1_1.setLabel("New");
		mn1.add(mn1_1);
		MenuItem mn1_2=new MenuItem("Save");
		mn1.add(mn1_2);
		mn1.addSeparator();
		MenuItem mn1_3=new MenuItem("Exit");
		mn1.add(mn1_3);
		
		MenuItem mn2_1=new java.awt.CheckboxMenuItem("item1");
		MenuItem mn2_2=new CheckboxMenuItem("item2",true);
		MenuItem mn2_3=new CheckboxMenuItem("item3");
		Menu mn2_4=new Menu("상위");
		MenuItem mn2_4_1=new MenuItem("하위1");
		MenuItem mn2_4_2=new MenuItem("하위2");
		mn2_4.add(mn2_4_1);
		mn2_4.add(mn2_4_2);
		
		Menu mn2=new Menu("Help");
		mn2.add(mn2_1);
		mn2.add(mn2_2);
		mn2.add(mn2_3);
		mn2.add(mn2_4);
		
		java.awt.MenuBar mb=new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		
		setMenuBar(mb);
		Button btn=new Button("test");
		add(btn);
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
