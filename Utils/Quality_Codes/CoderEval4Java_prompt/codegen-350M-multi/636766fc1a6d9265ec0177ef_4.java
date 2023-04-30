import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ReflectionToStringBuilder{
	/** 
	 * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists (arrays and collections). Note that  {@link Arrays#sort(Object[])} will throw an {@link NullPointerException}if an array element is <code>null</code>.
	 * @param array The array to check
	 * @return The given array or a new array without null.
	 */
	
	static String[] toNoNullStringArray(Object[] array){
		Vector<String> result = new Vector<String>();

		for(int i = 0; i < array.length; i++){
			if (array[i]!= null)
				result.add(array[i].toString());
		}

		return result.toArray(new String[0]);
	}

	static {
		/* System.arraycopy doesn't seem to be defined for primitive arrays (or Arrays
		 * and Collections...) */
}
}