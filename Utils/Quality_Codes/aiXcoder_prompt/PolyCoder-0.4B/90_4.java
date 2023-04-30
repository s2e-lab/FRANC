import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if ( map == null){map=new HashMap<String, HashSet<Integer>>();}
			if ( map.containsKey(key) ){return;}
			boolean isExists=true;
			for (String key2 : map.keySet()){
				if ( key2!= null && map.containsKey(key2) ){
					if ( value.equals(map.get(key2))){isExists=false;break;}
				}
			}
			if (isExists){return;}
			addToSet(map, key, value);
		
}
}