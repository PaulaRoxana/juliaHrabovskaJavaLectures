package com.epam.test.set;

import java.util.Set;
import java.util.TreeSet;

public class PTrial {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(6);
        mySet.add(9);
        mySet.add(8);
        mySet.add(7);
        System.out.println(mySet);
         createSets();
    }

    public static void createSets(){
        Set<String> mySet1 = new TreeSet<>();
        mySet1.add("abc");
        mySet1.add("bbc");
        mySet1.add("cbc");
        mySet1.add("aaa");
        mySet1.add("bbb");
        System.out.println(mySet1);

    }

}
