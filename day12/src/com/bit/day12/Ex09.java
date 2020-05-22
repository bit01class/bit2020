package com.bit.day12;

public class Ex09 {

	public static void main(String[] args) {
		int[] lotto=new int[6];
		int cnt=0;
		try{
			while(true){
				lotto[cnt++]=(int)(Math.random()*45)+1;
			}
		}catch(ArrayIndexOutOfBoundsException e){
		}
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
	}

}
