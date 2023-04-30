import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
			char[] ch = str.toCharArray();
			int count = ch.length >> 2;
			char[] code = new char[(count+1)*2];
			int k = 0;
			code[k++] = 'C'; code[k++] = 'D';
			for(int i=0; i<count; i++){	// 第i位填充1，每行只填充一个
				code[k++] = ch[i];
			}	
			
			// 去填充0
}
}