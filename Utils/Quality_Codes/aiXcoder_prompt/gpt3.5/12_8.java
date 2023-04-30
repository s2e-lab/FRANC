import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index < 0 || index >= list.size()){ // checking whether index is within the bounds of list
			return "Index out of bounds";
		}
		return list.get(index);
	}
	
	/**
	* Calculates the number of divisors of a given integer.
	*/
	public static int numOfDivisors(int num){
		int divisors = 1;
		int count = 0;
		while(num % 2 == 0){ // counting the number of times the number is divisible by 2
			count++;
			num /= 2;
		}
		divisors *= (count+1); // multiplying the number of divisors by the count of 2s
		for(int i=3; i<=Math.sqrt(num); i+=2){ // checking odd numbers for divisors
			count = 0;
			while(num % i == 0){ // counting the number of times the number is divisible by i
				count++;
				num /= i;
			}
			divisors *= (count+1); // multiplying the number of divisors by the count of i's
		}
		if(num > 2){ // if the remaining number is greater than 2 it is also a divisor
			divisors *= 2;
		}
		return divisors;
	}
	
	public static void main(String[] args){
		List<String> triangleNums = new ArrayList<String>(); // list to store triangle numbers
		int limit = 500; // highest number of divisors required
		int i = 1;
		int sum = 1;
		
		while(true){ // infinite loop until the first triangle number with over 500 divisors is found
			String str = Integer.toString(sum);
			triangleNums.add(str); // adding the triangle number to the list
			
			int divisors = numOfDivisors(sum); // counting the number of divisors
			if(divisors > limit){ // checking if the number of divisors is greater than 500
				System.out.println(sum);
				break;
			}
			
			i++;
			sum += i;
		}
	}
}