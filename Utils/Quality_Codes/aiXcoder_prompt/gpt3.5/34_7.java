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
				if(serverIds[j] > serverIds[j+1]){
					int temp = serverIds[j];
					serverIds[j] = serverIds[j+1];
					serverIds[j+1] = temp;
				}
			}
		}
	}
	
	/**
	* Check if there exists any two adjacent servers which are having the same id. 
	* Return true if there exists any such servers otherwise return false.
	*/
	public static boolean checkAdjacentServers(int[] serverIds){
		for(int i=0; i<serverIds.length-1; i++){
			if(serverIds[i]==serverIds[i+1]){
				return true;
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] serverIds = new int[n];
		
		// Reading server ids from input
		for(int i=0; i<n; i++){
			serverIds[i] = sc.nextInt();
		}
		
		// Sorting the server ids in ascending order
		sortServers(serverIds);
		
		//Checking if there exists any adjacent servers which are having the same id
		boolean exists = checkAdjacentServers(serverIds);
		if(exists){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}