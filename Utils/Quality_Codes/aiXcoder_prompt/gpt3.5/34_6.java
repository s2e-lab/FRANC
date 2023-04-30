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
	* Calculate the sum of digits of a given number
	*/
	public static int sumOfDigits(int num){
		int sum = 0;
		while(num > 0){
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception{

		// Read input from console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] serverIds = new int[n];
		for(int i=0; i<n; i++){
			serverIds[i] = Integer.parseInt(input[i]);
		}

		// Sort the server ids in ascending order
		sortServers(serverIds);

		// Calculate the sum of factorials of digits for each server id
		BigInteger totalSum = BigInteger.valueOf(0);
		for(int i=0; i<n; i++){
			int sumOfDigits = sumOfDigits(serverIds[i]);
			BigInteger factorial = BigInteger.valueOf(1);
			for(int j=1; j<=sumOfDigits; j++){
				factorial = factorial.multiply(BigInteger.valueOf(j));
			}
			totalSum = totalSum.add(factorial);
		}

		// Print the result
		System.out.println(totalSum);
	}
}