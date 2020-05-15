package com.bit.day08;

class Ex11{
  public static void main(String[] args){
	System.out.println("Q1.--------------------------");
	for(int i=0; i<4 ; i++){
		for(int j=0; j<=i ; j++){
			System.out.print('★');
		}
		System.out.println();
	}
	System.out.println("--------------------------");
	for(int i=0; i<4 ; i++){
		for(int j=0; j<4 ; j++){
			if(j<=i){System.out.print('★');}
		}
		System.out.println();
	}System.out.println("--------------------------");
	// 0 +2
	// 2 +3
	// 5 +4
	// 9 +5
	// 14 +6
	// 20
	int total=0;
	int cnt=2;
	for(int i=0; i<15 ; i++){
		System.out.print('★');
		if(i==total){
			System.out.println();
			total+=cnt++;
		}
	}
	System.out.println("\nQ2.--------------------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<=i){System.out.print(j+1);}
		}
		System.out.println();
	}
	System.out.println("\n--------------------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
			System.out.print(j+1);
		}
		System.out.println();
	}
	System.out.println("\n--------------------------");
	//1012012301234
	int su=2;
	for(int i=1; i<5; i++){
		if(i%su==0){
			System.out.println();
			su++;
			i=0;
			continue;
		}
		System.out.print(i);
	}
	//1	1%2
	//0	2%2
	//1	1%3
	//2	2%3
	//0	3%3
	//1	1%4
	//2	2%4
	//3	3%4
	//0	4%4
	//1	1%5
	//2	2%5
	//3	3%5
	//4	4%5

	System.out.println("\nQ3~4.--------------------------");
	total=0;
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
			System.out.print((char)('A'+total++));
		}
		System.out.println();
	}

	System.out.println("\nQ5.--------------------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(i+1-j>0){System.out.print(i+1-j);}
		}
		System.out.println();
	}
	System.out.println("\n--------------------------");
	for(int i=0; i<4; i++){
		for(int j=i+1; j>0; j--){
			System.out.print(j);
		}
		System.out.println();
	}

	System.out.println("\nQ6.--------------------------");
	for(int i=0; i<4 ; i++){
		for(int j=0; j<4 ; j++){
			if(j>=i){System.out.print('★');}
		}
		System.out.println();
	}
	System.out.println("\nQ7.--------------------------");
	for(int i=0; i<4 ; i++){
		for(int j=0; j<4 ; j++){
			if(j>=3-i){
				System.out.print('★');
			}else{
				System.out.print('　');
			}
		}
		System.out.println();
	}
  }
}
/*
Q1.
★
★ ★
★ ★ ★
★ ★ ★ ★
Q2.
1
1 2
1 2 3
1 2 3 4
Q4.
A
B C
D E F
G H I J
Q5.
1		i+1-j
2 1
3 2 1
4 3 2 1
Q6.
★ ★ ★ ★
★ ★ ★
★ ★
★
Q7.
      ★ 3
    ★ ★ 2 3
  ★ ★ ★ 1 2 3
★ ★ ★ ★ 0 1 2 3
Q8.
      ★
    ★ ★ ★
  ★ ★ ★ ★ ★
★ ★ ★ ★ ★ ★ ★
  ★ ★ ★ ★ ★
    ★ ★ ★
      ★
*/