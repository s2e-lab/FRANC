import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			Arrays.sort(serverIds); // Using the in-built sort function in Java's Arrays class
	}
	
	/**
	* Check if the sequence of server ids is valid based on the given criteria.
	*/
	public static boolean isValidSequence(int[] serverIds){
		int sum = 0;
		for(int i=0; i<serverIds.length; i++){
			sum += factorial(serverIds[i]); // Finding the factorial of each server id and adding to the sum
		}
		return (sum == serverIds[serverIds.length-1]); // Checking if the sum of factorials equals the last server id
	}
	
	/**
	* Recursive function to calculate the factorial of a number.
	*/
	public static int factorial(int n){
		if(n <= 1){
			return 1;
		}
		return n * factorial(n-1);
	}
	
	/**
	* Main function to read input and print the output.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Number of test cases
		
		for(int i=0; i<n; i++){
			int k = sc.nextInt(); // Number of servers
			int[] serverIds = new int[k];
			for(int j=0; j<k; j++){
				serverIds[j] = sc.nextInt();
			}

			sortServers(serverIds);
			if(isValidSequence(serverIds)){
				System.out.println("Valid Sequence");
			}
			else{
				System.out.println("Invalid Sequence");
			}
		}
	}
}