package com.epam.casting;

class Shopping {
    public static void main(String[] args) {
        Book book111 = new Book();
        book111.description();//Book
        ShoppingItem shoppingItem = book111;
        //  ShoppingItem shoppingItem1 = new Book(); // Implicit casting
        shoppingItem.description();/* Implicit casting; making use of a Book method overriding a ShoppingItem method */

        Printable printable = book111; //
        /* Implicit casting; making use of a Book method defining the implementation of a Printable method */
        printable.print();

        Printable printable1 = new Book();
        ((Book) printable1).description();
        /* Explicit casting: making use of a Book method overriding a ShoppingItem method, to be further applied
        * on an object of type Printable */


             printable1.print();//method from Printable Interface
             ((Book) printable1).description();//method from Book class

        // ----------------------------------------------------
        //      Object object = book111;
        //     Object object1 = shoppingItem;

  //      ShoppingItem item = new ShoppingItem();
   //     Printable printable6 = (Printable) item;
   //     printable6.print();



        Printable printable9 = new Book();
        ((Book) printable9).description();

        Chair chair = new Chair();
       Printable printable7 = (Printable) chair;
       printable7.print();



//        Book book = new Book();
//        Chair chair = book;

//        Book item = new Book();
//        Book book7 = (Book) item;
//        Chair chair = new Chair();
//        Chair chair = item;
    }
}

