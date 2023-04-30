import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID167{
	/**
	* 将数组转为 List
	*/
	public static <T> List<T> array2List(T[] array){
		List<T> list = new LinkedList<>();
		for ( T e: array){
			list.add(e);
		}
		return list;
	}
	
	public static void main(String []args){
		int[] a= {1,2,3,4,5,6,7,8,9};
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
}
}