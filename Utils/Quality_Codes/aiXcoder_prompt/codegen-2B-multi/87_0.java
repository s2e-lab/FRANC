import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID87{
	/**
	* Returns true if the given object is an instance of the class or interface specified.
	*/
	public static boolean isInstanceOf(Object object, Class<?> type){
		return Object.class.isInstance(object) && type.isInstance(object);
	}
	
	public static <T> List<T> interleave(Iterable<T> arg) {
		List<T> ret = new ArrayList<T>();
		iterate(arg,ret);
		return ret;
	}
	@SuppressWarnings("rawtypes")
	public static <T> List<T> iterate(Iterable<T> iterable, List<T> result) {
}
}