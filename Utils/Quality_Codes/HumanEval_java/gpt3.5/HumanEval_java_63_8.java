import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Fibfib {
    /**
     * The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
     * fibfib(0) == 0
     * fibfib(1) == 0
     * fibfib(2) == 1
     * fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
     * Please write a function to efficiently compute the n-th element of the fibfib number sequence.
     * >>> fibfib(1)
     * 0
     * >>> fibfib(5)
     * 4
     * >>> fibfib(8)
     * 24
     *
     * > fibfib(2)
     * 1
     * > fibfib(1)
     * 0
     * > fibfib(5)
     * 4
     * > fibfib(8)
     * 24
     * > fibfib(10)
     * 81
     * > fibfib(12)
     * 274
     * > fibfib(14)
     * 927
     */
    public static int fibfib(int n) {
	if (n == 0 || n == 1) //base cases
       return 0;
    if (n == 2)
       return 1;
    
    int a = 0, b = 0, c = 1, d = 1, e = 1, f = 2; //initialize variables
    
    for (int i = 3; i <= n; i++) {
        a = b;
        b = c;
        c = d;
        d = e;
        e = f;
        f = a + b + c + d + e; //calculate next fibfib number
    }
    
    return f; //return the nth fibfib number
} 

public static void main(String[] args) {
    System.out.println(fibfib(1)); //0
    System.out.println(fibfib(5)); //4
    System.out.println(fibfib(8)); //24
}   
}