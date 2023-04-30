import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for ( int i = 0 ; i < arrayA.length ; i++ ){
			for ( int j = 0 ; j < arrayB.length ; j++ ){
				if ( (i==0 && j==0) || ( i==arrayA.length-1 && j==arrayB.length-1) || (i==arrayA.length && j==arrayB.length+1) ){
					arrayA[i] += arrayB[j];
				} else {
					arrayA[i] += list(arrayA, arrayB[j]);
