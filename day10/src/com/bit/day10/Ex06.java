package com.bit.day10;

public class Ex06 {
    
    public static void main(String[] args){
        int su=1234;
        int[] arr1={1,3,5,7,9};
        int[] arr2={1,3,5,7,9};
        int[] arr3=new int[]{1,3,5,7,9};
        int[] arr4=arr3;//배열의 옅은복사
        arr4[2]=10;
        System.out.println(arr1.toString());
        System.out.println(arr1==arr2);
        System.out.println(arr3==arr4);
        func01(arr3);
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
    public static void func01(int[] su){
        //int[] su=arr3;
        su[3]=1234;
    }
}