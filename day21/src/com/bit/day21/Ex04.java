package com.bit.day21;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file=new File(path);
		
		if(file.delete()){
			System.out.println("������ �����մϴ�");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
	}

}
