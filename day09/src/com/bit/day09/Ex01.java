package com.bit.day09;

class Ex01{
  // 메서드 (객체의 기능)
    // static - 클래스 메서드
    // non-static - 인스턴스 메서드
  // 변수 (객체의 속성)
    // static - 정적,전역
    // non-static - 맴버필드 
  int su=1234;
  static int su2=4321;
  // 생성자
  // 생성자의 이름 == 클래스명
  // 클래스명(인자...){}
  // default 생성자 - 클래스명(){}
  // default 생성자의 경우는 다른 생성자가 존재하지 않을시
  // 생략 가능...
  //public Ex01(){}
  public Ex01(){
    System.out.println("객체를 생성합니다");
    return;
  }
  
  public static void main(String[] args){
    func01();
    //변수의 선언
    Ex01 me; 
    //변수의 초기화
    me= new Ex01();
  	System.out.println("su="+me.su);
  }

  static void func01(){
	System.out.println("static method func01()");
  }

  public void func02(){
	System.out.println("non-static method func02()");
  }

}






