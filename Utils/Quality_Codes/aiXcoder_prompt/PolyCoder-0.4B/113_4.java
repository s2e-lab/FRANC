import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < array.length; i = i + 1) {
					if (i == array.length - 1) {
						builder.append(" ");
					} else {
						builder.append(array[i] +
							((array[i + 1] == " ")? "" : ",") +
							StringUtil.repeat(" ", Math.max(0, array[i + 1].length() - 1)));
					}
			}
}
}