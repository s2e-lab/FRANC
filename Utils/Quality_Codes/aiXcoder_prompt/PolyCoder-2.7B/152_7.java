import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
			String hash = "";
			for (int i=0;i<str.length();i++){
				char c = str.charAt(i);
				int a = (int)c;
				if (i%4==0){
					hash += (hash.length()>1?"=&":"=") + hex(a);
				}else{
					hash += (hash.length()>1?"=":"=") + dec(a);
				}

			}

			return hash;
	}

}