package com.bit.day11;
class Lec01{
    int su=1234;
    void func01(){
        su++;
        System.out.println("Lec01 func01...");
    }
}
class Lec11 extends Lec01{
    int su=4321;
    // void func01(){
    //     su++;
    //     System.out.println("Lec11 func01...");
    // }
       void func02(){
           System.out.println(super.su);
       } 
}
public class Ex11 {
    public static void main(String[] args){
        Lec11 lec11=new Lec11();
        lec11.func01();
        System.out.println(lec11.su);
        lec11.func02();
    }
}