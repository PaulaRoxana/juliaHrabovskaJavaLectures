package com.epam.casting;

/*Java Packages
• A package in Java is used to group related classes. This is like a folder in a file
directory. Packages are used to avoid name conflicts, and to write a better
maintainable code. Packages are divided into two categories:
• User-defined Packages (your own packages)
• Built-in Packages (packages from the Java API*/

/* Built-in Packages
• The Java API is a library of pre-written classes, that are free to use, included in the
Java Development Environment.
• The library contains components for managing input, database programming, and much more.
• The library is divided into packages and classes. It is possible either import a single class (along
with its methods and attributes), or a whole package that contain all the classes that belong
to the specified package.
• To use a class or a package from the library, you need to use the import keyword
// Import a single class: import package.name.Class;
// Import the whole package: import package.name.*;
// Import the whole static class: import static package.name.Class.*;
// Import a single static method: import static package.name.Class.method;
*/

/*•CLASSES are the backbone of Java programming fundamentals.
• A class is essentially a template for an object. It defines how the object will look and have properties.
• Each object is an instance of a certain class
• Methods are the functionality of a class; what the objects of this class can do*/

/*Constructors
• A constructor in Java is a special method that is used to initialize
objects. The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes;
• Constructor name must match the class name, and it cannot have a return type (like void).
• Also note that the constructor is called when the object is created.
• All classes have constructors by default: if you do not create a class
constructor yourself, Java creates one for you. However, then you are
not able to set initial values for object attributes
*/

public class ShoppingItem {
    public void description() {
        System.out.println("Shopping Item");
    }
}
