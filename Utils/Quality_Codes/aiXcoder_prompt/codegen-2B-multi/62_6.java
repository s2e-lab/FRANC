import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		return factorial(n)/(factorial(m)*factorial(n - m));
    }

	public static void main(String[] args) throws java.lang.Exception{
		//let's do the homework
        int n, m, f=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
}
}