import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
		 
	  for(int anInt:collection){
	    set.add(anInt);	  	
	  }
	}
	
	
	public static void main(String[] strArgs) throws IOException, ClassNotFoundException{
		
		Random rnd = new Random();
	    long seed=System.currentTimeMillis();
	    //Create a new File
	    String inDir = "in_d";  
	    String outDir = "out_d";
	    String inputFile = "d"+rnd.nextInt();
}
}