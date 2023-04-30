import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // key found at index i
            }
        }
        return -1; // key not found in array
    }
    
    /**
    * Sort the given array using bubble sort algorithm. Worst case running time is O(n^2).
    */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    /**
    * Find the largest pandigital product formed by multiplying an integer with (1,2,...,n) where n>1.
    * A pandigital number contains all the digits from 1 to 9 exactly once.
    */
    public static int largestPandigitalProduct() {
        int largest = 0;
        // iterate through all possible integers to multiply
        for (int i = 1; i < 10000; i++) {
            String concatenated = "";
            int n = 1;
            // generate concatenated product string
            while (concatenated.length() < 9) {
                concatenated += String.valueOf(i * n);
                n++;
            }
            // check if concatenated product string is pandigital and update largest
            if (concatenated.length() == 9) {
                int[] digits = new int[10];
                boolean pandigital = true;
                for (int j = 0; j < 9; j++) {
                    int digit = Integer.parseInt(String.valueOf(concatenated.charAt(j)));
                    if (digit == 0 || digits[digit] > 0) {
                        pandigital = false;
                        break;
                    }
                    digits[digit]++;
                }
                if (pandigital) {
                    int product = Integer.parseInt(concatenated);
                    if (product > largest) {
                        largest = product;
                    }
                }
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        // test linear search
}
}