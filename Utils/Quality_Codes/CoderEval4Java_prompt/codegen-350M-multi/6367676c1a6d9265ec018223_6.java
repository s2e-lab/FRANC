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
		String elementString = element.toString();
		for(Iterator myList=collection.iterator();myList.hasNext();){
			Object a = myList.next();
			if(myList.hasNext() && (elementString.equals(((NODE.NodeElement)a).getValue())
					||(elementString==null? a instanceof ObjectLeaf : a.equals(elementString)))){
				return true;
			}
		}
		
		return false;
	}
	
	
}