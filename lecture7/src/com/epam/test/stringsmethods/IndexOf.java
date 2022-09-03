package com.epam.test.stringsmethods;

public class IndexOf {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('A'));// 0
        System.out.println(alphabet.indexOf('K'));//10
        System.out.println(alphabet.indexOf('Z'));//25
        System.out.println(alphabet.indexOf('Я'));// -1
    }
}
