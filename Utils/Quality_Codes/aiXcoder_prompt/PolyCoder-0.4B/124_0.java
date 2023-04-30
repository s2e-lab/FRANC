import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
			set(list,item+'');
	}



	public List<String> get(String list){
		if(null==(list=list.trim()) || list.isEmpty()){
			return null;
		}
		return new LinkedList<String>(get(list.toLowerCase()));
	}


	public List<String> get(String[] items){
		if(null==(items=items.trim()) || items.isEmpty()){
			return null;
		}
}
}