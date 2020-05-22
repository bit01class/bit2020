package com.bit.day10;

public class Ex10 {
    public static void main(String[] args){
        //로또번호생성기
        // 1~45까지 숫자 6
        // 랜덤, 중복불가
        // 오름차순 정렬 출력
        // 보너스번호
        int[] lotto=new int[7];
        //중복검사후 입력
        //중복시 재입력
        for(int i=0; i<lotto.length; i++){
            int ran=(int)(Math.random()*45)+1;
            lotto[i]=ran;
            for(int j=0; j<=i-1; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
        }
        //오름차순 정렬
        int temp=0;
        for(int i=0; i<5; i++){
            for(int j=i+1;j<6; j++){
                if(lotto[i]>lotto[j]){
                    temp=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=temp;
                }
            }
        }

        for(int i=0; i<6; i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println("\t보너스번호:"+lotto[6]);
    }
    
}