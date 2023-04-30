import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			return Math.abs(a - b) < epsilon;
}

/**
* Returns the hypotenuse of a right triangle given the lengths of the two legs.
*/
public static double hypotenuse(double a, double b){
	return Math.sqrt(a*a + b*b);
}

/**
* Returns the area of a circle with a given radius.
*/
public static double circleArea(double radius){
	return Math.PI * radius * radius;
}

/**
* Returns the smallest integer greater than or equal to a given double.
*/
public static int ceiling(double x){
	return (int) Math.ceil(x);
}

/**
* Returns the largest integer less than or equal to a given double.
*/
public static int floor(double x){
	return (int) Math.floor(x);
}

/**
 * Sort an array of integers using QuickSort algorithm
 */
public static void quickSort(int[] arr, int left, int right) {
    if (left < right) {
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }
}

private static int partition(int[] arr, int left, int right) {
    int pivot = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[right];
    arr[right] = temp;
    return i + 1;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split("\\s+");
    int[] arr = new int[s.length];

    for (int i = 0; i < s.length; i++) {
        arr[i] = Integer.parseInt(s[i]);
    }

    quickSort(arr, 0, arr.length - 1);

    for (int i : arr) {
        System.out.print(i + " ");
    }
}
}