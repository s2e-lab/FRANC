import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		 //string to be padded.
		StringBuffer s = new StringBuffer("");
		while (length-- > 0){
			s.append(padChar);
			s.append('0');
		}
		return s.toString();
	}

	/**
	* Reads the length of the next field in the file
	*
	* @param f	name of the file that contains the fields
	* @return	String containing field length
	* @throws IOException exceptions.
	*/
	public static String readFieldLength(String f){

}
}