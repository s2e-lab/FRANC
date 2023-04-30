import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			for(int i=0;i<serverIds.length-1;i++){
	        for(int j=0;j<serverIds.length-i-1;j++){
	            if(serverIds[j]>serverIds[j+1]){
	                int temp=serverIds[j];
	                serverIds[j]=serverIds[j+1];
	                serverIds[j+1]=temp;
	            }
	        }
	    }
	}
	
	/**
	* Calculate the median of the given array of integers.
	*/
	public static double findMedian(int[] arr){
	    int n=arr.length;
	    if(n%2==0){
	        return (double)(arr[n/2]+arr[n/2-1])/2;
	    }
	    return (double)arr[n/2];
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of servers: ");
		int n = scanner.nextInt();
		
		int[] serverIds = new int[n];
		
		System.out.print("Enter the server ids: ");
		for(int i=0; i<n; i++){
			serverIds[i] = scanner.nextInt();
		}
		
		sortServers(serverIds); //sort the server ids in ascending order
		
		double median = findMedian(serverIds); //find the median
		System.out.println("The median server id is " + median);
	}
}