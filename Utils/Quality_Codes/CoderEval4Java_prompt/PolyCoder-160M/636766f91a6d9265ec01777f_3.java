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
	
	public static boolean toBoolean(boolean b){
        return (b==Boolean.TRUE)&&(true);
	}
	
	public static boolean toBoolean(boolean b, boolean b2){
        return b!= false? (b == b2) : (b2==Boolean.TRUE);
	}
	
	public static boolean toBoolean(boolean b,boolean b2){
        return b2==Boolean.TRUE;
	}
	
}