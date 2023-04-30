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
		Boolean found=null;
		
		for(Iterator i=variables.iterator();i.hasNext();){
			String variable= (String)(i.next());
			if(name.equals(variable)) found=true;
		}
		
		return(found);
	}
	
	/** The content of the template. */
	private List<String> variables = new ArrayList<String>();
	/** Whether or not all the parameters are included in the text of this template. */
	private boolean isInclusionAll = false;
}