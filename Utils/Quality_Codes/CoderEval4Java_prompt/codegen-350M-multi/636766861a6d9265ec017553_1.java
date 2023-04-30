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
		return this.variable.getTemplateList().containsKey(name);
	}
	
	/** 
	 * Initialise this template by defining its variable template. 
	 * @param name The variable name.
	 * @param definition The definition of the template variable. 
	 */
	
	public final void initialize(String name,String definition){
		this.variable = new Variable(null, name);
		
}
}