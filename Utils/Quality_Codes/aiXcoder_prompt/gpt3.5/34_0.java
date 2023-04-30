import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			for(int i=0; i<serverIds.length; i++){
			for(int j=1; j<serverIds.length-i; j++){
				if(serverIds[j-1] > serverIds[j]){
					// Swap the server ids
					int temp = serverIds[j-1];
					serverIds[j-1] = serverIds[j];
					serverIds[j] = temp;
				}
			}
		}
	}

	/**
	* Main method to execute the program.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Read the number of servers
		System.out.print("Enter the number of servers: ");
		int n = sc.nextInt();

		int[] serverIds = new int[n];

		// Read the server ids
		for(int i=0; i<n; i++){
			System.out.print("Enter server id " + (i+1) + ": ");
			serverIds[i] = sc.nextInt();
		}

		// Sort the server ids
		sortServers(serverIds);

		// Calculate the sum of the server ids
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += serverIds[i];
		}

		// Check if the sum is divisible by 3
		if(sum % 3 == 0){
			System.out.println("The server ids can be divided into 3 equal groups.");
		}
		else{
			System.out.println("The server ids cannot be divided into 3 equal groups.");
		}
	}
}