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
			if(bool == null){
				return true;		
//				System.out.println("boolean toBoolean is null");	
//				return false;			
			}
//			if(bool!= Boolean.TRUE){
//				System.out.println("boolean toBoolean is equal to true, returning " + bool);	
//				return false;				
			}
//			
//			return bool==Boolean.FALSE;	
//	}
}