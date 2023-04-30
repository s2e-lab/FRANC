import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		return (a > b)? 
			((a>c)? a : c): 
			((a<c)? a : c);		
	}
	
	/**
	* max() that works on three integers but returns an int
	*/
	public static int max(int a, int b, int c) {
		return (a > b)? 
			((a>c)? a : c): 
			((a<c)? a : c);		
	}
	
}