package com.epam;

import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Loops {
    public static void main(String[] args) {
    //           example1();
//              example2();
  //              example3();
               example4();
    }

    private static void example1() {
        int i = 10;
        while (i > 1) {
            System.out.println(i);
            i--;
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
    }

    private static void example2() {
        float i = 0.0f;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        int j = 0;
        while (j < 31) {
            if (j == 13) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }

    private static void example3() {
     //  int x = 10;
        Scanner scanner = new Scanner(System.in);
        String result;
        do {
            result = scanner.nextLine();
            System.out.println(result);
//            x++;
        } while (!result.equals("0"));
    }

    private static void example4() {
        int min = 5;
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }

        int max = 10;
        for (int i = 0, j = 5; i <= min && j <= max; i++, j++) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

        List<String> strings = asList("Hi", ",", "how", "are", "you", "?");
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
