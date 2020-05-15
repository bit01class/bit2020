class Ex03{

  // 메서드
  // 클래스메서드,static메서드,정적메서드 (함수,function..)

  public static void func01(){
	System.out.println("01기능을 실행합니다");
  }
  
  // public static void 메서드명(매개변수,매개변수,...){}
  // 반드시소문자로 시작 띄어쓰기x
  // 실행,호출-메서드명();
  // 		매개변수,갯수,타입 일치
  public static void func02(){
	int a=1234;
	System.out.println("a="+a);
  }

  public static void func03(int a){
	//a=9999;
	func02();
	System.out.println("전달받은 데이터:"+a);
  }

  public static void func04(int a, int b){
	int c=a+b;
	System.out.println(a+"+"+b+"="+c);
  }

  public static void main(String[] aaa){
	int a=1111;
	System.out.println("프로그램 시작"+a);
 	func03(1234);
	System.out.println("프로그램 종료"+a);

  }

}







