import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
			if (path1==null)
			 	throw new NullPointerException("path1 is null!");
			if (path2==null)
			 	throw new NullPointerException("path2 is null!");
			if ((path1.length()==0)||(path2.length()==0))
			 	return null;
			if(path1.length()<path2.length())
			 	return null;
			if (path2.length()==0)
			 	return path1;
			return path1+path2;
		}

}