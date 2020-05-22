package com.bit.day09;

public class Ex06 {
    public static void main(String[] args){
        //다음에 배열에 값을 +2씩하고 출력하라
        int[] su1={1,4,6,7,9};
        System.out.println("배열의 길이:"+su1.length);
        for(int i=0; i<su1.length; i++){
            su1[i]+=2;
        }
        for(int i=0; i<su1.length; i++){
            System.out.print(su1[i]);
        }
        System.out.println("\n------------------------");
        // 0~10중 홀수을 담는 배열을 생성하고 출력하시오
        int cnt=0; 
        for(int i=0; i<11; i++){
            if(i%2==1){cnt++;}
        }
        // 홀수의 갯수를 카운트
        int[] su2=new int[cnt];
        System.out.println("cnt="+cnt);
        int idx=0;
        for(int i=0; i<11; i++){
            if(i%2==1){
                su2[idx++]=i;
            }
        }

        for(int i=0; i<su2.length; i++){
            System.out.print(su2[i]);
        }
        System.out.println("\n------------------------");
        // 알파벳 대문자를 담는 배열을 만들고 출력하시오
        char[] ch=new char['Z'-'A'+1];
        for(int i=0; i<ch.length; i++){
            ch[i]=(char)('A'+i);
        }
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println("\n------------------------");
        //다음을 오름차순 정렬 출력하시오
        int[] su4={9,10,20,7,2,4,8,3};//5*4*3*2*1
        //  {2,3,4,7,8}
        int[] su3={7,2,4};// 3*2*1
        //  {7,2,4}
        //  {2,7,4}
        //  {2,4,7}
        System.out.print(2);
        System.out.print(4);
        System.out.print(7);
        System.out.println("\n------------------------");
        int temp=0;
        if(su3[0]<su3[1]&&su3[0]<su3[2]){
            System.out.println(su3[0]);
            su3[0]=su3[0];
        }else if(su3[1]<su3[0]&&su3[1]<su3[2]){
            System.out.println(su3[1]);
            temp=su3[0];
            su3[0]=su3[1];
            su3[1]=temp;
        }else if(su3[2]<su3[0]&&su3[2]<su3[1]){
            System.out.println(su3[2]);
            temp=su3[0];
            su3[0]=su3[2];
            su3[2]=temp;
        }

        if(su3[1]<su3[2]){
            System.out.println(su3[1]);
        }else if(su3[2]<su3[1]){
            System.out.println(su3[2]);
            temp=su3[1];
            su3[1]=su3[2];
            su3[2]=temp;
        }

        System.out.println(su3[2]);
        System.out.println("\n------------------------");
        for(int i=0; i<su4.length-1; i++){
            for(int j=i+1; j<su4.length; j++){
                if(su4[i]>su4[j]){
                    temp=su4[i];
                    su4[i]=su4[j];
                    su4[j]=temp;
                }
            }
        }
        for(int i=0; i<su4.length; i++){
            System.out.print(su4[i]+" ");
        }
    }
    
}