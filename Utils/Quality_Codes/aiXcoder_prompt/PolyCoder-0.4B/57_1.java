import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
		 if(path1 == null || path2 == null){
				return "";
			}
			
			StringBuilder sb = new StringBuilder(StringUtils.substring(path1,0,path2.length()-1));
}
}