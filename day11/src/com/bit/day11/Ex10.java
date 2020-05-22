package com.bit.day11;

class Father  extends Object{
    int money=1000;

    void work(){
        this.money+=100;
        System.out.println("돈벌어온다");
    }
    void push(){
        money-=10;
    }
}
class Mother extends Father{}

class Son extends Mother{
    int money=0;

    // 메서드 오버라이드
    void work(){
        this.push();
        money+=10;
        System.out.println("용돈을 받는다");
    }
}

public class Ex10{
    public static void main(String[] args){
        // Father fa=new Father();
        // System.out.println(fa.money);
        // fa.work();
        // fa.work();
        // fa.work();
        // fa.push();
        // System.out.println(fa.money);

        Son son=new Son();
        System.out.println(son.money);
        son.work();
        System.out.println("---------------");
        Object obj=new Object();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println("---------------");
        Ex10 me=new Ex10();
        System.out.println(me.toString());
        System.out.println(me.hashCode());
        System.out.println(me);
    }
    public String toString(){
        return "나 자신";
    }
}