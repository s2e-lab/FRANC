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
		while ((1 << log) <= n){
			log++;
		}
		return log;
	}

	/**
	 * Computes the transitive closure of a given directed graph using Floyd-Warshall algorithm
	 * @param graph the adjacency matrix representation of the graph
	 * @return a boolean matrix representing the transitive closure of the graph
	 */
	
	public boolean[][] computeTransitiveClosure(int[][] graph){
		int n = graph.length;
		boolean[][] tc = new boolean[n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				tc[i][j] = (graph[i][j] != 0);
			}
		}
		for (int k = 0; k < n; k++){
			for (int i = 0; i < n; i++){
				for (int j = 0; j < n; j++){
					tc[i][j] = (tc[i][j] || (tc[i][k] && tc[k][j]));
				}
			}
		}
		return tc;
	}
}
