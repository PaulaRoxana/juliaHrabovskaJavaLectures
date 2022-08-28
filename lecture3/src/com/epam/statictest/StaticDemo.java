package com.epam.statictest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.epam.statictest.StaticTest.stat_var;
import static com.epam.statictest.StaticTest.testStatic;

/*static
• The static modifier in Java is directly related to a class (not instance).
• Static is a modifier applied to a field, block, method, or inner class. This modifier
indicates the binding of the subject to the current class.
• When denoting a class-level variable, we indicate that this value refers to a class.
• Static methods differ from regular methods in that they are also bound to a class, not an object.
An important property of a static method is that it can only access static variables/methods*/

public class StaticDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");

        Collections.sort(list);

        // static variable
        stat_var = stat_var + 2;
        stat_var = stat_var + 1;
        System.out.println(stat_var); // 4

        // not static variable
        String not_stat_var1 = new StaticTest().q1 + "qwert";
        String not_stat_var2 = new StaticTest().q1 + "1";
        System.out.println(not_stat_var1);// testqwert
        System.out.println(not_stat_var2);// test1

        // static method
        StaticTest.testStatic();
        testStatic();

        // not static method
        StaticTest staticTest = new StaticTest();
        staticTest.testNotStatic();
//        testNotStatic();
    }
}
