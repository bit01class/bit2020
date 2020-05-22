package com.bit.day11;

public class Ex14 extends com.bit.day10.Ex20 {
    // public > protected >= default > private
    // protected 
    //  - default와 일반적으로 동일
    //  - 단, 상속을통한접근은다른패키지일지라도접근허용
    public static void main(String[] args){
        Ex14 me = new Ex14();
        me.func01();
    }
}