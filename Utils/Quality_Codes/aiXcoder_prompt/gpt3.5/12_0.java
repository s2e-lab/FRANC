import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			String value = "";
        if (index >= 0 && index < list.size()) {
            value = list.get(index); // retrieve value by index
        }
        return value;
}
/**
* Calculates the number of divisors of the given number.
*/
public static int divisors(BigInteger n) {
    int count = 0;
    BigInteger sqrt = n.sqrt(); // get the square root of n
    for (BigInteger i = BigInteger.ONE; i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE)) {
        if (n.mod(i) == BigInteger.ZERO) {
            // if i divides n, then add 2 (i and n/i) to the count
            count += 2;
            if (i.equals(sqrt)) {
                count--; // if i equals sqrt, reduce count by 1
            }
        }
    }
    return count;
}

public static void main(String[] args) {
    int triangleNum = 0;
    int i = 1;
    while (true) {
        triangleNum += i; // calculate triangle number
        int divisors = divisors(BigInteger.valueOf(triangleNum)); // get number of divisors
        if (divisors > 500) { // check if count of divisors is greater than 500
            break; // if yes, exit loop
        }
        i++; // increment i
    }
    System.out.println(triangleNum); // print the answer
}
}