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
        PrintWriter writer = new PrintWriter(System.out);
        int current = 0;
        for(int i : arr){
            if(i == current)
                current ++;
            writer.println(i);
        }
    }
    public static void main(String args[]){

}
}