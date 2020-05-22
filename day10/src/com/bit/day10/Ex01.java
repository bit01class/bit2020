package com.bit.day10;

public class Ex01 {
    int su1=1234;

    public void func01(){
        int su1=1111;
        System.out.println("func01 run...");
        this.func02();
        System.out.println("su1="+this.su1);
    }
    public void func01(Ex01 ex){
        System.out.println("func01(param:me) run...");
        System.out.println(ex==this);
        System.out.println("su1="+ex.su1);
        ex.func02();
    }
    public void func02(){
        System.out.println("func02 run...");
    }
    public Ex01 func03(Ex01 me){
        System.out.println("func03 run...");
        return me;
    }
    public Ex01 func04(){
        System.out.println("func04 run...");
        return this;
    }
    public static void main(String[] args){
        Ex01 me =new Ex01();
        me.func04().func04().func04();
        //System.out.println(this);존재불가
    }
}