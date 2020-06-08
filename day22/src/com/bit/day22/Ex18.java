package com.bit.day22;

import java.io.IOException;
import java.io.InputStream;

public class Ex18 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		try {
			System.out.println(inn.read());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
