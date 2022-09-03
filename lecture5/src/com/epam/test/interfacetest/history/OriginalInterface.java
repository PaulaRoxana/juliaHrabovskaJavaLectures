package com.epam.test.interfacetest.history;

public interface OriginalInterface {
    int MY_CONSTANT = 9;

    int doSomething();
    String doSomethingCompletelyDifferent();

    class MyClass { //inner/nested class
        //...
    }

    interface MyOtherInterface { //inner/nested interface
        //...
    }
}
