package com.bit.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
//		ip 
		
		String url="localhost";
		java.net.InetAddress addr01=null;
		InetAddress[] all = null;
		try {
			addr01=InetAddress.getByName(url);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getCanonicalHostName());
			System.out.println(addr01.getHostAddress());
			System.out.println("---------------------------");
			///////////////////////////////////////////
			all = addr01.getAllByName(url);
//			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
//
		for(int i=0; i<all.length; i++){
			System.out.println(all[i].getHostAddress());
		}
		
	}

}
















