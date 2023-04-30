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
		
		if( name.equals("TMP_NAME") || name.equals("TMP2_NAME") || name.equals("TMP_MEMB")){
			System.out.println(name);
			return true;
		} else return false;
	}
}