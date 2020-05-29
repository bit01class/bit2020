package com.bit.day18;

class Lec02{
	static int su1=1111;
	int su2=2222;
	
	static class Lec22{
		static int su3=3333;
		int su4=4444;
		
		Lec22(){}
		
		static void func03(){
			System.out.println("inner func03..");
//			System.out.println("su1="+Lec02.su1);
//			Lec02.func01();
			System.out.println("su1="+su1);
			func01();
			System.out.println("-------------------------");
			Lec02 lec02=new Lec02();
			System.out.println(lec02.su2);
			lec02.func02();
//			(x)System.out.println(su2);
//			(x)func02();
		}
		void func04(){
			System.out.println("inner func04..");
//			System.out.println("su1="+Lec02.su1);
//			Lec02.func01();
			System.out.println("su1="+su1);
			func01();
			System.out.println("-------------------------");
			Lec02 lec02=new Lec02();
			System.out.println(lec02.su2);
			lec02.func02();
//			(x)System.out.println(su2);
//			(x)func02();
		}
	}
	
	Lec02(){}
	
	static void func01(){
		System.out.println(su1);
		System.out.println(Lec22.su3);
		Lec22.func03();
		System.out.println("-------------------------");
		Lec22 inn=new Lec22();
		System.out.println(inn.su4);
		inn.func04();
	}
	void func02(){
		System.out.println(Lec22.su3);
		Lec22.func03();
		System.out.println("-------------------------");
		Lec22 inn=new Lec22();
		System.out.println(inn.su4);
		inn.func04();
	}
}

public class Ex08 {

	public static void main(String[] args) {
		System.out.println(Lec02.Lec22.su3);
		Lec02.Lec22.func03();
		
		Lec02.Lec22 inner=new Lec02.Lec22();
//		Lec22 inner=new Lec22();//import com.bit.day18.Lec02.Lec22;
		System.out.println("Lec02.Lec22 su4="+inner.su4);
		inner.func04();
	}

}
















