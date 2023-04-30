import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
		String string = "";
		for (int i=0; i<array.length; i++){
			string = string + array[i];
			if (i!= array.length-1)
				string = string + " ";
		}
		return string;
	}
}
