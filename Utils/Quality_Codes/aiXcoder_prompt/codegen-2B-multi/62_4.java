import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		if (n < 0 || m <= 0) {
			return 0;
		}else if (n == 0 || m == 0){
			return 1;
		}else{
			int result = combinatorial(n-1, m);
			int power = Combinatorio.combination(n, m);
			return (result*power)/factorial(m);
		}
	}
	/**
	* Calculates factorial number of an integer.
	*/
	public static int factorial(int n){
}
}