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
String input = scanner.next();
StringBuilder tokenBuilder = new StringBuilder();

for (int i = 0; i < input.length(); i++) {
    char c = input.charAt(i);
    boolean isTerminator = false;
    
    for (char terminator : terminators) {
        if (c == terminator) {
            isTerminator = true;
            break;
        }
    }
    
    if (isTerminator) {
        break;
    } else {
        tokenBuilder.append(c);
    }
}
return tokenBuilder.toString();
	}
	
	/**
	 * Parses a double value from the input stream
	 * @return the double value parsed
	 */
	private double parseDouble(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
	
	/**
	 * Parses a BigInteger value from the input stream
	 * @return the BigInteger value parsed
	 */
	private BigInteger parseBigInteger(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextBigInteger();
	}
	
	/**
	 * Parses an int value from the input stream
	 * @return the int value parsed
	 */
	private int parseInt(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}