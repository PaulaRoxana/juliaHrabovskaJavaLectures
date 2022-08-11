package com.epam.practice;

import java.util.Scanner;

/*Task 7 "Pizza Split"
The purpose of this exercise is to familiarize you with basic conditional and cyclic operations.
Estimated workload of this exercise is 20 minutes.
Description
Please, proceed to PizzaSplit class. The program must read two values from System.in:
-number of people;
-number of pieces per pizza.
It is guaranteed that these values are positive integers.
Then the program must print the minimum number of pizzas (not zero)
so that everyone has an equal number of slices and no slice is left.

Example
Input: 12 8
Output:3
*/

public class PRPizzaSplit {

    public static void main(String[] args) {

        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        Scanner scanner = new Scanner(System.in);
        int noOfPeople = scanner.nextInt();
        int noOfSlicesPerPizza = scanner.nextInt();
        int i = 1;
        int totalSlices;
        while (true) {
            totalSlices = noOfSlicesPerPizza * i;
            i++;
            if (totalSlices % noOfPeople == 0) {
                break;
            }

        }
        System.out.println(totalSlices/noOfSlicesPerPizza);


    }
}
