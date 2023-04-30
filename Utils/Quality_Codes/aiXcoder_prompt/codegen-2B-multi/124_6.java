import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		list.add(item);
	}
	
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, int item){
		list.add( Integer.toString(item) );
	}
	
	/**
	* Adds an item to the end of the list.
	*/
	public void add(List<String> list, String item){
		list.add( item );
	}
	
	/**
	* Adds an item to the end of the list.
	*/
}