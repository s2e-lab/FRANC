import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		Short res = (short)(a * b);
		return res;
	}

	private static BigInteger multiply(BigInteger a, BigInteger b){
		BigInteger res = a.multiply(b);
		return res;
	}

    public static void main(String[] args) {
		System.out.println("===ID135===");
        Solution s = new Solution();
    }
}

