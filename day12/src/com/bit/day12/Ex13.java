package com.bit.day12;

public class Ex13 {

	public static void main(String[] args) {
		// String class
		String msg1="Java";
		String msg2="Web";
		String msg3=msg1.concat(msg2);
		System.out.println(msg3); // JavaWeb
		
		String msg4="JavaWebSpring";
		
		String msg5=msg4.substring(4);//WebSpring
		String msg6=msg4.substring(4,7);//Web
		String msg7=msg4.substring(0,4);//Java
		String msg8=msg4.substring(4,msg4.length());
		
		String msg9=msg4.replace("Web","DB");
		String msg10=msg4.replace("Web", "");
		String msg11=msg4.replace('W', 'w');
		String msg12=msg4.replace("Java", "");
		
		char ch=msg4.charAt(0); // 인덱스에 해당하는 문자
		int idx=msg4.indexOf('W'); // 4 문자에 해당하는 인덱스
		idx=msg4.indexOf("Web");	//4
		idx=msg4.indexOf("a",2);
		
		String msg13=msg4.substring(0,msg4.indexOf("Web"));
		String msg14=msg4.substring(msg4.indexOf("Web")+"Web".length());
		String msg15=msg4.replace("a", "A");
		
		System.out.println(msg15);
		

	}

}













