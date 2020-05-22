package com.bit.day10;

public class Ex04 {
    static String msg2=null;
    
    Ex04(){}
    Ex04(int a){}
    Ex04(int[] a){}
    Ex04(String a){}
    Ex04(String[] a){}

    public static void main(String[] args){
        String msg1;
        msg1="문자열";
        String msg3="";
        String msg4=new String();
        char[] ch={'문','자','열'};
        String msg5=new String(ch);
        String msg6=new String("문자열");
        String msg7="문자열";

        String msg8="문자";
        String msg9=msg8+"열";
        String msg10="문자"+"열";
        System.out.println(msg7==msg9);
        System.out.println(msg7==msg10);
        byte[] by={65,10,13,67,68};// \r\n
        String msg11=new String(by);
        System.out.println(msg11);
        byte[] by2=new byte[128];
        for(int i=0; i<by2.length; i++){
            by2[i]=(byte)i;
        }
        String msg12=new String(by2);
        //System.out.println(msg12);
        
    }
}