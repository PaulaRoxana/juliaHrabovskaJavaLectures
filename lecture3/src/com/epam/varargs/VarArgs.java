package com.epam.varargs;

/*Variable Arguments (Varargs)
• Varargs are variable length arguments: a feature that appeared in JDK5.
Varargs allow to create methods with an arbitrary number of arguments.
- ex1: void print(String... words)
- ex2: int sum(Integer... numbers)
Rules:
1. Vararg argument ends with … .
2. Vararg can only be specified as an argument to some method.
3. Each Vararg in the method body is an array.
4. The vararg argument must be the last one in the method's argument list.
5. It is not necessary to create an array when calling a method that takes variable
length arguments. It is enough to simply write a list elements separated by commas*/

public class VarArgs {
    class Calculator1 {
        int sum(int a, int b) {
            return a+b;
        }

        int sum(int a, int b, int c) {
            return a+b+c;
        }

        int sum(int a, int b, int c, int d) {
            return a+b+c+d;
        }

        int sum(int a, int b, int c, int d, int e) {
            return a+b+c+d+e;
        }
    }

    static class Calculator2 { //!!array iteration
        int sum(int[] numbers) {
            int sumOfNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
              sumOfNumbers+=numbers[i];
            }
            return sumOfNumbers;
        }
    }

    static class Calculator { //!!varargs iteration
        int sum(int... numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();

        int[] arguments = new int[7];
        arguments[0] = 1;
        arguments[1] = 10;
        arguments[2] = 123;
        arguments[3] = 234;
        arguments[4] = 6234;
        arguments[5] = 12;
        arguments[6] = 8;

        int sum2 = calculator2.sum(arguments);
        System.out.println(sum2);


        // varargs
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 10, 123, 234, 6234, 12, 8);
        System.out.println(sum);



    }


}

