package com.epam;

import java.util.Scanner;

public class MaxValueInSeq {

    /* Task 5 "Max Value In Sequence"
The purpose of this exercise is to train you to use simple loops and conditional statements.
Estimated workload of this exercise is 20 minutes.
Description
Please, proceed to FindMaxInSeq and write a program that reads a sequence of integer values from standard output and finds the maximum value. You must place your solution into the max method to pass tests.
Details:
You must read sequence values until the next one is 0. Zero value means end of the input sequence.
The sequence is guaranteed to contain at least one value.
Example
Input: 2 4 6 9 2 4 5 0
Output:9
*/
    public static int max() {

        int largest = Integer.MIN_VALUE;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
        }
        while (number != 0);
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
