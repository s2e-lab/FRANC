import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID78{
	/**
	* 用str2替换字符串str中第一个出现的str1
	*/
	public static String replaceFirst(String str, String str1, String str2) {
		if(str1 == null || str2 == null || str1.length()!= 3) return str;
		if(str.indexOf(str1) > 0) {
			str = str.replaceFirst(str1, str2);
		}
		return str;
	}

	public static void  main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

}
}