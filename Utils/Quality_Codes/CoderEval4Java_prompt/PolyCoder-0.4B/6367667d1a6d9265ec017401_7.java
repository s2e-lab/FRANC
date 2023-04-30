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
			if (str == null) {
				throw new IllegalArgumentException("The input string may not be null");
			} else if (str.length() == 0) {
				return str;
			}
			int len;
			StringBuffer strBuf = new StringBuffer(str.length());
			StringBuffer strBuf2 = new StringBuffer(str.length());
			int strLen = str.length();
			boolean doubleQuote = true;
			
			// double backslash escapes
}
}