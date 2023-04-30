import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_409784{
    /**
     * Write a function to print a Java array.
     * 
     * Example:
     * int[] arr = {1, 2, 3};
     * printArray(arr);
     * 
     * output: [1, 2, 3]
     */
    public static void printArray(int[] arr) {
        System.out.println(">>> Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }

}