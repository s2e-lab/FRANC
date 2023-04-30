import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			if(index >= 0 && index < list.size()){
			return list.get(index);
		}
		else{
			return "Index out of range";
		}
	}


	public static void main(String[] args){
		// Create a list of strings
		List<String> stringList = new ArrayList<>();

		// Add some elements to the list
		stringList.add("Hi");
		stringList.add("there");
		stringList.add("I");
		stringList.add("am");
		stringList.add("Java");

		// Retrieve values at different indices of the list
		System.out.println("Value at index 1: " + getValue(stringList, 1));
		System.out.println("Value at index 3: " + getValue(stringList, 3));
		System.out.println("Value at index 5: " + getValue(stringList, 5));
		System.out.println("Value at index -1: " + getValue(stringList, -1));
	}
}