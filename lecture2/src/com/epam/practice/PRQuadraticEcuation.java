package com.epam.practice;

import java.util.Scanner;

public class PRQuadraticEcuation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double D;
            if (a != 0) {
                D = b * b - 4 * a * c;
                if (D > 0) {
                    double x1, x2;
                    x1 = (-b - Math.sqrt(D)) / (2 * a);
                    x2 = (-b + Math.sqrt(D)) / (2 * a);
                    System.out.println(x1 + " " + x2);
                } else if (D == 0) {
                    double x;
                    x = -b / (2 * a);
                    System.out.println(x);
                } else {
                    System.out.println("no roots");
                }
            }
        }
    }


