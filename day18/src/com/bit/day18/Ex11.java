package com.bit.day18;

class Lec04{
	static int su1=1111;
	int su2=2222;
	
	Lec04(){}
	
	static void func01(){
		int su9=9999;
		class Lec55{}
		
	}
	
	void func02(int su5){
		int su9=9999;
		class Lec44{
			static final int su3=3333;
			int su4=4444;
			Lec44(){}
//			static void func03(){}
			void func04(){
			}
			void func05(){
				func04();
				func02(1);
				// ~jdk 1.7 �������������� final �ʼ� 
				// jdk 1.8~ final ��������
				int a=su9;
				int b=su1;
				int c=su2;
				int d=su5;
			}
		}
		
		Lec44 inner=new Lec44();
		System.out.println(Lec44.su3);
		System.out.println(inner.su4);
		inner.func04();
	}
}

public class Ex11 {

	public static void main(String[] args) {
		

	}

}









