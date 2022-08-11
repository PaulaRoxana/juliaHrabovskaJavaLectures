package com.epam;

import java.util.Scanner;

public class PaulaSnail {

    public static void main(String[] args) {
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

    }





}

