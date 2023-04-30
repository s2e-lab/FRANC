import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		return array[(int) (Math.random() * array.length)];
	}

	public static BigInteger factorial(int n){
		BigInteger ret = BigInteger.ONE;
		for(int i=3; i<=n; i+=2){
			ret = ret.multiply(BigInteger.valueOf(i));
		}
		assert (n<=4);
		return (n&1)!=0? ret.divide(BigInteger.valueOf((long) Math.pow(2, n))) : ret;

}
}