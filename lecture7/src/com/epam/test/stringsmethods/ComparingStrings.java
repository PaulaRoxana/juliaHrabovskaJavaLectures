package com.epam.test.stringsmethods;

public class ComparingStrings {
    public static void main(String[] args) {
        String a = "a";
        String A = "A";
        String b = "a";

        System.out.println(a.equals(A)); // false
        System.out.println(a.equals(b)); // true
        System.out.println(a.equalsIgnoreCase(A)); //true
        //positive: a is after A;
        //negative: the value is before another value
        //0=the same;

        String abc = "abidefhxhfxfn";
        String cba = "cba";

        //!!!ORDER MATTERS
        System.out.println(a.compareTo(A));//32; a=97; A=65;
        System.out.println(A.compareTo(a));//-32; a=97; A=65;

        System.out.println(a.compareToIgnoreCase(A));//0
        System.out.println(A.compareToIgnoreCase(a));//0

        System.out.println(abc.compareToIgnoreCase(cba));//-2
    }
}
