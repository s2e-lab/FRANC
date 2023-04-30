import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
		 char ch; int i = str.length();
		 while( true ){
			 for(int i=0;i<i;i++){
				 if(str.charAt(i)!='\0'){
					if(searchStr==null || str.indexOf(searchStr,i)!=i)return i;
				}
			 }
			 return -1;
		 }
	}
	
	
	public static void main(String args[]){
		
		String s = "abcde";
		List<String> l= new ArrayList<String>();
		
}
}