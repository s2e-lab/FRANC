import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index >= list.size()){
			return "Index is out of range for the given list.";
		}
		return list.get(index);
	}
	
	/**
	* Retrieves the nth triangular number.
	*/
	public static int getTriangularNumber(int n){
		return (n*(n+1))/2;
	}
	
	/**
	* Determines the number of divisors for the given number.
	*/
	public static int getNumOfDivisors(int num){
		int count = 0;
		for(int i=1; i<= Math.sqrt(num); i++){
			if(num % i == 0){
				if(num/i == i){
					count++;
				}else{
					count += 2;
				}
			}
		}
		return count;
	}
	
	/**
	* Solves the problem 12 of Project Euler.
	*/
	public static void solveProblem12(){
		int i = 1;
		while(true){
			int triangularNum = getTriangularNumber(i);
			int numOfDivisors = getNumOfDivisors(triangularNum);
			if(numOfDivisors > 500){
				System.out.println("The first triangular number to have over 500 divisors is: " + triangularNum);
				break;
			}
			i++;
		}
	}
	
	public static void main(String[] args){
		solveProblem12();
	}
}