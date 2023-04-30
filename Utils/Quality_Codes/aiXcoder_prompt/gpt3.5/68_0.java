import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID68{
	/**
	* Removes and returns last element in list, return null if empty.
	*/
	public static String removeLast(ArrayList<String> list){
			if(list.isEmpty()){
		  	return null;
		  }
	      int lastIndex = list.size()-1;
	      String lastElement = list.get(lastIndex);
	      list.remove(lastIndex);
	      return lastElement;
	}
}