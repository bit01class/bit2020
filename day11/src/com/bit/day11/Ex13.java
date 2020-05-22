package com.bit.day11;
final class Lec13{
    void func01(){
        System.out.println("Lec13 func01...");
    }
    private void func02(){
        System.out.println("private func02....");
    }
}
public class Ex13{// extends Ex13{ final 클래스는 상속거부
    // public > default > private
    public void func01(){
        System.out.println("Ex13 func01...");
    }
    void func02(){}

    public static void main(String[] args){
        Ex13 me=new Ex13();
        me.func01();
        me.func02();
    }
}