package com.bit.day10;

public class Ex05 {
    public static void main(String[] args){
        String msg1="java";
        String msg2="Framework";
        String msg3=msg1+msg2;
        String msg4=msg1.concat(msg2);
        System.out.println(msg4);
        System.out.println("-------------");
        String msg5="ja"+"va";
        String msg6="ja".concat("va");
        System.out.println(msg1==msg5);
        System.out.println(msg1==msg6);
        System.out.println("-------------");
        String msg7="ABCD EFG";
        System.out.println(msg7.length());
        for(int i=0; i<msg7.length(); i++){
            System.out.println(msg7.charAt(i));
        }
        System.out.println("-------------");
        char[] ch1={'A','B','C','D'};
        String msg8=new String(ch1);
        System.out.println(msg8);
        char[] ch2=msg8.toCharArray();
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]);
        }
    }
}