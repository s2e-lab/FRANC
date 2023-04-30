import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParameterParser{
	/** 
	 * Parses out a token until any of the given terminators is encountered.
	 * @param terminators the array of terminating characters. Any of these characters when encountered signify the end of the token
	 * @return the token
	 */
	
	private String parseToken(final char[] terminators){
			Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char c;
		while(input.hasNext()){
			c = input.next().charAt(0);
			boolean foundTerminator = false;
			for(char terminator : terminators){
				if(terminator == c){
					foundTerminator = true;
					break;
				}
			}
			if(foundTerminator){
				break;
			}
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * Parses out an integer parameter.
	 * @return the integer parameter
	 */
	public int parseInt(){
		return Integer.parseInt(parseToken(new char[]{' ', '\n', '\t'}));
	}

	/**
	 * Parses out a double parameter.
	 * @return the double parameter
	 */
	public double parseDouble(){
		return Double.parseDouble(parseToken(new char[]{' ', '\n', '\t'}));
	}

	/**
	 * Parses out a BigInteger parameter.
	 * @return the BigInteger parameter
	 */
	public BigInteger parseBigInteger(){
		return new BigInteger(parseToken(new char[]{' ', '\n', '\t'}));
	}

	/**
	 * Parses out a String parameter.
	 * @return the String parameter
	 */
	public String parseString(){
		return parseToken(new char[]{'\n', '\r'});
	}
}
