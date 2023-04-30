import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			for(String item:list){
				
				if(item.equals(index)){
					return item;
				}
			}
			return null;
	}

	public static void main(String[] args){
		
		
		
		/*A1: 
		*/
		    List<List> a1 = new ArrayList<List>();
		    a1.add(new ArrayList<Integer>());
		    List<List> list = a1;

}
}