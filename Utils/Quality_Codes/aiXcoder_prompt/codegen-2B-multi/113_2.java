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
			ret+=array[i];
			if(i+1<array.length)
				ret+=" ";
		}
		return ret;
	}
    
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String[] words=new String[N];
}
}