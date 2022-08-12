package com.epam.practice;

import java.util.Scanner;

/*Task 8 "Quadratic Equation"
The purpose of this exercise is to train you to design programs that need decision trees.
Estimated workload of this exercise is 30 minutes.
Description
Please, proceed to the QuadraticEquation class and implement a program to solve quadratic equations.
For the given quadratic equation coefficients (ax² + bx + c = 0), return one or two roots of the equation if there is any in the set of real numbers.
Input value is given via System.in. Output value must be printed to System.out.
Output format is:
"x₁ x₂" (two roots in any order separated by space) if there are two roots,
"x" (just the value of the root) if there is the only root,
"no roots" (just a string value "no roots") if there is no root.
The a parameter is guaranteed to be not zero.
Hint: Quadratic formula reference

Examples
Input: 1 -2 1
Output: 1
Input: 2 5 -3
Output: -3 0.5
Input: 2 2 2
Output: no roots
*/

public class QE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant;

        if (a != 0) {
            discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println(x1 + " " + x2);
            }
            if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            }
            if (discriminant < 0) {
                System.out.println("no roots");
            }
        }
    }
}
