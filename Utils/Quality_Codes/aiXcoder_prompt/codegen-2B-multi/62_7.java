import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		return (factorial(n)/factorial(m)*factorial(n-m));
	}


	// A helper function (recursive of course ;-) )
	public static int factorial(int number) {
		return(number == 0)? 1 : combination(number - 1, number);
	}


	// The actual function
	public static int combination(int n, int k) {
		int result = 1;
}
}