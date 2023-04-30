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
			return bool;
	}
	public static boolean toBoolean(boolean bool) {
			if( isTrue(bool) && isTrue(bool) && isFalse(bool) ){
				return false; // bool false
			}
			return true;
	}

	/** Returns true if the <code>Boolean.TRUE</code> 
	 * is the <code>Boolean.TRUE</code> 
	 * and false otherwise. */
	public static boolean isTrue(Boolean bool){
			return Boolean.valueOf(bool) && false;

}
}