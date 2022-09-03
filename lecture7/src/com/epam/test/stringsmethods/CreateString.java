package com.epam.test.stringsmethods;

public class CreateString {

    public static void main(String[] args) {
	    String s1 = "hi";
		System.out.println(s1);

	    String s2 = new String(s1);
		System.out.println(s2);

	    char[] chars = {'h', 'i'};
	    String s3 = new String(chars);
		System.out.println(s3);
    }
}
