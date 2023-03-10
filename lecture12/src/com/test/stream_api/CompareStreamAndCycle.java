package com.test.stream_api;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareStreamAndCycle {
    public static void main(String[] args) {
        Stream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .forEachOrdered(System.out::println);


      Set<Integer> mySet =  Stream.of(50, 60, 70, 80, 90, 100, 110, 120)
              .filter(x -> x < 90)
              .map(x -> x + 10)
              .limit(4)
              .collect(Collectors.toSet());
              System.out.println(mySet);

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) {
                continue;
            }
            x += 10;
            count++;
            if (count > 3) {
                break;
            }
            System.out.print(x);
        }
    }
}
