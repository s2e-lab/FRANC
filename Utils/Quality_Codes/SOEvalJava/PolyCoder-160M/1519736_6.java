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
        int len = arr.length;
        int s = len + rnd.nextInt(len / 2);
        arr = arr.slice(0, s);
        System.arraycopy(arr, 0, arr, s, len);
    }
}