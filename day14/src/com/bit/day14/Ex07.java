package com.bit.day14;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {
								//new java.util.Calender();
		java.util.Calendar cal= java.util.Calendar.getInstance();
//		System.out.println(cal.toString());
		
		System.out.println(cal.get(1));
		System.out.print(cal.get(Calendar.YEAR)+"��");
		System.out.print(1+cal.get(Calendar.MONTH)+"��");// 0~11
		System.out.print(cal.get(Calendar.DATE)+"��");
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK));//1~7
		char ch='?';
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: ch='��'; break;
		case 2: ch='��'; break;
		case 3: ch='ȭ'; break;
		case 4: ch='��'; break;
		case 5: ch='��'; break;
		case 6: ch='��'; break;
		case 7: ch='��'; break;

		default:
			break;
		}
		System.out.print("("+ch+")");
		
		System.out.print("\t");
//		System.out.print(cal.get(Calendar.AM)+".");
//		System.out.print(cal.get(Calendar.AM_PM)+".");
		if(cal.get(Calendar.AM)==0){
			System.out.print("a.m.");
			System.out.print(cal.get(Calendar.HOUR)+"�� or ");//0~11
		}else if(cal.get(Calendar.AM)==1){
			System.out.print("p.m.");
			System.out.print(cal.get(Calendar.HOUR)+"�� or ");//0~11
		}
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.print(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"����");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"����");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)+"��°");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"��");
	}

}



















