import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		int carry = 0, sum = 0;
		while(sum <= b.intValue()){
			if(sum + a.intValue() <= b.intValue() || carry == 1){
				sum += a.intValue();
				carry = 1;
			} else{
				sum += b.intValue();
				carry = 0;
			}
		}

		return (short)(carry == 1? -sum : sum);
	}

	/**
	* @param args
	*/
	public static void main(String[] args)
	{
}
}