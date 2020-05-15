class Ex34{

  public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("\n가위바위보 게임(ver 0.0.2)");
	System.out.println("----------------------------\n\n");
	int win=0;
	int sav=0;
	int los=0;
	int input=0;
	int com=0;// 0~2
	boolean boo=true;
	while(boo){
	System.out.print("1.가위 2.바위 3.보 0.종료>>>");
	input=sc.nextInt()-1;
	String msg="당신:";
	if(input==0){
		msg+="가위";
	}else if(input==1){
		msg+="바위";
	}else if(input==2){
		msg+="보";
	}
	msg+=",컴퓨터:";

	// com : 0~2
	com=(int)(Math.random()*3);

	if(com==0){
		msg+="가위";
	}else if(com==1){
		msg+="바위";
	}else if(com==2){
		msg+="보";
	}
	if(input==-1){
		boo=false;
	}else{
	System.out.println(msg);
	if(input==com){
		System.out.println("비겼습니다");
		sav++;
	}else if((input==0&&com==2)||(input==1&&com==0)||(input==2&&com==1)){
		System.out.println("당신이 이겼습니다");
		win++;
	}else{
		System.out.println("컴퓨터가 이겼습니다");
		los++;
	}
	}
	}
	System.out.println("(전적)"+win+"승"+sav+"무"+los+"패");
  }// main end

}// class end












