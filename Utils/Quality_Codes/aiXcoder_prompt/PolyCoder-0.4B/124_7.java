import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
			for(int i = 0; i < list.size(); i++){
				if(i!= list.size()-1){
					list.add("");
				}
				else{
					break;
				}
			}
			list.set(i, item);
	}
	
	/**
	* Removes the item from the list.
	*/
	public String remove(List<String> list, String item){
}
}