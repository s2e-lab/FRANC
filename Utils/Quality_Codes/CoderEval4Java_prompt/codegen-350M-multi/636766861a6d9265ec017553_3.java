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
		// If the variable is not found, return false
		if(vars.hasKey(name)){return true;}
		// Otherwise, return false.
		return false;
	}
	/** 
	 * Get the template variable from the template class by the variable name.
	 * @param string Name of the template variable.
	 * @return String variable name
	 */
	
	public final String getTemplateVariable(String string){
}
}