class Ex23{

  public static void main(String[] args){

	// 입력받기
	String input1;
	input1=args[0];
	System.out.println("result1>"+input1);

	//입력 사전 준비
	java.util.Scanner sc
	=new java.util.Scanner(System.in);
	
	//입력받기
	System.out.print("문자열입력>");
	String input2=sc.nextLine();
	System.out.println("result2>"+(input2+1));

	System.out.print("숫자입력>");
	int su=sc.nextInt();
	System.out.println("result3>"+(su+1));
  }


}











