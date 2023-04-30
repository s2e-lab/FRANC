import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			// TODO Auto-generated method stub
			if( mapObj==null ){
				return;
			}
			Map<Integer, String> temp=mapObj.clone();
			if( mapObj.get(key)!=null ){
				temp.remove( mapObj.get( key ) ) ;
					// TODO Auto-generated method stub
				temp.remove( mapObj.get( key ) );
			}
	}
}