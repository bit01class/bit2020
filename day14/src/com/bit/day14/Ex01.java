package com.bit.day14;

abstract class Lec01{
	
	public abstract void func01();// ;����
	
}

class Lec11 extends Lec01{
	public void func01(){
		System.out.println("��������");
	}
}

public class Ex01 {
	//�߻�Ŭ����(abstract)
	// - �߻�޼��带 0���̻� ���� Ŭ����
	// - �߻�޼���(abstract) - �޼����� ����(o), ����(x)
	
	
	public static void main(String[] args) {
		Lec01 you=new Lec11();
		you.func01();
	}

}












