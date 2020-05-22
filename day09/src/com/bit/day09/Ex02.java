package com.bit.day09;

class Ex02{
    // 접근제한자
    // public >> default > private
    // public - 어디서나 접근허용
    // default - 동일패키지에서만 접근을 허용
    // private - 동일클래스내부에서만 접근허용, 클래스에서는 불가
    private int su;

    private Ex02(){}
    private void func01(){}

    public static void main(String[] args){
        Ex01.func01();
        //System.out.println(com.bit.day08.Ex01.a);
        

    }

}