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
		list.add("#");
	}
	/**
	* Takes in a string and returns whether it equals the specified value.
	*/
	public boolean isValue(String s, String val) {
		if(s.equals(val)){
			return true;
		}
		return false;
	}
	/**
	* Solves the problem
	*/
	public boolean solved(List<String> stringVals) {
}
}