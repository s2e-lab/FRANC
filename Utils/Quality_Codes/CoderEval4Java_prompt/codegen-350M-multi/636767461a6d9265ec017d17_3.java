import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DOTEventDrivenImporter{
	/** 
	 * Unescape a string DOT identifier.
	 * @param input the input
	 * @return the unescaped output
	 */
	
	private String unescapeId(String input){
		return input.replace("/", "\\/");
	}
	/**
	 * Convert a long into a short value.
	 * @param input the input
	 * @return the converted value
	 */
	
	private short toShort(long input){
		return (short)(input & 0xFF);
	}
	/**
	 * Convert a string to a big integer.
	 * @param input the input
	 * @return the converted value
	 */
	
	private int toInt(String input){
}
}