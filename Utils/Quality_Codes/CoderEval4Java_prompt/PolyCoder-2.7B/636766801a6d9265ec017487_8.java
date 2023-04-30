import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriComponent{
	/** 
	 * Encodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-encoded.
	 * @param s the string with zero or more template parameters names
	 * @return the string with encoded template parameters names.
	 */
	
	public static String encodeTemplateNames(String s){
		 StringBuffer result = new StringBuffer();
		 Template tmpl;
		 ArrayList args = new ArrayList();
		 for(String paramName : s.split(",")){
			 tmpl = new Template(paramName);
			 args.add(tmpl.getVar());
		 }
		 result.append(String.format("%s(%s)",
							PARAM_MARKER, paramsToCode(templateNames(args))));
		 
		return result.toString();
	}


	public static String[] paramsToCode(String[] params) {
}
}