import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			return list.get(index);
	}
	
	/**
	* Returns the String value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, long index){
		String result = "";
		for(int i=0; i<list.size(); i++){
			result = result.concat(""+list.get(i)+",");
		}
		return result;
	}
}