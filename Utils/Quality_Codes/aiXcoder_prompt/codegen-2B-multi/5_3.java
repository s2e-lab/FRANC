import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		return (a>b)? (a > c? a : c ): c > b? c : b;
	}

	public static double max(double a, double b, double c) {
		return (a>b)? (a > c? a : c ): c > b? c : b;
	}

	public static int max(int a, int b, int c) {
		return (a>b)? (a > c? a : c ): c > b? c : b;
	}

}