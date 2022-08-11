package com.epam.practice;

public class CBMakeBricks {
    public static void main(String[] args) {

        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(7, 1, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if(goal > (big*5 + small) ) { //Not enough total
            return false;
        } else {
            return goal % 5 <= small; //Check if there are enough small bricks
        }
    }


}
