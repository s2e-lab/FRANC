import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Returns  {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @param str the String to check
	 * @param prefix the prefix to look for
	 * @return {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @see java.lang.String#startsWith
	 */
	
	public static boolean startsWithIgnoreCase(String str,String prefix){
		return str.regionMatches(true,0,prefix,0,prefix.length());

}

    public static boolean startsWithIgnoreCase(String arr, String arr1, String... arr2) {
        arr1 = arr1.toLowerCase();
        for (String temp : arr2) {
            temp = temp.toLowerCase();
            if (arr1.startsWith(temp)) return true;
        }
        return false;
    }
}