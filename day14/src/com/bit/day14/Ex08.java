package com.bit.day14;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal=null;
		cal=new java.util.GregorianCalendar(2002,5-1,25,23,1);
		System.out.println(cal.toString());
		System.out.print(cal.get(Calendar.YEAR)+"��");
		System.out.print(1+cal.get(Calendar.MONTH)+"��");// 0~11
		System.out.print(cal.get(Calendar.DATE)+"��");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.print(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
	}

}
