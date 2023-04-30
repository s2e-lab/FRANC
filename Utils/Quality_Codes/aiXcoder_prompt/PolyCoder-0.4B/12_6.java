import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
		 System.out.println("Value:" + list.get(index));
		return list.get(index);
	}

	/*
	* Reads the value value_name into a String, and returns this Object.
	*/
	public String getValue(String s){

		return value(s);
	}

	public Object getAnotherObj(){
		return value("Another");
	}

	public String getValueStr(){
		String s = value("\nvalue");

		return s;
	}

}