package com.epam.practice;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingArray {

        // function reverses the elements of the array
        static List<Integer> reverse(Integer[] a)
        {
            Collections.reverse(Arrays.asList(a));
            return Arrays.asList(a);
        }

        public static void main(String[] args)
        {
            Integer [] arr = {10, 20, 30, 40, 50};
            System.out.println(reverse(arr));


        }



    }

