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
        Arrays.shuffle(arr, arr.length, new Random(0));
    }

    //-------------------------------------------------------------------------

    /**
     * Creates a new instance of this class.
     */
    public Ids1519736() {
        this(0, 0);
    }

    /**
     * Creates a new instance of this class.
     */
}