import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
		String ret="";
		for(int i=0;i<array.length;i++){
			ret=ret+array[i]+" ";
		}
		if(ret.length()>1)
			return ret.substring(0,ret.length()-1);
		else
			return ret;
	}
	public static void main(String[] args)
	{
		String [] str=new String[]{"the","cat","sat","in","the","house"};
		String ret=getStringfromStringArray(str);

}
}