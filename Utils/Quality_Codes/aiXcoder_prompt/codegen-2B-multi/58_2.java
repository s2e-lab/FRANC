import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		byte[] answer = new byte[4];
		
		for(int i = 0; i < 4; i++){
			answer[i] = (byte)(0xff & value);
		}
		return answer;
	}
	
	public static char getHexDigit(int value){
		return (char)(0xf & value);
	}

    public static boolean isBinaryRepresentation(String input){
        if(input == null || input.length() < 2){
            return false;
        }

}
}