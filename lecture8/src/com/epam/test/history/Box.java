package com.epam.test.history;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        stringBox.set("Old string");
        System.out.println(stringBox.get());
        stringBox.set("New string");

        System.out.println(stringBox.get());

        stringBox.set("12345");
    //    stringBox.set(12345);
// added byPaula
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.45);
        System.out.println(doubleBox.get());

    }
}
