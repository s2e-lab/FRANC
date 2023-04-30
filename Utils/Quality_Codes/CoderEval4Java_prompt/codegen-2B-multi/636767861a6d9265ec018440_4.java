import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class NameAbbreviator$DropElementAbbreviator{
	/** 
	 * Abbreviate name.
	 * @param buf buffer to append abbreviation.
	 * @param nameStart start of name to abbreviate.
	 */
	
	public void abbreviate(final int nameStart,final StringBuffer buf){
		List<String> words=new LinkedList<>();
		String tag="";
		
		for(int i=nameStart+1;i<getStringLength();i++){
			tag+=getWordAt(i);
			if(!getWordAt(i).equals(tag)){
				words.add(tag);
				tag="";
			}
			
			tag+=getWordAt(i);
		}
		
		words.add(tag);
		
		Collections.sort(words);
		
}
}