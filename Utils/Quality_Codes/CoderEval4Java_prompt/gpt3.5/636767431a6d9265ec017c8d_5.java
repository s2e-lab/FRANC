import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TransitiveClosure{
	/** 
	 * Computes floor($\log_2 (n)$) $+ 1$
	 */
	
	private int computeBinaryLog(int n){
			int log = 0;
while (n > 1) {
    n >>= 1;
    log++;
}
return log + 1;
}

/**
 * Computes the transitive closure of a given adjacency matrix using
 * Warshall's algorithm.
 * 
 * @param mat The adjacency matrix
 * @param n The size of the adjacency matrix (assumed to be square)
 * @return The transitive closure of the adjacency matrix
 */
public boolean[][] computeTransitiveClosure(boolean[][] mat, int n){
	boolean[][] tc = new boolean[n][n];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
	        tc[i][j] = mat[i][j];
	    }
	}

	for (int k = 0; k < n; k++) {
	    for (int i = 0; i < n; i++) {
	        if (tc[i][k]) {
	            for (int j = 0; j < n; j++) {
	                tc[i][j] = tc[i][j] || tc[k][j];
	            }
	        }
	    }
	}

	return tc;
}}