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
		return this.getClass().getDeclaredField(name)!=null;
	}
	
	/** 
	 * Returns a list of instances of uriTemplate that are of the given name.
	 * @param name name The template variable.
	 * @return a list of instances of uriTemplate that are of the given name.
	 */
	public final List<uriTemplate> listByName(String name){
		List<uriTemplate> instances=new ArrayList<>();
		
}
}