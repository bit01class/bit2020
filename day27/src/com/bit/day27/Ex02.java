package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		//url
		//scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
		// ��������://ȣ��Ʈ:��Ʈ��ȣ/�н�?����#������
//		String spec="https://www.seoul.go.kr/news/news_tender.do#view/318319";
		String spec="http://www.jejusi.go.kr/information/intro/news.do?notice_id=bfe180bf04d34362b8a05f7837b147b6";
//		String spec="https://naver.com/";
		java.net.URL url=null;
		
		try {
			url=new URL(spec);
			System.out.println("��������:"+url.getProtocol());
			System.out.println("������(ip):"+url.getHost());
			// http - default port: 80
			// https - default port: 443
			System.out.println("��Ʈ��ȣ:"+url.getPort());
			System.out.println("��Ʈ��ȣ(default):"+url.getDefaultPort());
			System.out.println("�н����:"+url.getPath());
			System.out.println("url����:"+url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}





