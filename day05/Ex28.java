/*
2*1 3*1 4*1 ....
2*2 3*2 ...
...
*/
class Ex28{

  public static void main(String[] args){
	//구구단 출력
	for(int i=1; i<10 ; i++){
		for(int dan=2; dan<10; dan++){
		    System.out.print(dan+"x"+i+"="+(dan*i));
		    System.out.print('\t');
		}
		System.out.println();
	}
	
  }

}













