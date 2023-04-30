import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID167{
	/**
	* 将数组转为 List
	*/
	public static <T> List<T> array2List(T[] array){
		ArrayList<T> list=new ArrayList<T>();
		if(array==null){
			return list;
		}
		for(int i=0;i<array.length;i++){
			list.add(array[i]);
		}
		return list;
	}
	
    public static void main(String[] args){
 
        int[] input = {1,2,4,1};
 
        System.out.println(array2List(input));
    }
}