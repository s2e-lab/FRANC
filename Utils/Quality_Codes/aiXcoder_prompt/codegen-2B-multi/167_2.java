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
		for (T element : array) {
			list.add(element);
		}
		return list;
	}

	/**
	 * 打印数组
	 */
	public static void printArrad(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static int lastIntersection() {
}
}