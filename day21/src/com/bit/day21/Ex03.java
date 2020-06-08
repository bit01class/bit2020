package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file=new File(path);	
		try {
			if(file.createNewFile()){
				System.out.println("파일생성완료");
			}else{
				System.out.println("기존파일이 존재합니다");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
