package com.bit.day21;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// io
		// File
		// 절대경로
//		String path="D:\\javaWorkspace\\day21\\test";
//		String path="D:\\javaWorkspace\\day21\\src";
//		String path="D:\\javaWorkspace\\day21\\test01.txt";
		// 상대경로
//		String path="src";
//		String path="test01.txt";
//		String path="src";
		String path=".";
//		String path="..\\day21\\test01.txt";
//		String path="..\\day21\\src";
		java.io.File file=new java.io.File(path);
		
		System.out.println("존재하는가?"+file.exists());
		System.out.println("파일인가?"+file.isFile());
		System.out.println("디렉토리인가?"+file.isDirectory());
		System.out.println("이름은?"+file.getName());
		System.out.println("location는?"+file.getPath());
		System.out.println("단순 절대경로는?"+file.getAbsolutePath());
		try {
			System.out.println("일반 절대경로는?"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Path는?"+file.getParent());
		System.out.println("rwx r읽기권한?"+file.canRead());
		System.out.println("rwx w쓰기권한?"+file.canWrite());
		System.out.println("rwx x실행권한?"+file.canExecute());
		System.out.println("size?"+file.length()+"byte");
		System.out.println("최종수정시간?"+new java.util.Date(file.lastModified()));
		String[] dirs=file.list();
		System.out.println(java.util.Arrays.toString(dirs));
	}

}




















