package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String prefix="AABBCCDDEEFFGG";
		String suffix=".txt";
		try {
			File file=File.createTempFile(prefix, suffix);
			System.out.println(file.getParent());
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
