package com.bit.day12;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "Java Web Framework";
		String msg2="       Java Web           ";
		int su=msg.indexOf("web");
		String st1=msg.replace('z', 'Z');
		char ch=msg.charAt(0);
		boolean boo1=msg.contains("web");
		boolean boo2=msg.startsWith("ja");
		boolean boo3=msg.endsWith("Work");
		
		String st2=msg.toLowerCase();
		String st3=msg.toUpperCase();
		
//		int lang=msg2.length();
		boolean boo4=msg2.isEmpty();
		String st4=msg2.trim(); //앞뒤공백을 날림
		System.out.println(msg2);
		System.out.println(st4);

	}

}
