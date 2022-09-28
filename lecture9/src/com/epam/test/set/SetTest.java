package com.epam.test.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        hashCodeAndEqualsExample();
        treeSetExample();
        hashSetExample();
    }

    private static void hashCodeAndEqualsExample() {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                //    return false;
                if (this == o) return true;
                if (!(o instanceof Person)) return false;
                Person pearson = (Person) o;
                return age == pearson.age && Objects.equals(name, pearson.name);
            }

            @Override
            public int hashCode() {
                //   return 1;
                return Objects.hash(name, age);
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        Set<Person> personsHashSet = new HashSet<>();
        personsHashSet.add(new Person("Ivan", 25));
        personsHashSet.add(new Person("Olha", 35));

        System.out.println("HashSet example=>personsHashSet: " + personsHashSet);
        personsHashSet.add(new Person("Olha", 35));
        System.out.println(personsHashSet);
    }

    private static void treeSetExample() {
        TreeSet<String> animalTreeSet = new TreeSet<>();
        animalTreeSet.add("Antilope");
        animalTreeSet.add("Fox");
        animalTreeSet.add("Goat");
        animalTreeSet.add("Dog");
        animalTreeSet.add("Elephant");
        animalTreeSet.add("Bear");
        animalTreeSet.add("Hippo");
        animalTreeSet.add("Cat");

        System.out.println("TreeSet example=>animalTreeSet: " + animalTreeSet);
        System.out.println(animalTreeSet.subSet("Dog", "Hippo"));
        System.out.println(animalTreeSet.tailSet("Dog"));
        System.out.println(animalTreeSet.headSet("Dog"));
        System.out.println(animalTreeSet.first());
        System.out.println(animalTreeSet.last());
    }

    private static void hashSetExample() {
        Set<String> animaHashSet = new HashSet<>();
        animaHashSet.add("Antilope");
        animaHashSet.add("Fox");
        animaHashSet.add("Goat");
        animaHashSet.add("Dog");
        animaHashSet.add("Elephant");
        animaHashSet.add("Bear");
        animaHashSet.add("Hippo");
        animaHashSet.add("Cat");

        System.out.println("HashSet example=>animalHashSet: " + animaHashSet);
    }
}
