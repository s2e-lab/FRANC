import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		/*
		Calculates combinatorial(n,m). The formula for calculating the amount of combinations
		is: C (n,m) = R (m,n) * R (n-1,m)
		where R (n,m) is the number of all combinations of n elements taken m elements at a time.

		Time Complexity: O(mn) (dynamic programming) -> C(n,m) = R(m,n) * R(n-1,m)
		Space Complexity: O(mn) (dynamic programming)
		