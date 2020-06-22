package com.bit.jdbc;

import java.sql.*;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex02 {

	public static void main(String[] args) {
		String sql="select * from dept order by dname desc";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		java.util.Properties prop=new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		Connection conn=null;
		Statement stmt=null;
		java.sql.ResultSet rs=null;
		
		new OracleDriver();
		
		try {
			conn=DriverManager.getConnection(url,prop);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getObject(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}









