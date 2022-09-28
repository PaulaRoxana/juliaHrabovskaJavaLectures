package com.epam.test.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        createLinkedList();
        addFirstLast();
        peekFirstLast();
        pollFirstLast();
    }

    private static void createLinkedList() {
        String str1 = "Hello World!";
        String str2 = "Test";
        String str3 = "LinkedList";

        List<String> testLinkedList = new LinkedList<>();
        testLinkedList.add(str1);
        testLinkedList.add(str3);
        testLinkedList.add(1, str2);

        System.out.println(testLinkedList);
    }

    static class Car {

        String model;

        public Car(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }

    private static void addFirstLast() {
        LinkedList<Car> cars1 = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars1.add(ferrari);
        cars1.add(bugatti);
        cars1.add(lambo);
        System.out.println("Cars1=>without addFirstLast: " + cars1);

        cars1.addFirst(ford);
        cars1.addLast(fiat);
        System.out.println("Cars1=>addFirstLast: " + cars1);
    }

    private static void peekFirstLast() {
        LinkedList<Car> cars2 = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");

        cars2.add(ferrari);
        cars2.add(bugatti);
        cars2.add(lambo);
        System.out.println("Cars2=>peekFirst" + cars2.peekFirst());
        System.out.println("Cars2=>peekLast" + cars2.peekLast());
    }

    private static void pollFirstLast() {
        LinkedList<Car> cars3 = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Verona");
        Car lambo = new Car("Lamborghini Diablo");

        cars3.add(ferrari);
        cars3.add(bugatti);
        cars3.add(lambo);
        System.out.println("Cars3=>pollFirst" + cars3.pollFirst());
        System.out.println("Cars3=>pollLast" + cars3.pollLast());

        System.out.println("What's left on the list?");
        System.out.println("What's left within Cars3: " + cars3);
    }
}
