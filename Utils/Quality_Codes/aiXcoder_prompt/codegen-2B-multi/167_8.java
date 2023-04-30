import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID167{
	/**
	* 将数组转为 List
	*/
	public static <T> List<T> array2List(T[] array){
		List<T> list = new ArrayList<T>();
		for(T t:array){
			list.add(t);
		}

		return list;
	}

}