package com.bit.day11;

public class Ex03 {
    public static void main(String[] args){
        Float su1=new Float("3.14F");
        System.out.println(su1);
        Double su2;
        su2=new Double("3.14");
        System.out.println(su2);
        Double su3=new Double(3.14);
        System.out.println(su3);

        double su4=Double.parseDouble("3.14");
        //int su5=Integer.parseInt("3.14");
        System.out.println(su4);
        double su6=su3.doubleValue();
        int su7=su3.intValue();
        System.out.println(su7);

        Double su8=2.0/0.0;
        Double su9=0.0/0.0;

        System.out.println(su8.isInfinite());
        System.out.println(su9.isNaN());
    }
}