import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		return a>b? a>c? a : c : b>c? b : c;
	}


	/**
	* min() that works on three integers
	*/
	public static float min(float a, float b, float c) {
		return a<b? a<c? a : c : b<c? b : c;
	}

}