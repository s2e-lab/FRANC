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
		for (Iterator i=collection.iterator();i.hasNext();){
			Object myitem =i.next();
			if (element.equals(myitem)){
				return true;
			}
		}
		return false;	
	}
	
	
	public static int binarySearch(Collection collection,Object value){
		int low = 0,mid = 0;
}
}