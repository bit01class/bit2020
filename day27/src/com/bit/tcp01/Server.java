package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port=8080;
		java.net.ServerSocket serve=null;
		Socket sock = null;
		java.io.OutputStream os=null;
		java.io.InputStream is=null;
		java.io.InputStreamReader isr=null;
		try {
			serve=new ServerSocket(port);
			System.out.println("server:立加措扁吝...");
			sock = serve.accept();
			System.out.println("server:立加凳...");
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			os=sock.getOutputStream();
			int su=-1;
			while((su=is.read())!=-1){
				os.write(su);
				os.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}














