import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index < list.size()){
			return list.get(index);
		}
		return null; // returns null if index is out of range
	}
	
	public static void main(String[] args){
		String input = "hello world"; // sample input string
		List<String> list = Arrays.asList(input.split(" ")); // splitting the input string and storing in List
		
		// retrieving values from List using getValue method and printing
		System.out.println(getValue(list, 0)); // prints "hello"
		System.out.println(getValue(list, 1)); // prints "world"
		System.out.println(getValue(list, 2)); // prints null
	}
}