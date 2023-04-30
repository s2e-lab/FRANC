import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			Arrays.sort(serverIds);
	}

	/**
	* Find the server id that has the maximum number of requests.
	* If there are multiple servers with the same number of maximum requests, return the smallest server id.
	*/
	public static int findMaxRequests(int[] serverRequests){
		int maxReq = 0;
		int maxReqId = 0;
		for (int i = 0; i< serverRequests.length; i++){
			if (serverRequests[i] > maxReq){
				maxReq = serverRequests[i];
				maxReqId = i+1;
			}
		}
		return maxReqId;
	}
	
	/**
	* Calculate the average requests per server.
	*/
	public static double calculateAverage(int[] serverRequests){
		double sum = 0;
		for (int i = 0; i< serverRequests.length; i++){
			sum += serverRequests[i];
		}
		return sum/serverRequests.length;
	}
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] serverIds = new int[n];
		int[] serverRequests = new int[n];
		
		for (int i = 0; i< n; i++){
			serverIds[i] = scanner.nextInt();
			serverRequests[i] = scanner.nextInt();
		}
		
		sortServers(serverIds);
		
		int maxReqId = findMaxRequests(serverRequests);
		double avgRequests = calculateAverage(serverRequests);
		
		System.out.println(maxReqId);
		System.out.printf("%.2f\n", avgRequests);
	}
}