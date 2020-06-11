package com.bit.tcp03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer extends Thread{
	static ArrayList<OutputStream> list=new ArrayList<OutputStream>();
	Socket sock;
	
	public MultiServer(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			InetAddress addr = sock.getInetAddress();
			System.out.println(addr.getHostAddress()+"立加");
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			os=sock.getOutputStream();
			list.add(os);
			while(true){
				String msg=br.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;
				for(int i=0; i<list.size(); i++){
					OutputStream stu = list.get(i);
					osw=new OutputStreamWriter(stu);
					bw=new BufferedWriter(osw);
					bw.write(addr.getHostAddress()+">>"+msg);
					bw.newLine();
					bw.flush();
				}
//				bw.write(addr.getHostAddress()+">>"+msg);
//				bw.newLine();
//				bw.flush();
			}
			System.out.println(addr.getHostAddress()+"辆丰");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(osw!=null)osw.close();
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		int port = 8080;
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(port);
			while(true){
				Socket sock=serv.accept();
//				InetAddress addr = sock.getInetAddress();
//				System.out.println(addr.getHostAddress()+"立加");
				MultiServer thr=new MultiServer(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











