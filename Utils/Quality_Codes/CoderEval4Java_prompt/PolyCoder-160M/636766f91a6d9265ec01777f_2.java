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
		 		
			if (bool == null || bool == Boolean.FALSE) {
				return null;
			}   
			return Boolean.valueOf(true).toBoolean(bool);
	}
	
}
		

	
@Deprecated

	public enum EnumType {

//		Enum(0, 0, "");
			
}