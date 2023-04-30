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
        int v = 1, i = 0;
        Object[] o = new Object[arr.length+1];
        System.arraycopy(arr, 0, o, 0, arr.length);
}
}