import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		if(a==null || b==null){
			throw new IllegalArgumentException("Cannot multiply two null values");
		}
		return (Short)Math.multiplyExact(a,b);
	}
	public static void main(String[] args) throws java.lang.Exception{
		//String[] input = { "23","43"};
		String[] input = {"",""};
		input = FileOps.readFile("ID135.in",input);
		ID135 ob = new ID135();
		int total_len = 0;
}
}