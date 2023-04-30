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
		for (Iterator i=collection.iterator(); i.hasNext();){
			Object elementI=((Object[])i.next()))[0] instanceof Object[];
			if (((Object[])elementI)[0]==element) return true;
		}
		return false;
	}
	
	public static void addInstance(Collection collection,Object element){
		
			Collection c = new ArrayList();
			Iterator i = collection.iterator();
			while (i.hasNext()){
				Object elementP=((Object[])i.next()