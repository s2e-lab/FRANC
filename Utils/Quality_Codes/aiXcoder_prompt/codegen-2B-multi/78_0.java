import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		if (str!= null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c!= str1.charAt(0))
					sb.append(c);
				else {
					sb.append(str2);
					if (i < str.length() - 1) {
						sb.append(str.charAt(i + 1));
					}
				}
			}
		}
}
}