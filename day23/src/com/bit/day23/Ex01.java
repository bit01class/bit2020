package com.bit.day23;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex01 extends Frame{

	public Ex01() {
		java.awt.Toolkit tool=Toolkit.getDefaultToolkit();
		byte[] data=null;
		File file=new File(".\\img1.png");
		FileInputStream fis=null;	
		if(file.exists()){
			try {
				data=new byte[(int)file.length()];
				fis=new FileInputStream(file);
				for(int i=0; i<file.length(); i++){
					data[i]=(byte)fis.read();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(fis!=null){fis.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		java.awt.Image img=tool.createImage(data);
		javax.swing.Icon icon=new ImageIcon(img);
		javax.swing.JButton btn01=new JButton(icon);
		
		add(btn01);
		
		setSize(500,300);
		Dimension dim = tool.getScreenSize();
//		System.out.println(dim.getWidth());
//		System.out.println(dim.getHeight());
//		System.out.println(dim.width);
//		System.out.println(dim.height);
		// 1920*1080
		setLocation(dim.width/2-getWidth()/2
					,dim.height/2-getHeight()/2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
