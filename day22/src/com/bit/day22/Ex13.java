package com.bit.day22;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class Ex13 extends Frame{
	
	public Ex13() {
		Panel p=new Panel();
		Font font=new Font("±Ã¼­Ã¼",0,22);
		
		java.awt.CheckboxGroup cbg=new CheckboxGroup();
		
		java.awt.Checkbox chk01=new Checkbox("item1",false,cbg);
		Checkbox chk02=new Checkbox("item2",true,cbg);
		Checkbox chk03=new Checkbox("",true,cbg);
		chk03.setLabel("item3");
		
		chk01.setFont(font);
		chk02.setFont(font);
		chk03.setFont(font);
		
		p.add(chk01);
		p.add(chk02);
		p.add(chk03);
		
		add(p);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13();

	}

}
