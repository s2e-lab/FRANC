import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		return clazz.cast(java.lang.Thread.currentThread().getContextClassLoader().loadClass(clazz.getName()).newInstance());
	}
	public enum Problem implements ProblemType{
		ID72_PROBLEM("[id="+
			       new ID72("2").count(new ID72("2")).toString()+"," + 
			       new ID72(1, "2").count(new ID72(1, "2")).toString() + "]"),
		
}
}