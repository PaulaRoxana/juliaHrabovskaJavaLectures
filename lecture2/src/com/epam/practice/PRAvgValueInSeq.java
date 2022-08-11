package com.epam.practice;

import java.util.Scanner;

public class PRAvgValueInSeq {

    /* Task 6 "Average"
The purpose of this exercise is to train you to use simple loops and conditional statements.
Estimated workload of this exercise is 20 minutes.
Description
Please, proceed to Average class and write a program that reads a sequence of integer values from standard input and finds the average value.
Details:
You must read sequence values until the next one is 0. Zero value means end of the input sequence.
The sequence is guaranteed to contain at least one value.
Average value is also an integer. Use integer operations.
*/
    public static int avg() {

        int total = 0;
        int counter = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (true) {
                total = total+number;
                counter++;
            }
        }
        while (number != 0);
        return total/counter;
    }

    public static void main(String[] args) {
        System.out.println(avg());
    }
}
