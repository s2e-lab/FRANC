import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		BigInteger biga = new BigInteger(a.toString());
		BigInteger bigb = new BigInteger(b.toString());
		BigInteger res = biga.multiply(bigb);
		Short ans = res.shortValue();
		return ans;
	}

	public static void main(String[] args) throws IOException{
		int tests = Integer.parseInt(args[0]);

}
}