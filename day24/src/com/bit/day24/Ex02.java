package com.bit.day24;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Ex02 extends Frame implements ActionListener{
	MenuItem mi1_1,mi1_2,mi1_3,mi1_4,mi2_1;
	TextArea ta;
	
	public Ex02() {
		// 창의 x버튼의 기능
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("파일");
		mi1_1=new MenuItem("새파일");
		mi1_2=new MenuItem("열기");
		mi1_3=new MenuItem("저장");
		mi1_4=new MenuItem("종료");
		mi1_2.addActionListener(this);
		mi1_3.addActionListener(this);
		mi1_4.addActionListener(this);
		m1.add(mi1_1);
		m1.addSeparator();
		m1.add(mi1_2);
		m1.add(mi1_3);
		m1.addSeparator();
		m1.add(mi1_4);
		Menu m2=new Menu("도움말");
		mi2_1=new MenuItem("정보");
		mi2_1.addActionListener(this);
		m2.add(mi2_1);
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		ta=new TextArea();
		add(ta);
		setTitle("제목없음");
		setSize(500,400);
		setLocation(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		///////////////////////////////
		if(mi1_2==obj){
			FileDialog open=new FileDialog(this,"열기",FileDialog.LOAD);
			System.out.println("test");
//			open.setSize(1000,300);
//			open.setLocation(getX()+1000,getY()+100);
			open.setVisible(true);
			String path=open.getDirectory();
			path+="\\"+open.getFile();
			File openFile=new File(path);
			FileInputStream fis=null;
			ArrayList<Byte> temp=new ArrayList<>();
			try {
				fis=new FileInputStream(openFile);
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					temp.add((byte)su);
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally{
				try {
					if(fis!=null){fis.close();}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			Object[] objs=temp.toArray();
			byte[] by=new byte[objs.length];
			for(int i=0; i<objs.length; i++){
				by[i]=(byte) objs[i];
			}
			ta.setText(new String(by));
		}
		///////////////////////////////
		if(mi1_3==obj){
			FileDialog dia=new FileDialog(this,"저장",FileDialog.SAVE);
			dia.setVisible(true);
			String path=dia.getDirectory();
			path+="\\"+dia.getFile();
			System.out.println(path);
			File saveFile=new File(path);
			if(!saveFile.exists()){
				try {
					saveFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			String msg=ta.getText();
			byte[] by=msg.getBytes();
			FileOutputStream fos=null;
			try {
				fos=new FileOutputStream(saveFile);
				for(int i=0; i<by.length; i++){
					fos.write((int)by[i]);
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally{
				try {
					if(fos!=null){fos.close();}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}
		///////////////////////////////
		// 종료메뉴의 기능
		if(mi1_4==obj){
			dispose();
		}
		///////////////////////////////
		if(mi2_1==obj){
		java.awt.Dialog dia=new Dialog(this,"정보");
		Label la1=new Label("by bit class01");
		dia.setLayout(new FlowLayout());
		// dialog x버튼의 기능
		dia.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dia.dispose();
			}
		});
		dia.add(la1);
		dia.setSize(1000, 200);
		dia.setLocation(this.getX()+100, this.getY()+100);
		dia.setVisible(true);
		}
		///////////////////////////////
	}

}



















