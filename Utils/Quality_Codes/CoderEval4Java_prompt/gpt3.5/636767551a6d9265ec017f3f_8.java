import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtil{
	/** 
	 * Swaps the two elements at the specified indices in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @param i the index of the first element
	 * @param j the index of the second element
	 */
	
	public static final <V>void swap(V[] arr,int i,int j){
			V temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Reverses the order of elements in the given array.
     * @param < V > the type of elements in the array
     * @param arr the array
     */
    public static final <V>void reverse(V[] arr){
        int length = arr.length;
        for(int i=0;i<length/2;i++){
            swap(arr,i,length-i-1);
        }
    }

    /**
     * Prints the elements of the given array to the console.
     * @param < V> the type of elements in the array
     * @param arr the array
     */
    public static final <V>void printArray(V[] arr){
        for(V v:arr){
            System.out.print(v + " ");
        }
        System.out.println();
    }

    /**
     * Returns an array containing the elements of the given List in the same order.
     * @param < V> the type of elements in the list
     * @param list the list
     * @return an array containing the elements of the list
     */
    public static final <V> V[] convertListToArray(List<V> list){
        return (V[]) list.toArray();
    }

    /**
     * Returns a list containing the elements of the given array in the same order.
     * @param < V> the type of elements in the array
     * @param arr the array
     * @return a list containing the elements of the array
     */
    public static final <V> List<V> convertArrayToList(V[] arr){
        return Arrays.asList(arr);
    }
}