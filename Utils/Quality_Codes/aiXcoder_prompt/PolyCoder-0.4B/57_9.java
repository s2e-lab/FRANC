import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
			//check if path separator already present at the end of first path element
			if (path1.equals(path2)){
			return path1;
			}
			
			//remove first separator from path
			path1 = path1.substring(1);
			return path1;
	}
	
	/**
	* Return an URL-encoded path.
	*/
	public static String getCanonicalPath(String path){
		if (path.indexOf('/')==1)path = ""+path;
		return path;
	}
}