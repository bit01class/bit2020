class Ex05{

  public static void main(String[] args){
	int su=func01();
	func02();
	System.out.println("su="+su);
  }

  public static void func02(){
	System.out.println("void method run...");
	return;
  }

  public static int func01(){
	System.out.println("func01 method run");
	int a=3;
	int b=20;
	int c=a+b;
	return c;
  }

}