package com.bit.day14;

import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Date now=new java.util.Date();
		System.out.println(now);
		System.out.print(1900+now.getYear()+"년");
		System.out.print(1+now.getMonth()+"월");
		System.out.print(now.getDate()+"일");
		System.out.print(now.getHours()+"시");
		System.out.print(now.getMinutes()+"분");
		System.out.println(now.getSeconds()+"초");
		
//		String msg="";
//		for(int i=0; i<99999; i++){
//			msg+=i;
//		}
		
		java.util.Date now2=new java.util.Date();
		System.out.println(now2);
		System.out.print(1900+now2.getYear()+"년");
		System.out.print(1+now2.getMonth()+"월");
		System.out.print(now2.getDate()+"일");
		System.out.print(now2.getDay());
		
		
		System.out.print(now2.getHours()+"시");
		System.out.print(now2.getMinutes()+"분");
		System.out.println(now2.getSeconds()+"초");
		System.out.println("---------------------------------");
		System.out.println(now.before(now2));
		System.out.println(now.after(now2));
		System.out.println(now2.before(now));
		System.out.println(now2.after(now));
//		System.out.println(now2-now);
		java.util.Date now3=now;
		System.out.println(now.compareTo(now3));
		System.out.println(now.compareTo(now2));
		System.out.println(now2.compareTo(now));
		String msg="2020/05/25 12:00:00";
//		String msg="Mon May 25 14:42:10 KST 2020";
		System.out.println(Date.parse(msg));
		System.out.println(System.currentTimeMillis());
		System.out.println(now.getTime());
		long t=System.currentTimeMillis();
		java.util.Date now4=new java.util.Date(t);
		java.util.GregorianCalendar gc=new java.util.GregorianCalendar();
		long t2=gc.getTimeInMillis();
		java.util.Date now5=new java.util.Date(t2);
		java.util.Calendar cal=java.util.Calendar.getInstance();
		long t3=cal.getTimeInMillis();
		java.util.Date now6=new java.util.Date(t3);
		System.out.println(now6);
	}

}

















