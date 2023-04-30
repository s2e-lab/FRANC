import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		return Long.parseLong(ByteHandler.ToHex32(Short.parseShort(Short.toString(a)+Short.toString(b))));
	}
	
	// Time Comlexity : O(1), because all inputs are small ints
	// Space Complexity: O(1) 
	// see C-code:
	//return (a*b)%MOD;
}
