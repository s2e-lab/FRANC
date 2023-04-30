import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if (o1 == null || o2 == null)  return o1 == o2;
		return o1.equals(o2);
	}

	private final static Random rnd = new Random(50);
	
	private int[] d;
	private int n;
	private int l;
	private int r;

	public ID95(){
		d = new int [0];
	}

	private void init(int n){
		d = new int [n];
		r = 1;
	}

}