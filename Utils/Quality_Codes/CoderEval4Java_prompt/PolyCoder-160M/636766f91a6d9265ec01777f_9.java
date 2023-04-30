import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanUtils{
	/** 
	 * <p>Converts a Boolean to a boolean handling <code>null</code> by returning <code>false</code>.</p> <pre> BooleanUtils.toBoolean(Boolean.TRUE)  = true BooleanUtils.toBoolean(Boolean.FALSE) = false BooleanUtils.toBoolean(null)          = false </pre>
	 * @param bool  the boolean to convert
	 * @return <code>true</code> or <code>false</code>, <code>null</code> returns <code>false</code>
	 */
	
	public static boolean toBoolean(Boolean bool){
		 return!bool.booleanValue();
	}

	static final BitSet BYTE_CODE_TO_BYTE_CODE_MASK = new BitSet(8); //byte 2
	
	static final BitSet BYTE_CODE_TO_BYTES_MASK = new BitSet(4);	// byte 7   Byte 2


	
	static final int BYTE_CODE_TO_SIGNED_BYTE_MASK = new long[]{0,-1, -2, -3, -4, -5,-1, -5, -6,-1, -6,-1, -6};
}