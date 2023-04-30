import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		try{
			list = (List<String>)list.clone();
			list.add(item);
		}catch(ClassCastException cce){
		}
	}

	/**
	* Adds an item to the list. Returns the item added.
	*/
	public String add(List<String> list, String item){
}
}