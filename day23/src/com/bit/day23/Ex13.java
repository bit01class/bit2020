package com.bit.day23;

import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex13 extends Frame implements ItemListener{
	Choice cho;
	List list;
	public void itemStateChanged(ItemEvent e) {
//		int[] idxs=list.getSelectedIndexes();
//		String[] names=list.getSelectedItems();
//		
//		System.out.println(Arrays.toString(idxs));
//		System.out.println(Arrays.toString(names));
		////////////////////////////////////////
//		System.out.println("ch1:"+ch1.getState());
//		System.out.println("ch2:"+ch2.getState());
//		System.out.println("ch3:"+ch3.getState());
		////////////////////////////////////////
		if(e.getSource()==ch1){
			Checkbox obj = (Checkbox)e.getSource();
			System.out.println(obj.getLabel()+":"+obj.getState());
		}else if(e.getSource()==cho){
			System.out.println(cho.getSelectedItem());
		}
	}
	Checkbox ch1,ch2,ch3;
	public Ex13() {
		Panel p=new Panel();
		ch1=new Checkbox("item1");
		ch2=new Checkbox("item2");
		ch3=new Checkbox("item3");

		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		
		cho=new Choice();
		cho.addItemListener(this);
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		p.add(cho);
		
		list=new List(4,true);
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		
		p.add(list);
		add(p);
		setSize(500,300);
		setLocation(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13();

	}

}
