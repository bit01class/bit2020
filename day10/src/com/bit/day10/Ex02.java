package com.bit.day10;

class Ex02 {
    int su;
    
    public Ex02(){
        this(1234);
        System.out.println(this);
    }

    public Ex02(int su){
        //객체생성
        System.out.println("객체가 생성되었습니다");
        this.su=su;
        System.out.println(this);
    }

    public static void main(String[] args){
        Ex02 me = new Ex02();
        System.out.println(me);
        System.out.println("su="+me.su);
    }
}