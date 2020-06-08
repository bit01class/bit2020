package com.bit.day20;

class Com{
	void play(){
		System.out.print("������ ���� ���");
	}
}

class Ball{
	String color="������";
	void play(){
		System.out.print(this.color+" ���� �������ϴ�");
	}
}

class BaseBall extends Ball{
	String color="���";
	void play(){
		System.out.print(" ������ ����� �ֽ��ϴ�");
	}
}

class Bowling extends Ball{
	String color="��Ȳ��";
	void play(){
		System.out.print("���� ���� ");
		super.play();
	}
}

class Box<E>{
	private E myBall;
	
	void push(E myBall){
		this.myBall=myBall;
	}
		
	E pull(){
		return myBall;
	}
}

class Box1{
	private Ball myBall;
	
	void push(Ball myBall){
		this.myBall=myBall;
	}
		
	Ball pull(){
		return myBall;
	}
}

class Box2{
	private Bowling myBall;
	
	void push(Bowling myBall){
		this.myBall=myBall;
	}
		
	Bowling pull(){
		return myBall;
	}
}


class Box3{
	private Com myBall;
	
	void push(Com myBall){
		this.myBall=myBall;
	}
		
	Com pull(){
		return myBall;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		BaseBall base=new BaseBall();
		Bowling bow=new Bowling();
		Com com=new Com();
		
		Box<Bowling> box=new Box<Bowling>();
		box.push(bow);
		
		Bowling ball2 = box.pull(); 
		ball2.play();
	}

}








