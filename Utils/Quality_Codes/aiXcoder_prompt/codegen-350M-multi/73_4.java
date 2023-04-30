import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		for (int i = 0; i < end-start; i++) {
			list.remove(i);
		}
		System.out.println(list);
	}
	public static void main(String args[]){
		ID73 p=new ID73();
		List<Person<Integer>> list=new ArrayList<>();
		p.delete(list,1,7);
		System.out.println(list);
	}
}
