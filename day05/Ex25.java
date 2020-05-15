class Ex25{

  public static void main(String[] args){

	// 제어문(반복문)
	// for반복문

	int su;
	su=100;

	System.out.println("su="+su);
	su++;
	System.out.println("su="+su);
	su++;
	System.out.println("su="+su);
	su++;
	System.out.println("su="+su);
	su++;
	System.out.println("su="+su);

	System.out.println("---------------");
	/*
		for(초기화;조건문;증감식){
			실행문;
		}
	초기화>조건검사(ture)>실행문
	>증감식>조건검사(ture)>실행문
	>증감식>조건검사(ture)>실행문
	...
	>증감식>조건검사(false)>out
	*/
	for(int i=100;i<105;i++){
		System.out.println("i="+i);
	}
	

  }


}








