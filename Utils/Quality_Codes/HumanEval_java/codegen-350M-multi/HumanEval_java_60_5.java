import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SumToN {
    /**
     * sum_to_n is a function that sums numbers from 1 to n.
     * >>> sum_to_n(30)
     * 465
     * >>> sum_to_n(100)
     * 5050
     * >>> sum_to_n(5)
     * 15
     * >>> sum_to_n(10)
     * 55
     * >>> sum_to_n(1)
     * 1
     *
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
	int sum=1;
	while(n>=sum) {
	    sum++;
	}
	return sum;
    }
}

public class SumToN {
    public static void main(String args[]) throws Exception {
	System.out.println( new SumToN().sumToN(10)
		           + new SumToN().sumToN(5));
	System.out.println( new SumToN().sumToN(1)
		           + new SumToN().sumToN(6));
}
}