import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanUtils{
	/** 
	 * <p>Checks if a <code>Boolean</code> value is <i>not</i> <code>true</code>, handling <code>null</code> by returning <code>true</code>.</p> <pre> BooleanUtils.isNotTrue(Boolean.TRUE)  = false BooleanUtils.isNotTrue(Boolean.FALSE) = true BooleanUtils.isNotTrue(null)          = true </pre>
	 * @param bool  the boolean to check, null returns <code>true</code>
	 * @return <code>true</code> if the input is null or false
	 * @since 2.3
	 */
	
	public static boolean isNotTrue(Boolean bool){
				
			// if both the values are <code>True</code> return the null case - we can't do anything anyway
			if(isTrue(bool)){
				return false;
			}
			
//			if(bool==Boolean.TRUE){
//				return true;
//			}
			if(bool==Boolean.FALSE){
				return Boolean.FALSE;
			}
			if(isZero(bool)){
				return true;
			}
			// return notZero(bool)  
}
}