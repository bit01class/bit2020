/*
구구단 7단을 출력하시오
*/
class Ex26{

  public static void main(String[] args){
	java.util.Scanner sc
	=new java.util.Scanner(System.in);
	System.out.print("단?");
	int dan=sc.nextInt();
	for(int i=1;i<10;i++){
	  System.out.println(dan+"x"+i+"="+(dan*i));
	}
	/*
	System.out.println("7x1="+(7*1));
	System.out.println("7x2="+(7*2));
	System.out.println("7x3="+(7*3));
	System.out.println("7x4="+(7*4));
	System.out.println("7x5="+(7*5));
	System.out.println("7x6="+(7*6));
	System.out.println("7x7="+(7*7));
	System.out.println("7x8="+(7*8));
	System.out.println("7x9="+(7*9));
	*/
  }

}



