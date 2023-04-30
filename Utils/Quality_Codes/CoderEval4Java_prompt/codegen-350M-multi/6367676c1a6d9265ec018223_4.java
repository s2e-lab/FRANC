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
		for (Iterator it=collection.iterator(); it.hasNext();){
			if (element==it.next()){ return true; } // if the element is not contained then do not return false;
		}
		return false;
	}
	

	public static void sortCollections(Collection c1, Collection c2){        
		Collections.sort (c1, c2);
	}
}


