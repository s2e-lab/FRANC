import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		double diff = a-b;
		if (Math.abs(diff) < epsilon) return true;
		else return false;
	}
    void swap(int array[],int i, int j){
        int temp = array[i];
            array[i] = array[j];
        array[j] = temp;
        }
    public void sort(int array[],int start, int end){
}
}