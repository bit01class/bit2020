class Ex27{

  public static void main(String[] args){

	//Q1. 1~10까지의 합을 구하시오
	int sum1=0;
	for(int i=1; i<=10; i++){
		sum1+=i;
	}
	System.out.println("Q1. 1~10까지의 합="+sum1);
	
	//Q2. 1~10까지의 짝수들의 합을 구하시오
	int sum2=0;
	for(int i=1; i<=10; i++){
		if(i%2==0){sum2+=i;}
	}
	System.out.println("Q2. 1~10까지의 짝수들의 합="+sum2);
	
	int sum3=0;
	for(int i=2; i<=10; i+=2){
		sum3+=i;
	}
	System.out.println("Q2. 1~10까지의 짝수들의 합="+sum3);
	//Q3. 1+3+5+7+9=25를 출력하시오
	int sum4=0;
	for(int i=1; i<10; i++){
		if(i%2!=0){
			if(i!=1){System.out.print("+");}
			System.out.print(i);
			sum4+=i;
		}
	}
	System.out.println("="+sum4);
	System.out.println("-----------------------------------");
	int sum5=0;
	boolean first1=false;
	for(int i=1; i<10; i+=2){
		sum5+=i;
		if(first1){System.out.print('+');}
		System.out.print(i);
		first1=true;
	}
	System.out.println("="+sum5);
	//Q4. 1~50까지 3의 배수를 출력하시오
	boolean first2=false;
	for(int i=1; i<=50; i++){
		if(i%3==0){
			if(first2)System.out.print(',');
			System.out.print(i);
			first2=true;
		}
	}
	System.out.println("\n----------------------------");
	first2=false;
	for(int i=3; i<50; i+=3){
		if(first2){System.out.print(',');}
		System.out.print(i);
		first2=true;
	}

	System.out.println("\n----------------------------");
	//Q5. 2의1승,2의2승,2의3승,2의4승,2의5승을 출력하시오
	// 2의1승 2=1*2
	// 2의2승 4=1*2*2
	// 2의3승 8=1*2*2*2
	// 2의4승 16=1*2*2*2*2
	// 2의5승 32=1*2*2*2*2*2
	int su=1;
	for(int i=1; i<=5; i++){
		System.out.println("2의"+i+"승 ="+su*2);
		su=su*2;
	}
	System.out.println("\n----------------------------");
	for(int i=1; i<6; i++){
		int sum6=1;
		for(int j=1; j<=i ; j++){
			sum6*=2;
		}
		System.out.println(sum6);
	}
  }

}







