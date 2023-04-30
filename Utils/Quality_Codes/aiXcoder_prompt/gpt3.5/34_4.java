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
	    * Calculate the sum of digits of a given number.
	    */
	    public static int sumOfDigits(int num){
	        int sum = 0;
	        while(num > 0){
	            int digit = num%10;
	            sum += factorial(digit);
	            num /= 10;
	        }
	        return sum;
	    }
	    
	    /**
	    * Calculate the factorial of a given number.
	    */
	    public static int factorial(int num){
	        if(num == 0 || num == 1){
	            return 1;
	        }
	        return num*factorial(num-1);
	    }
	    
	    public static void main(String args[]){
	        int[] serverIds = {472, 147, 827, 662, 541, 231, 330};
	        sortServers(serverIds);
	        int totalSum = 0;
	        for(int i=0; i<serverIds.length; i++){
	            int sum = sumOfDigits(serverIds[i]);
	            if(sum == serverIds[i]){
	                System.out.println(serverIds[i]);
	                totalSum += sum;
	            }
	        }
	        System.out.println("Total sum of numbers equal to the sum of the factorials of their digits: "+totalSum);
	    }
	}