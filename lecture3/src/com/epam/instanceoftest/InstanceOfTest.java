package com.epam.instanceoftest;

/*Cast. Expansion and contraction
• Class contains all the methods of the class from which it was inherited,
then an object of this class can be stored in a variable of any of its parent
types.
• If, as a result of the assignment, we move up the inheritance chain (to the
Object type), then this is an extension of the type (it is also an upward
conversion or upcasting), and if down, to the type of an object, then this is
a narrowing of the type (it is also a downward conversion). or
downcasting).
• Moving up the inheritance chain is called extension because it leads to a
more general type. But at the same time, the ability to call methods that
were added to the class during inheritance is lost.
*/

/*instanceof
• The instanceof operator is needed to check whether the object referred to by the variable X
was created based on any class Y*/

/*
*********************  hashCode()   ***************************
• Methods hashCode() and equals() don’t call each other.
• The contract of methods equals() and hashCode() mentions that
both these methods should be overridden if one of them is
overridden.
• Method hashCode() returns a hash-code value for an object, which is
used to efficiently store and retrieve values in collection classes that use
hashing algorithms, such asHashMap.
The official JavaDoc Contract:
• Within the same program, the result of hashCode() must not change.
This means that you should not include variables that change in figuring
out the hash code.
• IF x.equals(y) == true THEN x.hashCode() == y.hashCode() must be true.
This means hashCode() can use a subset of the variables that equals()
uses.
• IF x.equals(y) == false THEN x.hashCode() and y.hashCode() can be same
or different. This means hashCode() results do not need to be unique
when called on unequal objects.
================================ hashCode() ============================================

* *********************************  equals()  **********************************************
• The Contract (set of rules):
1. It’s reflexive—For any non-null reference value x, x.equals(x) should return true.
2. It’s symmetric — For any non-null reference values x and y, x.equals(y) should return true
* if and only if y.equals(x) returns true.
3. It’s transitive — For any non-null reference values x, y, and z, if x.equals(y) returns
* true and y.equals(z) returns true, then x.equals(z) should return true.
4. It’s consistent—For any non-null reference values x and y,multiple invocations
* of x.equals(y) consistently return true or consistently return false,
* provided that no information used in equals() comparisons on the objects is modified.
5. For any non-null reference value x, x.equals(null)should return false*/

/*RECAP of Object class methods:
********************************* Non-final methods ***************************
*  hashCode(); and equals();
* toString();
* clone();
* finalize();
===============================  Non-final methods  =============================
* ******************************** Final methods  ***************************
* wait();
* getClass();
* notify();
* notifyAll();
==============================  Final methods  =============================
* */

public class InstanceOfTest {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();

        System.out.println("hippo instanceof Hippo " + (hippo instanceof Hippo));
        System.out.println("hippo instanceof HeavyAnimal " + (hippo instanceof HeavyAnimal));
        System.out.println("hippo instanceof Elephant " + (hippo instanceof Elephant));
        System.out.println("hippo instanceof Object " + (hippo instanceof Object));
        Hippo nullHippo = null;//we do not know what type of instance it is
        //new key word is not used=> no instance created
        System.out.println("nullHippo instanceof Object " + (nullHippo instanceof Object));//false

    }
}
