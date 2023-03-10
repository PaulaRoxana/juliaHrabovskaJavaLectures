package com.epam.finaltest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/*<final> keyword can be applied to classes, methods, variables
(including method arguments).
• For a class, this means that the class will not be able to have subclasses,
i.e. inheritance is prohibited. This is useful when creating immutable objects.
• For a method, final means that it cannot be overridden in subclasses. This
is useful when we want to ensure that the original implementation cannot be overridden.
• For variables of a primitive type, this means that once assigned a value cannot be changed.
• For reference variables, this means that once an object has been
assigned, the reference to that object cannot be changed.
It is important! The link cannot be changed, but the state of the object can be changed
* */

/*Effectively final
• With java 8, the new concept “effectively final” appeared. It only
applies to variables (including method arguments).
• The main idea is that despite the explicit absence of the final keyword,
the value of the variable does not change after initialization. In other
words, the word final can be substituted for such a variable without a
compilation error.
• effectively final variables can be used inside local classes (Local Inner
Classes), anonymous classes (Anonymous Inner Classes), streams (lambda expressions)
(Stream API)*/

public final class FinalClass {
    public final long MAX_AGE = 90;
    public final List<String> elements = new ArrayList<>();

    private FinalClass() {
//        MAX_AGE = 99;
//        elements.add("a");
//        elements.add("b");
//        elements = new LinkedList<>();
    }

    public void effectivelyFinalExample() {
        // a and b are effectively final, the values are set once and are not changed:
        int a = 1;
        int b;
        if (a == 2) {
            b = 3;
        } else {
            b = 4;
        }
        // с isn't effectively final, the value will be changed
        int c = 10;
        c++;

        Stream.of(1, 2).forEach(s -> System.out.println(s + a + MAX_AGE)); // no error
     //  Stream.of(1, 2).forEach(s -> System.out.println(s + c)); // compilation error
    }


    public final void test() {
        System.out.println("Try to override me :p");
    }

}
