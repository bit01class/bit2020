package com.bit.day21;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// io
		// File
		// ������
//		String path="D:\\javaWorkspace\\day21\\test";
//		String path="D:\\javaWorkspace\\day21\\src";
//		String path="D:\\javaWorkspace\\day21\\test01.txt";
		// �����
//		String path="src";
//		String path="test01.txt";
//		String path="src";
		String path=".";
//		String path="..\\day21\\test01.txt";
//		String path="..\\day21\\src";
		java.io.File file=new java.io.File(path);
		
		System.out.println("�����ϴ°�?"+file.exists());
		System.out.println("�����ΰ�?"+file.isFile());
		System.out.println("���丮�ΰ�?"+file.isDirectory());
		System.out.println("�̸���?"+file.getName());
		System.out.println("location��?"+file.getPath());
		System.out.println("�ܼ� �����δ�?"+file.getAbsolutePath());
		try {
			System.out.println("�Ϲ� �����δ�?"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Path��?"+file.getParent());
		System.out.println("rwx r�б����?"+file.canRead());
		System.out.println("rwx w�������?"+file.canWrite());
		System.out.println("rwx x�������?"+file.canExecute());
		System.out.println("size?"+file.length()+"byte");
		System.out.println("���������ð�?"+new java.util.Date(file.lastModified()));
		String[] dirs=file.list();
		System.out.println(java.util.Arrays.toString(dirs));
	}

}




















