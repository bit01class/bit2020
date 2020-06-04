package com.bit.day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) throws InterruptedException {
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		for(int i=0; i<10; i++){
			Date date=new Date();
			String msg=sdf.format(date);
			System.out.println(msg);
				Thread.sleep(1000);
		}

	}

}
