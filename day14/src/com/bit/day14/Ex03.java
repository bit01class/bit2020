package com.bit.day14;

abstract class Lec03 extends Object{
	
	Lec03(){
		super();
		System.out.println("�θ�ü ���� ...");
	}
	
	void func01(){
		System.out.println("������ �������� �޼��� �Դϴ�");
	}
	
	abstract void func02();
}

class Lec33 extends Lec03{
	Lec33(){
		super();
		System.out.println("�ڽİ�ü ����");
	}

	@Override
	void func02() {
		System.out.println("�ڽĿ��� func02 ����...");
	}

	
}

class Ex03 {

	public static void main(String[] args) {
		Lec03 you=new Lec33();
		you.func01();
		you.func02();

	}

}
