package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file=new File(path);	
		try {
			if(file.createNewFile()){
				System.out.println("���ϻ����Ϸ�");
			}else{
				System.out.println("���������� �����մϴ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
