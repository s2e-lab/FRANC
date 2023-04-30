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
		while (n >> 1 > 0) {
			log++;
			n >>= 1;
		}
		return log + 1;
	}

	/** 
	 * Computes the transitive closure of a directed graph represented as an adjacency matrix using the Floyd Warshall Algorithm
	 * 
	 * @param graph The graph represented as an adjacency matrix
	 * @return The transitive closure of the graph
	 */

	public int[][] computeTransitiveClosure(int[][] graph){
		int n = graph.length;
		
		// Initialize the result matrix as the adjacency matrix of the input graph
		int[][] result = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				result[i][j] = graph[i][j];
			}
		}

		// Compute the transitive closure using Floyd Warshall Algorithm
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					result[i][j] = result[i][j] | (result[i][k] & result[k][j]);
				}
			}
		}

		return result;
	}
}
