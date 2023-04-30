import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		BigInteger a1 = new BigInteger(Integer.toString(a));
		BigInteger b1 = new BigInteger(Integer.toString(b));
		BigInteger m1 = a1.multiply(b1);
		return Short.parseShort(m1.toString());
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		//let's test our method
		Short a = new Short(-3);
		Short b = new Short(12);
}
}