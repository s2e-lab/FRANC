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
while (n >> log > 0) {
    log++;
}
return log;
	}

	/**
	 * Computes the transitive closure of the given directed graph represented as an adjacency matrix.
	 * @param graph the adjacency matrix of the graph
	 * @return the transitive closure of the graph as an adjacency matrix
	 */
	public int[][] transitiveClosure(int[][] graph){
		int n = graph.length;
		
		// Compute binary logarithm of n
		int logn = computeBinaryLog(n);
		
		// Initialize the result matrix with the original graph
		int[][] result = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				result[i][j] = graph[i][j];
			}
		}
		
		// Compute transitive closure using matrix multiplication
		for(int k=0; k<logn; k++){
			int[][] temp = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					for(int l=0; l<n; l++){
						temp[i][j] = (temp[i][j] | (result[i][l] & result[l][j]));
					}
				}
			}
			result = temp;
		}
		return result;
	}
}
