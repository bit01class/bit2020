package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class UdpSender {
	public static void main(String[] args) {
		String msg="Hello UDP";
		
		byte[] ip={(byte)192,(byte)168,0,(byte)169};//"192.168.0.169";
		int port=8080;
		
		java.net.DatagramSocket sock=null;
		java.net.DatagramPacket pack=null;
		/*
		 * DatagramPacket
			public DatagramPacket(byte[] buf,int length)
			
			Constructs a DatagramPacket for receiving packets oflength length. 
			The length argument must be less than or equal to buf.length.
			Parameters:buf - buffer for holding the incoming datagram.length - the number of bytes to read.
		 */
		try {
			sock=new java.net.DatagramSocket();
			InetAddress addr = InetAddress.getByAddress(ip);
			/// 1차
			pack=new DatagramPacket(msg.getBytes(), msg.length(),addr,port);
			sock.send(pack);
			/// 2차
			pack=new DatagramPacket("한글".getBytes(), 4,addr,port);
			sock.send(pack);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}
	}
}















