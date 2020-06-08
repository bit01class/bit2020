package com.bit.day21;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex16 {

	public static void main(String[] args) {
		java.awt.GridBagLayout layout=new GridBagLayout();
		Frame f=new Frame();
		Panel p=new Panel();
		p.setLayout(layout);
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn11=new Button("btn1");
		Button btn12=new Button("btn2");
		Button btn13=new Button("btn3");
		Button btn14=new Button("btn4");
		
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn1, c);
		p.add(btn1);
		
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn2, c);
		p.add(btn2);

		c.gridx=2;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn3, c);
		p.add(btn3);

		c.gridx=3;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn4, c);
		p.add(btn4);
		
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=2;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn11, c);
		p.add(btn11);
		
		f.add(p);
		f.setSize(400, 300);
		f.setVisible(true);

	}

}











