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
			if (bool!=null) {
				if (bool!=Boolean.TRUE && bool!=Boolean.FALSE) {
					return false;
				}
				return true;
			}else
				return false;
	}

	/**
	 * @see java.lang.Boolean#compare(java.lang.Object, java.lang.Object)
	 */
	public  static public int compare(Object a1, Object a2) {
		//Java-style Comparison
}
}