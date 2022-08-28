package com.epam.test.phones;
/* An object has attributes/state/fields/properties and behaviour/methods.
As an example of object you can imagine an independent electrical appliance in your kitchen.
The kettle boils water, the stove heats up, the blender whips, the meat grinder makes minced meat.
Inside each device is a bunch of things: motors, controllers, buttons, springs, fuses
- but you don't think about them. You push buttons on the panel of each fixture and
it does what is expected of it. And thanks to the combination of these devices, you have dinner.
-A class is a description of an object that has not yet been created, like a general template,
consisting of fields, methods and a constructor.
-An object is an instance of a class created on the basis of this description.
*/

/*OOP PRINCIPLES:
-ABSTRACTION
-ENCAPSULATION
-INHERITANCE:
For example, a smartphone uses a cellular network for communication (has the properties of a cell phone),
is cordless and portable (has the properties of a wireless telephone) and can receive and
make calls (has the properties of a phone).
In this case, we can talk about the inheritance of object properties.
-POLYMORPHISM:
 */

/*Overriding
Modifier access – yes, if we expand access (package -> protected -> public )
Return type – yes, if we do Downcasting (Object -> Number -> Integer)
Method name – no
Parameters’ type and number – no, in this case we have overloading
Paramaters’ names – yes
Change throw section – yes, we can change order, we can remove at all throws section,
we can add new exeptions if they are sub-classes of exeptions in method declaration
or if they are Runtime exceptions
*/

public abstract class AbstractPhone {
    private int year; //instance field

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(String outputNumber) throws InterruptedException;

    public abstract void ring(String inputNumber); //abstract method (just declared, not defined)
}
