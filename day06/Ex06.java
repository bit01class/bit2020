class Ex06{

  public static void main(String[] args){
	// 메서드 이름은 중복 불가
	func01("abcd");
	System.out.println();
	System.out.println(1234);
	System.out.println("출력");
  }

  // 메서드의 오버로드
  // 1. 매개변수의 유무
  // 2. 매개변수의 갯수
  // 3. 매개변수의 타입

  public static void func01(){
	System.out.println("func01()... run...");
  }
  public static int func01(String msg){
	System.out.println(">>>"+msg);
	return 100;
  }
  public static double func01(int a){
	System.out.println(a+"param func01()...run...");
	return 3.14;
  }
  public static void func01(int a, int b){
	System.out.println(a+"param, "+b+"param func01()...run...");
  }

}