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
		if (name.charAt(0) == '$' && name.length() >= 3) {
			// Check if value matches the template variable.
			for (int i=1; i<name.length(); ++i) {
				if (!(name.charAt(i-1) == '$') &&!(name.charAt(i)=='$')
						&& name.charAt(i)!= '<' && name.charAt(i)!= '{') {
					return true;
				}
			}
		}
			

}
}