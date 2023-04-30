import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; i++)
			{
				if (((array[i]) == null)) {
					sb.append(array[i]);
				} else {
					sb.append(array[i]);
					sb.append(" "); //$NON-NLS-1$
					sb.append(array[i]);
				}
			}
			return sb.toString();
	}
}