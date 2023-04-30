import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Collections{
	/** 
	 * Check whether the given Collection contains the given element instance. <p>Enforces the given instance to be present, rather than returning <code>true</code> for an equal element as well.
	 * @param collection the Collection to check
	 * @param element the element to look for
	 * @return <code>true</code> if found, <code>false</code> else
	 */
	
	public static boolean containsInstance(Collection collection,Object element){
		if(collection==null){return false;}
		Object[] elements = collection.toArray();//Collection elements[]
		if(elements.length==0){return false;}
		//Go through the array, searching for the given element
		for (int i=0;i<elements.length;i++) { 
			//Ensures that the elements[i] instancematches the element
			if(elements[i].equals(element)) { return true; }
		}
		return false;
	}
}