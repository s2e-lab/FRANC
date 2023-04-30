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
		ObjectTemplate[] obj = null;
		try{
			obj = ((ObjectTemplate[]) templateVariables.get(name));
		}catch(NumberFormatException e){
			System.out.println(templateVariables.get(name));
			obj = null; //the variable is not present so we want to return null for consistency with in templates.
		}
		return (obj!= null)? true : false;				
	}
}


