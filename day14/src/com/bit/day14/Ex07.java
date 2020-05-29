package com.bit.day14;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {
								//new java.util.Calender();
		java.util.Calendar cal= java.util.Calendar.getInstance();
//		System.out.println(cal.toString());
		
		System.out.println(cal.get(1));
		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print(1+cal.get(Calendar.MONTH)+"월");// 0~11
		System.out.print(cal.get(Calendar.DATE)+"일");
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK));//1~7
		char ch='?';
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: ch='일'; break;
		case 2: ch='월'; break;
		case 3: ch='화'; break;
		case 4: ch='수'; break;
		case 5: ch='목'; break;
		case 6: ch='금'; break;
		case 7: ch='토'; break;

		default:
			break;
		}
		System.out.print("("+ch+")");
		
		System.out.print("\t");
//		System.out.print(cal.get(Calendar.AM)+".");
//		System.out.print(cal.get(Calendar.AM_PM)+".");
		if(cal.get(Calendar.AM)==0){
			System.out.print("a.m.");
			System.out.print(cal.get(Calendar.HOUR)+"시 or ");//0~11
		}else if(cal.get(Calendar.AM)==1){
			System.out.print("p.m.");
			System.out.print(cal.get(Calendar.HOUR)+"시 or ");//0~11
		}
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"주차");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"주차");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)+"일째");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"일");
	}

}



















