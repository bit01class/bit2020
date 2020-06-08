package com.bit.day21;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file=new File(path);
		
		String rename=".\\test03.txt";
		File file2=new File(rename);
		
		file.renameTo(file2);
	}

}
