package com.epam.test.stringsmethods;

public class ConstantPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :" + (s1 == s2)); // true
        System.out.println("s1 == s3 :" + (s1 == s3)); // false
        String s4 = s3.intern();//s3.intern() = memory
        System.out.println(System.identityHashCode(s1));  //1329552164
        System.out.println(System.identityHashCode(s2)); //1329552164
        System.out.println(System.identityHashCode(s3)); //363771819
        System.out.println(System.identityHashCode(s4)); //1329552164

    }
}
