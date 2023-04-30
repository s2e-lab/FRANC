import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringEscapeUtils{
	/** 
	 * <p>Unescapes any Java literals found in the <code>String</code>. For example, it will turn a sequence of <code>'\'</code> and <code>'n'</code> into a newline character, unless the <code>'\'</code> is preceded by another <code>'\'</code>.</p>
	 * @param str the <code>String</code> to unescape, may be null
	 * @return a new unescaped <code>String</code>, <code>null</code> if null string input
	 */
	
	public static String unescapeJava(String str) throws Exception {
			if(str==null || str.length()<1) {
				return str;
			}
			StringBuffer buf=new StringBuffer(str.length());
			char ch;
			int index;
			buf.append("'");
}
}