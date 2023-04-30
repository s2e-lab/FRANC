import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ReflectionToStringBuilder{
	/** 
	 * <p> Gets the String built by this builder. </p>
	 * @return the built string
	 */
	
	public String toString(){
		 return toString0();
	}
	
	/**
	 * <p> Builds an array out of a list of Type T.</p>
	 * @param list list to be built
	 * @param <T> the list type
	 * @return the built array
	 */
	
	public <T> T[] buildList(List<T> list, Class<T>[] classes){
		T[] a;
			
		if(list==null || list.size()==0 ){
			return null;
		}
		
		//create a new list
}
}