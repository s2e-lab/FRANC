import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			for(int i=0; i<serverIds.length-1; i++){
			for(int j=0; j<serverIds.length-i-1; j++){
				if(serverIds[j]>serverIds[j+1]){
					int temp = serverIds[j];
					serverIds[j] = serverIds[j+1];
					serverIds[j+1] = temp;
				}
			}
		}
	}

	/**
	* Check if the array contains all consecutive numbers.
	*/
	public static boolean isConsecutive(int[] serverIds){
		for(int i=1; i<serverIds.length; i++){
			if(serverIds[i-1]+1!=serverIds[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of servers: ");
		int n = sc.nextInt();
		int[] serverIds = new int[n];
		System.out.println("Enter the server IDs:");
		for(int i=0; i<n; i++){
			serverIds[i] = sc.nextInt();
		}

		sortServers(serverIds);

		if(isConsecutive(serverIds)){
			System.out.println("The servers are arranged in consecutive order.");
		}else{
			System.out.println("The servers are not arranged in consecutive order.");
		}

		sc.close();
	}
}