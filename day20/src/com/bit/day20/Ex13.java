package com.bit.day20;

class Lec13{
	void func(){
		System.out.println("기능사용");
	}
}

class Template{
	static <T>Box<T> newInstance(T ball){
		Box<T> lec=new Box<T>();
		lec.push(ball);
		return lec; 
	}
}

public class Ex13 {

	public static void main(String[] args) {
		Box<Bowling> lec=Template.<Bowling>newInstance(new Bowling());
		lec.pull().play();
	}

}









