package com.bit.day11;

public class Ex05 {
    public static void main(String[] args){
        char ch1='가';
        Character ch2=new Character(ch1);
        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        //유니코드문자인지
        System.out.println("유니코드인지:"+Character.isDefined(ch1));
        System.out.println("숫자인가?"+Character.isDigit(ch1));
        // if '0'<= ch1 <='9'
        System.out.println("문자인가?"+Character.isAlphabetic(ch1));
        System.out.println("문자인가?"+Character.isLetter(ch1));
        // 대소구분
        System.out.println("대문자인가?"+Character.isUpperCase(ch1));
        System.out.println("소문자인가?"+Character.isLowerCase(ch1));
        // 띄어쓰기
        System.out.println("띄어쓰기"+Character.isSpace(ch1));
        System.out.println(Character.isWhitespace(ch1));

    }
}