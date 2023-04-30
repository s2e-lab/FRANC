import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index<0 || index>=list.size()){
				return "Index out of bounds!";
			}
			return list.get(index);
		}

	/**
	* Calculates the number of divisors for the specified number.
	*/
	public static int getDivisorsCount(int number){
		int count=0;
		for(int i=1;i<=Math.sqrt(number);i++){
			if(number%i==0){
				if(number/i==i){
					count++;
				}else{
					count+=2;
				}
			}
		}
		return count;
	}

	/**
	* Returns the first triangle number with the specified number of 
	* divisors or -1 if such number doesn't exist.
	*/
	public static int getTriangleNumber(int divisorsCount){
		int triangleNumber=1;
		int number=2;
		while(true){
			triangleNumber+=number;
			number++;
			if(getDivisorsCount(triangleNumber)>=divisorsCount){
				return triangleNumber;
			}
		}
	}

	public static void main(String[] args){
		System.out.println(getTriangleNumber(500));
	}
}