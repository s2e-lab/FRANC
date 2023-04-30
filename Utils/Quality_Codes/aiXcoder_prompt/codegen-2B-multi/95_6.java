import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if( o1 == o2 ){
			return true;
		}else if(o1!= null && o2!= null){
			return o1.equals( o2 );
		}else{
			return false;
		}
	}
}

class Solution
{
public static void main(String[] args) {
	{
		System.out.println(new ID95().equals(null, "o3")); //true
	}
}
}
