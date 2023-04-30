import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		return clazz.cast(Class.forName(clazz.getName()+"$Instance").newInstance());
	}

	// CUT begin
	public static final void main(String[] args) {
		System.out.println("ID72 (2 * 7 = 14) generated.");
	}
}
// CUT end
