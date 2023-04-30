import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim the elements of the given String array, calling <code>String.trim()</code> on each of them.
	 * @param array the original String array
	 * @return the resulting array (of the same size) with trimmed elements
	 */
	
	public static String[] trimArrayElements(String[] array){
			if(array==null)return new String[]{};
		
			String[] result = new String[array.length];
			for(int x=0; x<array.length; x++){
				result[x] = array[x].trim();
			}
			return result;
		}
		
		// trim the given String array
		// (don't use it, it might cause problems with the String.split approach which is not implemented yet)
		@Override
		public String[] trim(CharSequence charSeq){
		
}
}