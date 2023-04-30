import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map==null){
				if(System.getProperty("minitask")!= null){System.out.println("MINITASK: Map missing?");}
				System.out.println("WARNING: " + map);

			} else
			{
				HashSet<Integer> set = map.get(key);
				if(set==null){set=new HashSet<Integer>(); map.put(key, set);} 
				else{
					if((int)((System.currentTimeMillis()/1000)%100)==0){System.out.println