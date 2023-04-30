import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
		 if(list==null){
			 return null;
		 }
		if(index<0 || index >= list.size()){
			 return null;
		 }
		Iterator<String> itr=list.iterator();
		if(index==0){
			 String t;
			 if(itr.hasNext()){
				 t=itr.next();
			 }else{
				 t="";
			 }
			 return t;
		 }
		String data = "";
		int i = index-1;
}
}