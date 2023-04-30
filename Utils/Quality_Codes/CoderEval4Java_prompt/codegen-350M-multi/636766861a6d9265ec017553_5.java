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
		int n = name.lastIndexOf("@");
		String substring = name.substring(0, n);
}
}