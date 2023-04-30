import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		 this.list.add(item);
	}

	/**
	* Inserts a new item to the end of the list.
	*/
	public void insert(String item){
		 list.add(item);
	}

	/**
	* Removes the item currently at the head of the list.
	*/
	public void remove(String item){
		if(this.list.size()>0){
			this.list.remove(this.list.size()-1);
		}
	}

}