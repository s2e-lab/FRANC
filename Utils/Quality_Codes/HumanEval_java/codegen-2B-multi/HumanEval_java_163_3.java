import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GenerateIntegers {
    /**
     * * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.

     * For example:
     * generate_integers(2, 8) => [2, 4, 6, 8]
     * generate_integers(8, 2) => [2, 4, 6, 8]
     * generate_integers(10, 14) => []
     *
     * > generateIntegers(2, 10)
     * [2, 4, 6, 8]
     * > generateIntegers(10, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(132, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(17, 89)
     * []
     */
    public static List<Object> generateIntegers(int a, int b) {
        List<Object> integerList = new ArrayList<Object>();
        int d = a - b;
        while (d > -1) {
            integerList.add(d + "");
            d -= 2;
        }
        return integerList;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("Hello World!");
		List<Object> output = generateIntegers(2, 8);

}
}