import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			return list.get(index);
}

/**
* Returns the number of divisors of the given number.
*/
public static int getDivisorsCount(int num){
    int count = 0;
    for(int i=1; i<=Math.sqrt(num); i++){
        if(num % i == 0){
            count += 2;
        }
    }
    // If the number is a perfect square, only count sqrt(num) once
    if((int)Math.sqrt(num) * (int)Math.sqrt(num) == num){
        count--;
    }
    return count;
}

/**
* Returns the triangle number with more than the specified number of divisors.
*/
public static int getTriangleNumberWithDivisors(int numDivisors){
    int n = 1;
    int triangleNumber = 1;
    while(getDivisorsCount(triangleNumber) <= numDivisors){
        n++;
        triangleNumber += n;
    }
    return triangleNumber;
}

public static void main(String[] args){
    int numDivisors = 500;
    System.out.println(getTriangleNumberWithDivisors(numDivisors));
}
}