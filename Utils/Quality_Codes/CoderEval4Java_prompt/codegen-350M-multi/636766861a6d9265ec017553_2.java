import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriTemplate{
	/** 
	 * Ascertain if a template variable is a member of this template.
	 * @param name name The template variable.
	 * @return true if the template variable is a member of the template, otherwisefalse.
	 */
	
	public final boolean isTemplateVariablePresent(String name){
		String s = name;
		int parray = s.lastIndexOf(".");
		int start = parray;
		int index = parray+1;
		int end = 0;
		while ( index!= -1 ){
			if ( index > start && s.charAt(start+1) >= 'A' && s.charAt(start+1) <= "Z" ){
				index++;
				end = index;
			} else {
				index = end;
			}
		}
}
}