import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID87{
	/**
	* Returns true if the given object is an instance of the class or interface specified.
	*/
	public static boolean isInstanceOf(Object object, Class<?> type){
		return object!= null && type.isInstance( object );
	}
	public static void show(Object o){ System.out.println(o.toString()); }
	public static void main(String[] args){
		TreeMap<Number,String> tm = new TreeMap<>();
		tm.put(null, "Kirk"); tm.put(9, "Leonard"); tm.put("Klingon", "Mccoy"); tm.put(null, "Kirk");
		String res= "";
}
}