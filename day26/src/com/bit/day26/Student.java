package com.bit.day26;

public class Student implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// transient - ��ü ����ȭ�� ���� ���
	public int num;
	transient String name;
	protected static int kor;
	int eng;
	private int math;
	
	public Student(int num,String name,int kor,int eng,int math) {
		this.num=num;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public void show(){
		System.out.println(num+"�� "+name+"�� ���� "
				+kor+"��, ���� "+eng+"��, ���� "+math+"�� �Դϴ�");
	}
	
	public String toString(){
		return num+"�� "+name+"�� ���� "
				+kor+"��, ���� "+eng+"��, ���� "+math+"�� �Դϴ�";
	}
}