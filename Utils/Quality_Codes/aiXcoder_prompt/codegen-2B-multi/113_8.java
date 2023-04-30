import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
		String string="";
		for(int i=0;i<array.length;i++)
			string+=(array[i]);
		string=string.trim();
		return string;
	}


	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int length=Integer.parseInt(br.readLine());
		String[] array=new String[length];
		
}
}