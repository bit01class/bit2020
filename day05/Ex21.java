class Ex21{
/*
다음을 출력하세요
평균 A.90~100 B.80~90미만 C.70~80미만 D.60~70미만 F.60미만

성적관리 프로그램(ver 0.0.2)
------------------------------
국어 94
영어 80
수학 77
--------------------------
합계 251
--------------------------
평균 83.66
--------------------------
학점 B학점
*/

  public static void main(String[] args){

	int kor = 94;
	int eng = 80;
	int math = 77;

	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;

	char grade;
	/* 평균 A.90~100 B.80~90미만 C.70~80미만 D.60~70미만 F.60미만
	if(avg>=90){grade='A';}
	else if(avg>=80){grade='B';}
	else if(avg>=70){grade='C';}
	else if(avg>=60){grade='D';}
	else {grade='F';}
	*/
	switch((int)(avg/10)){

		case 10: case 9:
		grade='A';
		break;
		case 8:
		grade='B';
		break;
		case 7:
		grade='C';
		break;
		case 6:
		grade='D';
		break;
		default:
		grade='F';
	}

	System.out.println("성적관리 프로그램(ver 0.0.2)");
	System.out.println("------------------------------");
	System.out.println("국어 "+kor);
	System.out.println("영어 "+eng);
	System.out.println("수학 "+math);
	System.out.println("--------------------------");
	System.out.println("합계 "+sum);
	System.out.println("--------------------------");
	System.out.println("평균 "+avg);
	System.out.println("--------------------------");
	System.out.println("학점 "+grade+"학점");
  }


}















