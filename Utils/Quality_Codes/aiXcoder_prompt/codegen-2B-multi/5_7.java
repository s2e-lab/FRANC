import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		return max(a, max(b, c));
	}
	public static float max(float a, float b, float c, float d) {
		return  max(max(a,b,c),d);
	}
}


