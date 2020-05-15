class Ex24{

  public static void main(String[] args){
	java.util.Scanner sc
	=new java.util.Scanner(System.in);
	int kor=0;
	int eng=0;
	int math=0;
	System.out.print("국어>");
	kor=sc.nextInt();
	System.out.print("영어>");
	eng=sc.nextInt();
	System.out.print("수학>");
	math=sc.nextInt();

	String msg="";
	msg+="\n\n\n성적관리 프로그램(ver 0.0.2)";//msg=msg+"\n\n\n성적관리 프로그램(ver 0.0.2)";
	msg+="\n------------------------------";
	msg+="\n국어 "+kor;
	msg+="\n영어 "+eng;
	msg+="\n수학 "+math;
	msg+="\n--------------------------";
	int sum=kor+eng+math;
	msg+="\n합계 "+sum;
	msg+="\n--------------------------";
	double avg=sum*100/3/100.0;
	msg+="\n평균 "+avg;
	msg+="\n--------------------------";
	char grade='F';
	/*
		A 65
		B 66
		C 67
		D 68
		E 69
		F 70
	*/


	int tmp=sum/30;
	switch(tmp){
		case 10: 
		case 9:	grade-=1;
		case 8:	grade-=1;
		case 7:	grade-=1;
		case 6:	grade-=2;
		default:
	}

	msg+="\n학점 "+grade;
	System.out.println(msg);


  }

}








