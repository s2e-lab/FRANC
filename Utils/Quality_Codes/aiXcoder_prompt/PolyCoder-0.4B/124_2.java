import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
			if(!list.contains(item)){
					list.add(item);
			}
	}


	public void append(List<String> list, String item, int number){
			if(list.contains(item)){
					list.add(number, item);
			}
	}

	public void add(List<String> list, String item){
		append(list, item);
	}

	public void remove(List<String> list, String item){
		insert(list, item);

}
}