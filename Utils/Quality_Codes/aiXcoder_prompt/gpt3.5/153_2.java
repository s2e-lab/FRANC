import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID153{
	/**
	* 计算 C2 = M xor t
	*/
	public static byte[] calculateC2(byte[] m, byte[] t){
			// Step 1: Check if the lengths of M and t are equal
		if(m.length != t.length){
			throw new IllegalArgumentException("Length of M and t must be equal");
		}
		
		// Step 2: Perform XOR operation
		byte[] c2 = new byte[m.length];
		for(int i=0; i<m.length; i++){
			c2[i] = (byte) (m[i] ^ t[i]);
		}
		
		// Step 3: Return the result
		return c2;
	}
	
	public static void main(String[] args){
		// Example usage
		byte[] m = {0x01, 0x02, 0x03};
		byte[] t = {0x10, 0x20, 0x30};
		byte[] c2 = calculateC2(m, t);
		System.out.println(Arrays.toString(c2));
	}
}