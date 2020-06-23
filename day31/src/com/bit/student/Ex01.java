package com.bit.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.*;
import java.util.Properties;

public class Ex01 extends JFrame {
	JLabel[] table=new JLabel[50];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("학생성적관리프로그램(ver 0.4.0)");
		label.setFont(new Font("궁서체", Font.BOLD, 24));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btn1 = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 0);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 1;
		panel_2.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("\uC785\uB825");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 0);
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 3;
		panel_2.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("\uC218\uC815");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 0;
		gbc_btn3.gridy = 6;
		panel_2.add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("\uC0AD\uC81C");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 0);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 9;
		panel_2.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("\uC885\uB8CC");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn5.gridx = 0;
		gbc_btn5.gridy = 11;
		panel_2.add(btn5, gbc_btn5);
		
		JPanel center = new JPanel();

		
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(11, 5, 0, 0));
		
		JLabel label_1 = new JLabel("\uD559\uBC88");
		center.add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		center.add(label_2);
		
		JLabel label_3 = new JLabel("\uAD6D\uC5B4");
		center.add(label_3);
		
		JLabel label_4 = new JLabel("\uC601\uC5B4");
		center.add(label_4);
		
		JLabel label_5 = new JLabel("\uC218\uD559");
		center.add(label_5);

		for(int i=0; i<table.length; i++){
			table[i]=new JLabel();
			center.add(table[i]);
		}
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String sql="select * from student01";
				new oracle.jdbc.driver.OracleDriver();
				
				String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				java.util.Properties prop=new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					int cnt=0;
					while(rs.next()){
						for(int i=1; i<6; i++){
							table[cnt++].setText(rs.getString(i));
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}

}
















