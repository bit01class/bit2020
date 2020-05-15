class Ex30{

  public static void main(String[] args){
	//Q1. 1~50까지의 합을 구하시오
	int sum1=0;
	
	int su1=1;
	while(su1<51){
		sum1+=su1;
		su1++;
	}
	/*
	int i;
	for(i=1; i<51; i++){
	  sum1+=i;
	}
	*/
	System.out.println("Q1. 1~50까지의 합="+sum1);


	//Q2. 1~100까지의 짝수들의 합을 구하시오
	sum1=0;
	int su2=2;
	while(su2<=100){
		sum1+=su2;
		su2+=2;
	}
	System.out.println("1~100까지의 짝수들의 합="+sum1);

	//Q3. 1+3+5+7+9=25를 출력하시오
	int sum3=0;
	int su3=1;
	while(su3<10){
		sum3+=su3;
		if(su3!=1){System.out.print('+');}
		System.out.print(su3);
		su3++;
		su3++;
	}
	System.out.println("="+sum3);
	//Q4. 1~50까지 3의 배수를 출력하시오
	int su4=1;
	while(su4<51){
		if(su4%3==0){
			System.out.print(su4+" ");
		}
		su4++;		
	}
	System.out.println("\n-----------------------");
	//3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
	su4=3;
	while(su4<51){
		System.out.print(su4+" ");
		su4+=3;
	}
	System.out.println("\n-----------------------");
	//Q5. 2의1승,2의2승,2의3승,2의4승,2의5승을 출력하시오
	// 2의1승 2=1*2
	// 2의2승 4=1*2*2
	// 2의3승 8=1*2*2*2
	// 2의4승 16=1*2*2*2*2
	// 2의5승 32=1*2*2*2*2*2
	
	System.out.println(1*2);
	System.out.println(1*2*2);
	System.out.println(1*2*2*2);
	System.out.println(1*2*2*2*2);
	System.out.println(1*2*2*2*2*2);
	System.out.println("-----------------------");
	int sum5=1;
	int su5=1;
	while(su5<6){
		sum5=sum5*2;
		System.out.println("2의"+su5+"승="+sum5);
		su5++;
	}
	System.out.println("-----------------------");
	// 2 = 1+1
	// 4 = 2+2
	// 8 = 4+4
	// 16 = 8+8
	// 32 = 16+16
	sum5=0;
	su5=1;
	int cnt=0;
	while(cnt<5){
		sum5=su5+su5;
		System.out.println(sum5);
		su5=sum5;
		cnt++;
	}
	
  }
}












