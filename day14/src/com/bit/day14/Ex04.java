package com.bit.day14;

interface Inter01{
	// ���� �߻�޼��常�� ���´�
	// ��ü ������ �Ұ���(?)�ϰ� ���� �����ڿ� �ʵ嵵 ����
	// ����)public static final ������ ����
	// ����)�޼���տ� public abstract ��������
	
	public static final int su1=1111;
	static final int su2=2222;
	final int su3=3333;
	int su4=4444;
	
	public abstract void func01();
	public void func02();
	void func03(); // default(x), public(o)
}

interface Inter02{}
interface Inter03{}
// Ŭ������ ����
// �з�,����

public class Ex04 extends Object implements Inter01,Inter02,Inter03{

	public static void main(String[] args) {
		Inter01 me=new Ex04();
		me.func01();
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}



}











