import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		String tostring="";
		if(object!=null)
			tostring=(String)object;
		else
			return null;
		
		return tostring;
	}

	public static String printList(ArrayList<Integer> list){
		String str="";
		for (int i = 0; i < list.size(); i++) {
			str+= list.get(i);
			str+=" ";
		}
		return str;
	}
	
}