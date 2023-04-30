import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID167{
	/**
	* 将数组转为 List
	*/
	public static <T> List<T> array2List(T[] array){
		List<T> list = new LinkedList<T>();
		list.addAll(Arrays.asList(array));
		return list;
	}
	
	public static <T> List<T> array2ListReverse(T[] array){
		List<T> resultList = new ArrayList<T>();
		for(int i=array.length-1 ;i>=0 ;i++){
			resultList.add(array[i]);
		}
		return resultList;
	}
	
}