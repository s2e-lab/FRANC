import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		StringBuilder sb = new StringBuilder();
		String str = s.trim();
		boolean lastIsPlus = false;
		for(int i = 0;i < str.length();i++){
			char c=str.charAt(i);
			if(Character.isDigit(c)){
				if(lastIsPlus){
					sb.append(c);
					i++;
				}
				continue;
			}
			sb.append(c);
			lastIsPlus = Character.isPlusSign(c);
		}

}
}