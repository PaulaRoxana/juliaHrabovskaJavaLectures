package com.epam.test.stringsmethods;

public class IndexOf {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJAKLMNOPQRSTUVAWXYZ";

        System.out.println(alphabet.indexOf('A'));// 0;
        System.out.println(alphabet.indexOf('Q'));//17
//Returns the index within this string of the first occurrence of the specified character.

        System.out.println(alphabet.indexOf('A', 5));//10
        System.out.println(alphabet.indexOf('Q', 19));//-1
 /*Returns the index within this string of the first occurrence of the specified character,
 starting the search at the specified index.
 ================================== OR ==========================================
 Returns the index within this string of the first occurrence of the specified substring,
 starting at the specified index.*/

        System.out.println(alphabet.lastIndexOf('A'));//23
        //Returns the index within this string of the last occurrence of the specified character.

        System.out.println(alphabet.lastIndexOf("A", 15));
   /*Returns the index within this string of the last occurrence of the specified character,
 searching backward starting at the specified index.*/
   /*Returns the index within this string of the last occurrence of the specified substring,
        searching backward starting at the specified index.*/

        System.out.println(alphabet.indexOf('K'));//11
        System.out.println(alphabet.indexOf('Z'));//27
        System.out.println(alphabet.indexOf('Я'));// -1

        String path = "C:Users\\..\\Cygwin\\";
        String path2 = "C:\\root\\logs\\end.log\"";

        System.out.println(path.indexOf("C", 3));
        System.out.println(path2.indexOf("\\\\"));
    }


}

