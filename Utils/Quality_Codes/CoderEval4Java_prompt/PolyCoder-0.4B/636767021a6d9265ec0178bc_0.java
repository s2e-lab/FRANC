import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Finds the first index within a String, handling <code>null</code>. This method uses  {@link String#indexOf(String)}. 
	 */
	
	public static int indexOf(String str,String searchStr){
			int startPos = 0;
			int endIndex = str.length();
			
			int idx;
			for( int index = 0; index < searchStr.length(); index++){
				if( str.charAt( index )!= searchStr.charAt( index )){
					if( str.charAt( index ) == match()){
						if (match( searchStr.substring( 0, index )))
							return index;
					}
					else
						break;	
				}
				else
					break;
			}

}
}