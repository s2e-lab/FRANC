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
			Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(scanner.hasNext()){
			char c = scanner.next().charAt(0);
			boolean foundTerminator = false;
			for(char terminator : terminators){
				if(c == terminator){
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
	 * Parses out a token until a whitespace or new line is encountered. 
	 * @return the token
	 */
	public String parseToken(){
		return parseToken(new char[]{' ', '\n'});
	}

	/**
	 * Parses out a signed integer
	 * @return the integer
	 * @throws NumberFormatException if the token cannot be parsed as an integer
	 */
	public int parseInt() throws NumberFormatException{
		return Integer.parseInt(parseToken(new char[]{' ', '\n'}));
	}

	/**
	 * Parses out a signed long integer
	 * @return the integer
	 * @throws NumberFormatException if the token cannot be parsed as a long integer
	 */
	public long parseLong() throws NumberFormatException{
		return Long.parseLong(parseToken(new char[]{' ', '\n'}));
	}

	/**
	 * Parses out a double precision floating point number
	 * @return the double-precision floating point number
	 * @throws NumberFormatException if the token cannot be parsed as a double precision floating point number
	 */
	public double parseDouble() throws NumberFormatException{
		return Double.parseDouble(parseToken(new char[]{' ', '\n'}));
	}

	/**
	 * Parses out a big integer
	 * @return the big integer
	 * @throws NumberFormatException if the token cannot be parsed as a big integer
	 */
	public BigInteger parseBigInteger() throws NumberFormatException{
		return new BigInteger(parseToken(new char[]{' ', '\n'}));
	}

	/**
	 * Parses out a boolean 
	 * @return the boolean
	 * @throws IllegalArgumentException if the token cannot be parsed as a boolean
	 */
	public boolean parseBoolean() throws IllegalArgumentException{
		String token = parseToken(new char[]{' ', '\n'});
		if(token.equalsIgnoreCase("true")){
			return true;
		}
		else if(token.equalsIgnoreCase("false")){
			return false;
		}
		else{
			throw new IllegalArgumentException("Token " + token + " cannot be parsed as boolean.");
		}
	}

}