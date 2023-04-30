import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			for (int i = 0; i < serverIds.length - 1; i++) {
            for (int j = 0; j < serverIds.length - i - 1; j++) {
                if (serverIds[j] > serverIds[j + 1]) {
                    int temp = serverIds[j];
                    serverIds[j] = serverIds[j + 1];
                    serverIds[j + 1] = temp;
                }
            }
        }
	}

	/**
	* Determine the minimum number of steps required to reach target server from current server.
	*/
	public static int findStepsToTarget(int[] serverIds, int currentServer, int targetServer){
		// If the target server is before the current server, swap them so that we always
		// start from the lower server id.
		if(targetServer < currentServer) {
			int temp = currentServer;
			currentServer = targetServer;
			targetServer = temp;
		}

		// Determine the index of the current and target server ids in the server id array
		int currentIndex = Arrays.binarySearch(serverIds, currentServer);
		int targetIndex = Arrays.binarySearch(serverIds, targetServer);

		// Return the absolute difference between the indices which represents the 
		// minimum number of steps required to reach the target server from the current server.
		return Math.abs(targetIndex - currentIndex);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Read the number of servers and the number of requests
		int numServers = sc.nextInt();
		int numRequests = sc.nextInt();

		// Read the ids of the servers
		int[] serverIds = new int[numServers];
		for(int i=0; i<numServers; i++){
			serverIds[i] = sc.nextInt();
		}

		// Sort the server ids in ascending order
		sortServers(serverIds);

		// Process the requests
		for(int i=0; i<numRequests; i++){
			int currentServer = sc.nextInt();
			int targetServer = sc.nextInt();
			int stepsToTarget = findStepsToTarget(serverIds, currentServer, targetServer);
			System.out.println(stepsToTarget);
		}
	}
}