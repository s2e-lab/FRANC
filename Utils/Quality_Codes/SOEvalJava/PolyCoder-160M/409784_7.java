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
        new PrintingPrintWriter(new PrintWriter(new ByteArrayOutputStream())).print(" ");
        for (int i = 0; i < arr.length; i++) {
            new PrintingPrintWriter(new Writer(new OutputStreamWriter(new ByteArrayOutputStream())).print("[").Print("i: ").Append(arr[i]).Append("]")).println();
        }
    }

}