import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		 int random = new Random().nextInt();
		 return random + array[random];
	}

	// These need to be in order
	public static void main(String[] args) {

		int n = 20000;
		int n1 = 1000;
		int n2 = 1500;

		int s1 = random(20);    // Select the first few primes
		System.out.println(n1==s1 ||  ( (n1%n2)==n1 && random(n2)==s1 ) ); 
}
}