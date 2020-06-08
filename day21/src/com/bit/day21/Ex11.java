package com.bit.day21;

public class Ex11 {

	public static void main(String[] args) {
			boolean boo=true;
			try{
				int[] arr={1,3,5};
				System.out.println(arr[1]);
				if(boo){
//					System.exit(1);
					return;
				}
//			}catch(ArrayIndexOutOfBoundsException e){
//				System.out.println("에러회피");
			}finally{
				System.out.println("수고하셨습니다");
			}
	}

}













