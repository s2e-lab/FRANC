import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID57{
	/**
	* Join 2 path elements if path separator not present at the end of first path element，else return the first element.
	*/
	public static String joinPath(String path1, String path2){
			if(path1==null || path2==null || path1.isEmpty()||path2.isEmpty()){
					return "";
			}
			
			if(path1.endsWith("/")){
					return path2+"/"+path1;
			}
			
			if(path2.endsWith("/")){
					return path1+"/"+path2;
			}
			
			if(path1.charAt(0)==sep){
					return path2 + path1;
			}
			
}
}