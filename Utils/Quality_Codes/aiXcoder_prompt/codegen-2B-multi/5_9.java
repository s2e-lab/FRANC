import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		 if (a>b)
			if (a>c)
				return a;
			else return c;
		else
			if (b>c)
				return b;
			else
				return c;
	}
	
	/**
	* max() that works on three integers
	*/
	public static int max(int a, int b, int c) {
		 if (a>b)
			if (a>c)
				return a;
			else return c;
}
}