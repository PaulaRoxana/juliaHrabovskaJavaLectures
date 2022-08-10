package com.epam;

import java.util.Scanner;

public class Lecture2Practice {

    public static void main(String[] args) {


        //     Scanner scanner1 = new Scanner(System.in);
        //     String name = scanner1.nextLine();
        //      System.out.println("Hello" + " " + name);

        //      Scanner scanner2 = new Scanner(System.in);
        //    int seconds = scanner2.nextInt();


        Scanner scannerB = new Scanner(System.in);
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
    }


}
