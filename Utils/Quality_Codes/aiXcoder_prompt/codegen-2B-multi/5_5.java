import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID5{
	/**
	* max() that works on three integers
	*/
	public static float max(float a, float b, float c) {
		if (a > b && a > c)
			return a;

		if (b > a && b > c)
			return b;

		else
			return c;
	}

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(new File("ID5.in"));
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
}
}