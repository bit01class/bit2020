class Ex16{

public static void main(String[] args){
// 0입니다
// 양수이고 홀수입니다
// 양수이고 짝수입니다
// 음수이고 홀수입니다
// 음수이고 짝수입니다
int input;
input=-12;
if(input==0){
	System.out.println("0입니다");
}

if(input!=0){
	if(input>0){
		System.out.println("양수이고 ");
	}
	if(input<0){
		System.out.println("음수이고 ");
	}
	if(input%2==0){
		System.out.println("짝수입니다");
	}
	if(input%2!=0){
		System.out.println("홀수입니다");
	}
}	

}







if(input>0){
	System.out.println("양수이고 ");
}
if(input<0){
	System.out.println("음수이고 ");
}
if(input>0&&input%2==0){
	System.out.println("짝수입니다");
}
if(input>0&&input%2!=0){
	System.out.println("홀수입니다");
}




if(input>0&&input%2==1){
	System.out.println("양수이고 홀수입니다");
}
if(input>0&&input%2==0){
	System.out.println("양수이고 짝수입니다");
}
if(input!=0&&input<0&&input%2==-1){
	System.out.println("음수이고 홀수입니다");
}
if(input!=0&&input<0&&input%2==0){
	System.out.println("음수이고 짝수입니다");
}


}

}






