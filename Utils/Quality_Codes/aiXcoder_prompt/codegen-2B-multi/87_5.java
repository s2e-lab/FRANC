import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID87{
	/**
	* Returns true if the given object is an instance of the class or interface specified.
	*/
	public static boolean isInstanceOf(Object object, Class<?> type){
		return type.isAssignableFrom(object.getClass());
	}
}
