/**
 * Java program to use Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Vector instance.
        Vector<Long> myVector = new Vector<>();

        // Add.
        myVector.add(6L);
        myVector.add(2000000L);
        myVector.add(6000000L);
        myVector.add(29876345660L);
        myVector.add(675786788897L);
        myVector.add(2000000L);
        myVector.add(7885L);
        myVector.add(4556L);

        // Display.
        System.out.println(myVector); // Output: [6, 2000000, 6000000, 29876345660, 675786788897, 2000000, 7885, 4556]

        // Remove.
        myVector.remove(5);

        // Display.
        System.out.println(myVector); // Output: [6, 2000000, 6000000, 29876345660, 675786788897, 7885, 4556]

        // Add to index 5.
        myVector.insertElementAt(876543L, 5);

        // Display.
        System.out.println(myVector); // Output: [6, 2000000, 6000000, 29876345660, 675786788897, 876543, 7885, 4556]

    }
}