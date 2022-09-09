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
        //!!!ORDER MATTERS
        String abc = "abc";
        String cba = "cba";

        System.out.println(a.compareTo(A));
        System.out.println(a.compareToIgnoreCase(A));

        System.out.println(abc.compareToIgnoreCase(cba));
    }
}
