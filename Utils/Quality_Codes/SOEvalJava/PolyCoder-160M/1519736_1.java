import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_1519736{
    /**
     * Write a function to shuffle randomly a given array.
     * 
     * Example:
     * int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     * shuffle(arr);
     * 
     * output: [4, 2, 3, 1, 5, 6, 7, 8, 9]
     */
    public static void shuffle(int[] arr) {
        if (arr.length < 10) {
            System.out.println("Warning: shuffle of length " + arr.length + " to " + 10);
        }
        boolean[] shuffle = new boolean[arr.length];
        int i;
}
}