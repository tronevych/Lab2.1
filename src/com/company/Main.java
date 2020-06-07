/*
 *
 * Classname: Main
 *
 * 06 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 1
 *
 * Create a class from the attached document according
 * to the order in your group. The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        // First Rectangle - Rectangle1

        Rectangle rectangle1 = new Rectangle(6,
                3,
                Math.PI / 6);

        // Example of using toString() method

        System.out.println(rectangle1);

        // Example of using hash() method

        System.out.println("Hash Code rectangle1 = " + rectangle1.hashCode());

        // Second rectangle - rectangle2

        Rectangle rectangle2 = new Rectangle(5,
                4,
                Math.PI / 6);

        // Comparison of rectangles equals() method

        System.out.println("Rectangle1 is equals to Rectangle2 - " +
                rectangle1.equals(rectangle2));

    }
}
