package com.bit.day07;

class Ex09{

  public static void main(String[] args){
	//Q1. A~Z출력하세요
	for(int i=0; i<'Z'-'A'+1; i++){
		char tmp=(char)('A'+i);
		System.out.print(tmp +" ");
	}
	System.out.println("\n--------------------\n");
	//Q2. a~z출력하세요
	for(int i=0; i<'Z'-'A'+1; i++){
		char tmp=(char)('a'+i);
		System.out.print(tmp +" ");
	}
	System.out.println("\n--------------------\n");
	//Q3. A(a) B(b) C(c) ... Z(z) 출력하세요
	for(int i=0; i<'Z'-'A'+1; i++){
		char tmp=(char)('A'+i);
		char tmp2=(char)(tmp+'a'-'A');
		System.out.print(tmp+"("+tmp2+") ");
	}

	System.out.println("\n--------------------\n");
	//Q4. 	★★★★
	//	★★★★
	//	★★★★

	//★★★★┛★★★★┛★★★★┛
	for(int i=1; i<16; i++){
		if(i%5!=0){
			System.out.print('★');
		}else{
			System.out.println();
		}
	}

	System.out.println("\n--------------------\n");
	for(int i=0; i<3; i++){
		for(int j=0; j<4; j++){
			System.out.print('★');
		}
		System.out.println();
	}

	System.out.println("\n--------------------\n");

	//Q5.	1 2 3
	//	4 5 6
	//	7 8 9
	for(int i=1; i<8; i+=3){
		System.out.println(i+" "+(i+1)+" "+(i+2));
	}
	System.out.println("\n--------------------\n");
	int su=1;
	while(su<10){
		System.out.println(su+++" "+su+++" "+su++);
	}
	System.out.println("\n--------------------\n");
	su=1;
	for(int i=1; i<13; i++){
		if(i%4!=0){
			System.out.print(su++);
			System.out.print(' ');
		}else{
			System.out.println();
		}
	}
	System.out.println("\n--------------------\n");
	su=1;
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print(su++);
			//System.out.print(1+j+3*i);
			System.out.print(' ');
		}
		System.out.println();
	}

	System.out.println("\n--------------------\n");
	//Q6.	1 2 3
	//	2 3 4
	//	3 4 5
	int limit=3;
	boolean boo=true;
	for(int i=1; boo; i++){
		System.out.print(i);
		if(limit==i){
			limit++;
			i-=2;
			System.out.println();
			if(limit==6){boo=false;}
		}
	}

	System.out.println("\n--------------------\n");
	for(int i=0;i<3;i++){
		for(int j=1;j<4;j++){
			System.out.print(j+i);
			System.out.print(' ');
		}
		System.out.println();
	}
  }

}

















