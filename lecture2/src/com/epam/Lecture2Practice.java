package com.epam;

import java.util.Scanner;

public class Lecture2Practice {

    public static void main(String[] args) {

/*Task 1 "Meet an Agent":
The purpose of this exercise is to familiarize you with simple conditional statements.
Estimated workload of this exercise is 20 minutes.
Description: Please, proceed to MeetAnAgent class and write a program that:
asks for an input number, if the input equals to the secret password number, prints "Hello, Agent",
otherwise, prints "Access denied".
Secret password is stored in final static int PASSWORD.

!!!EXAMPLES!!!
Input: 133976
Output: Hello, Agent
Input: 711
Output: Access denied*/

        //     Scanner scanner1 = new Scanner(System.in);
        //     String name = scanner1.nextLine();
        //      System.out.println("Hello" + " " + name);

        //      Scanner scanner2 = new Scanner(System.in);
        //    int seconds = scanner2.nextInt();

        System.out.println("BEGINNING=================================================================================================");
        /*
        int PASSWORD = 133976;
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();

        if (password == PASSWORD) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
*/
        System.out.println("END====END====END=========================================================================================");

/*Task 2 "Meet Strangers":
The purpose of this exercise is to train you in usage of simple cycles and conditional statements.
Estimated workload of this exercise is 20 minutes.
Description
Please, proceed to HelloStrangers class and write a program that:
asks for a number - amount of strangers to meet,
then reads stranger names line by line
and, finally, prints line by line "Hello, stranger name" for each stranger.
It is guaranteed that the input is not null. It is guaranteed that the input of strangers count is int number.

Consider special cases:
If strangers count is zero, then program must print "Oh, it looks like there is no one here".
If strangers count is negative, then program must print "Seriously? Why so negative?".

!!!EXAMPLES!!!
INPUT:
3
Athos
Porthos
Aramis
OUTPUT:
Hello, Athos
Hello, Porthos
Hello, Aramis

Input: 0
Output: Oh, it looks like there is no one here

Input:-3
Output: Seriously? Why so negative?*/

        System.out.println("BEGINNING=================================================================================================");
     /*   Scanner scannerB = new Scanner(System.in);
        int noOfPeople = scannerB.nextInt();

        if (noOfPeople == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (noOfPeople < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] groupOfPeople = new String[noOfPeople];
            for (int i = 0; i < groupOfPeople.length; i++) {
                Scanner scannerA = new Scanner(System.in);
                groupOfPeople[i] = scannerA.nextLine();
                System.out.println("Hello," + " " + groupOfPeople[i]);
            }
        }
      */
        System.out.println("END====END====END=========================================================================================");

/*Task 3 "Snail":
The purpose of this exercise is to train you in usage of simple integer operations.
Estimated workload of this exercise is 30 minutes.
Description
Consider a snail travels up a tree a feet each day. Then snail slides down b feet each night.
Height of the tree is h feet.
Please, proceed to Snail class and write a program that prints number of days for the snail to reach
the top of the tree.
Program reads a, b, h line by line. Input values are guaranteed to be positive integers.
If the snail cannot reach the top of the tree, print the message Impossible.

# a = traveled feet/day (+)
  b = slided down feet/night (-)
  h = tree height

!!!EXAMPLES!!!
Input: 4   2   14
Output: 6

Input: 4  3  10
Output: 7

Input: 4  4   10
Output: Impossible

Input: 4   4    1
Output: 1
*/
        System.out.println("BEGINNING=================================================================================================");
/*
        Scanner scannerABH = new Scanner(System.in);
        int[] inputs = new int[3];
        inputs[0] = scannerABH.nextInt();
        inputs[1] = scannerABH.nextInt();
        inputs[2] = scannerABH.nextInt();
        int leftToClimb = inputs[2] - inputs[0];
        int climbedIn24H = inputs[0] - inputs[1];
        if (inputs[1] >= inputs[0] && inputs[2] > inputs[0]) {
            System.out.println("Impossible");
        } else if (inputs[2] <= inputs[0]) {
            System.out.println(1);
        }else {
            System.out.println(leftToClimb/climbedIn24H+1);
        }

       */
        System.out.println("END====END====END=========================================================================================");

        /*Task 4 "Go Dutch":
The purpose of this exercise is to familiarize you with basic conditional and cyclic operations.
Estimated workload of this exercise is 20 minutes.


Description
Consider a company of friends visiting a restaurant. They decided to equally split the bill.

Friends decided to add 10 percent of the bill total amount as tips. Then they cover the total payment in equal parts.

Please, proceed to GoDutch class and write a program that reads a bill total amount and a number of friends, and then prints part to pay.

Consider some details:

Program must read data from System.in
Bill total amount cannot be negative. If input value is negative, the program stops, printing: Bill total amount cannot be negative
Number of friends cannot be negative or zero. If input value is, then the program stops, printing: Number of friends cannot be negative or zero
Bill total amount, number of friends and part to pay are integers

Example
Input:

1000
5
Output:

220*/


    }

}



