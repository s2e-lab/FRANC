import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		for (String s : searchStrArray){
			if (str.toLowerCase().contains(s.toLowerCase())){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input string : ");
		String str = sc.nextLine();
		System.out.println(str);
}
}