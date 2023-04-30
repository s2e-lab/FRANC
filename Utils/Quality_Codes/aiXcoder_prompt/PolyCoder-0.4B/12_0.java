import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			String tmp = "";
			for (int i=0;i<index;i++){
				tmp += " "+list.get(index-i)+" ";
			}
			return tmp;
	}
	
	
	
	public static boolean contains(List<String> list, String key){
		String value = getValue(list, key);
		if(value.indexOf(key)>=0){
			return true;
		}else{
				return false;
		}
		
}




	
	
}