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
String token = ""; //initialize the token string
while(scanner.hasNext()){ //loop through input until a terminator is encountered
    char currentChar = scanner.next().charAt(0); //get the current character from input
    boolean isTerminator = false; //initialize the boolean variable to false
    for(char terminator: terminators){ //loop through the array of terminating characters
        if(currentChar == terminator){ //if the current character is a terminator
            isTerminator = true; //set the boolean variable to true
            break; //break out of the loop
        }
    }
    if(!isTerminator){ //if the current character is not a terminator
        token += currentChar; //add it to the token string
    } else { //if the current character is a terminator
        break; //break out of the loop
    }
}
return token; //return the token string
	}
}