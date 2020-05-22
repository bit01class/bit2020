package com.bit.day11;
class Lec12 extends Object{

    Lec12(int a){
        System.out.println("create Lec12 obj...");
    }

    void func01(){
        System.out.println("Lec12 func01 call...");
    }
}
public class Ex12 extends Lec12 {

    Ex12(){
        this(1234);
        System.out.println("create Ex12");
    }
    Ex12(int a){
        super(a);
    }
    Ex12(String a){
        this();
    }
    public static void main(String[] args){
        Ex12 me =new Ex12();
        me.func01();
    }
}