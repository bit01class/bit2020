package com.bit.day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex12 extends Frame implements ActionListener,Runnable {
	JButton[] btns;
	Panel center;
	int score;
	
	public Ex12() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new BorderLayout());
		Label north=new Label("농구공을 선택하세요");
		Label sorth=new Label("스코어:"+"");
		
		Panel east=new Panel();
		Button begin=new Button("시작");
		begin.addActionListener(this);
		Button exit=new Button("종료");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		east.add(begin);
		east.add(exit);
		
		center=new Panel();
		center.setLayout(new GridLayout(4,4));
		btns=new JButton[16];
		Toolkit kit=Toolkit.getDefaultToolkit();
		for(int i=0; i<btns.length; i++){		
			Image img=kit.createImage(1+i%4+".jpg");
			Icon icon=new ImageIcon(img);
			btns[i]=new JButton(icon);
			if(i%4==0){
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score++;
					}
				});
			}else{
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score-=2;
					}
				});
			}
			btns[i].setEnabled(false);
			center.add(btns[i]);
		}
		
		add(BorderLayout.NORTH,north);
		add(BorderLayout.SOUTH,sorth);
		add(BorderLayout.EAST,east);
		add(BorderLayout.CENTER,center);
		setSize(1125,1000);
		setLocation(200, 0);
		setVisible(true);
	}
	
	private void mix(){
		Random ran=new Random();
		JButton temp=null;
		for(int i=0; i<1000; i++){
			int su=ran.nextInt(15)+1;
			temp=btns[0];
			btns[0]=btns[su];
			btns[su]=temp;
		}
		for(int i=0; i<btns.length; i++){
			center.add(btns[i]);
		}
		revalidate();// 화면갱신
	}
	
	private void play(){
		for(int i=0; i<20; i++){
			mix();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("점수:"+score);
		for(int i=0;i<btns.length; i++){
			btns[i].setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}
		Thread thr=new Thread(this);
		thr.start();
	}

	public static void main(String[] args) {
		Ex12 me=new Ex12();

	}

	@Override
	public void run() {
		play();
	}

}
