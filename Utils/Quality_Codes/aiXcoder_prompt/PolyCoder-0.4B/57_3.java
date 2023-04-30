import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
			String separator = null;
			for (int i = 0; i < path1.length(); i++){
					if((path2!= null) && path1.charAt(i)!= PathElement.SEPARATOR){
							separator = path1.substring(i);
					}
					if((separator == null) || separator.equals(path2)){
						// If path has just separator
						return path1.substring(i);
					}
				}
		return path2;
	}
}