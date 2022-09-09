package com.epam.test.stringsmethods;

/*String objects are IMMUTABLE (not changeable) => we are talking about the String object IN MEMORY!!!;
When Java creates a String object from a literal {String myString = "John";}, it actually puts that
String object in a String POOL; and every time another String literal is created JAVA will check that
String POOL to see If that value is already in there
* The String variables can be changed to point to whatever Strings we want */

public class BasicMethods {
    public static void main(String[] args) {
        // toLower toUpper
        String fry = "Philip J. Fry";

        String lowerCaseFry = fry.toLowerCase();
        String upperCaseFry = fry.toUpperCase();

        System.out.println(lowerCaseFry);
        System.out.println(upperCaseFry);

        // trim
        String str = "       Tabulated String         ";
        String tStr = str.trim();
        System.out.println(tStr);

        //
        String strReplace = "abracadabra";
        strReplace.replaceFirst("a", "o");
        String rStr = strReplace.replace('a', 'o');
        String rStr1 = strReplace.replaceAll("ab", "o");
        System.out.println(rStr);
        System.out.println(rStr1);

        // isEmpty
        System.out.println(rStr.isEmpty());
    }
}
