package com.bit.day13;

public class Ex01 {

	public static void main(String[] args) {
		String msg1=new String("JavaWebFramework"); //""
		StringBuffer sb1=new StringBuffer("JavaWebFramework");
//		StringBuffer sb2="";
		StringBuilder sb3=new StringBuilder(sb1);
		StringBuffer sb4=new StringBuffer(10);
		
		System.out.println(msg1.length());
		System.out.println(sb1.length());
		
		// 삽입,(보기),수정,삭제 CRUD
		StringBuffer sb5=new StringBuffer("Java");
		StringBuffer sb6=new StringBuffer("Web");
//		StringBuffer sb7=sb5+sb6;
		StringBuffer sb7=sb5.append(sb6);
//		String msg2="sb7="+sb7;
		System.out.println("StringBuffer sb7="+sb7);
		System.out.println("StringBuffer sb5="+sb5);
		System.out.println("StringBuffer sb6="+sb6);
		System.out.println(sb5==sb7);
		String msg2="java";
		String msg3="web";
		String msg4=msg2+msg3;
		System.out.println("String msg4="+msg4);
		System.out.println("String msg2="+msg2);
		System.out.println("String msg3="+msg3);
		sb5.append("Framework");
		System.out.println(sb5);//JavaWebFramework
		sb5.delete(4, 7);
		System.out.println(sb5);//JavaFramework
		sb5.insert(4, "DB");
		System.out.println(sb5);//JavaDBFramework
		sb5.insert(sb5.length(), "Web");
		System.out.println(sb5);//JavaDBFrameworkWeb
		sb5.replace(4, 6, "Database");
		System.out.println(sb5);//JavaDatabaseFrameworkWeb
	}

}

















