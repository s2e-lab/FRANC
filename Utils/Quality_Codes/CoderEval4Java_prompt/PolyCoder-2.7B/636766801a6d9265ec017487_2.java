import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriComponent{
	/** 
	 * Encodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-encoded.
	 * @param s the string with zero or more template parameters names
	 * @return the string with encoded template parameters names.
	 */
	
	public static String encodeTemplateNames(String s){
			if(s.length() > 0){
				StringBuffer sb = new StringBuffer();			
				boolean containsEscapeSequence = false;
				for(int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == '%'){
//						if(i > 0 && s.charAt(i - 1) == '{') {					
//							beyondEscapeSequence = true;
//						}
//						
//						if(uriEncoder.matchesSpecials(s.substring(i,i+2))){