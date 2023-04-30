import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
		 try{
			 String value= getValueInternal(list, index);
			 return value;
		 }catch(Exception ex){
			 Logger.getLogger(ID12.class.getName()).log(Level.SEVERE, null, ex);
	       }
		return null;
	}
	
	public static String getValue(int index){
}
}