import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		myData.put(key, Long.valueOf(myData.get(key) + value));
	}
	public void increment(String key){
		valueAccumulation(key, 1);
	}
	
	public void addRow(String rowK,Long rowV,Long header_rowV){
		myData.put(rowK, myData.get (rowK) + rowV - header_rowV);
	}
	
	public  void print(){
		
		System.out.println("-------------------------------");
}
}