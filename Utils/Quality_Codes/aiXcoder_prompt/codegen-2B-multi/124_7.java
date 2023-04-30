import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		int i=0;
		char[] arr=item.toCharArray();
		for(char c : arr){
			if(c=='('){
				int count=0;
				while(arr[i]!='('){
					count++;
					i++;
				}
				list.add(String.valueOf(count));
			}
			else{
				break;
			}
		}
		list.add(item);
	}

	/**
	* Returns the size of a file.
	*/
}