import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if (c >= '0' && c <= '9') {
	        return c - '0';
	    } else if (c >= 'A' && c <= 'Z') {
	        return c - 'A' + 10;
	    } else if (c >= 'a' && c <= 'z') {
	        return c - 'a' + 10;
	    } else {
	        throw new IllegalArgumentException("Invalid digit: " + c);
	    }
	}
	
	/**
	 * Formats the given byte size in a human-readable form, with units such as "MB", "GB", etc.
	 * @param bytes the size, in bytes
	 * @return a string representation of the size, with appropriate units
	 */
	public static String formatByteSize(long bytes) {
	    double val = bytes;
	    String unit = "B";
	    if (val > 1024) { val /= 1024; unit = "KB"; }
	    if (val > 1024) { val /= 1024; unit = "MB"; }
	    if (val > 1024) { val /= 1024; unit = "GB"; }
	    if (val > 1024) { val /= 1024; unit = "TB"; }
	    if (val > 1024) { val /= 1024; unit = "PB"; }
	    return String.format("%.2f %s", val, unit);
	}
	
	/**
	 * Parses a long from the given string, which may have optional suffixes such as "MB", "GB", etc.
	 * @param str the string to parse
	 * @return the parsed long value
	 */
	public static long parseByteSize(String str) {
	    str = str.trim().toUpperCase();
}
}