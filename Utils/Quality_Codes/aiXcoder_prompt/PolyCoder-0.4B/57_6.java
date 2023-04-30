import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
			StringBuilder sb = new StringBuilder();
			if (System.currentTimeMillis()-startTime>10000)
			{
				sb.append(path2).append(" ");
				sb.append(path1).append(" ");
			}
			return sb.toString();
	}
	
	
	//Returns element in path according to last separator position
	//\t1. if pos is " " ，return ""; else 
	//\t2. if pos is not " " ，return last element of that.
	//\t3
}