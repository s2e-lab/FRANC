import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TransitiveClosure{
	/** 
	 * Computes floor($\log_2 (n)$) $+ 1$
	 */
	
	private int computeBinaryLog(int n){
			int log2 = 0;
while ((1 << log2) <= n) {
	log2++;
}
return log2;
}

/**
 * Computes the transitive closure of a directed graph using the Floyd-Warshall algorithm.
 * 
 * @param adjacencyMatrix the adjacency matrix of the graph
 * @return the transitive closure of the graph in the form of an adjacency matrix
 */
public boolean[][] computeTransitiveClosure(boolean[][] adjacencyMatrix) {
	int n = adjacencyMatrix.length;
	boolean[][] transitiveClosure = new boolean[n][n];
	for (int i = 0; i < n; i++) {
		transitiveClosure[i] = Arrays.copyOf(adjacencyMatrix[i], n);
	}
	
	for (int k = 0; k < n; k++) {
		for (int i = 0; i < n; i++) {
			if (transitiveClosure[i][k]) {
				for (int j = 0; j < n; j++) {
					transitiveClosure[i][j] |= transitiveClosure[k][j];
				}
			}
		}
	}
	
	return transitiveClosure;
}

/**
 * Main method for testing the TransitiveClosure class.
 */
public static void main(String[] args) {
	boolean[][] adjacencyMatrix = {
			{false, true, false, false},
			{false, false, true, false},
			{true, false, false, true},
			{false, false, false, false}
	};
	
	TransitiveClosure transitiveClosure = new TransitiveClosure();
	boolean[][] result = transitiveClosure.computeTransitiveClosure(adjacencyMatrix);
	
	System.out.println(Arrays.deepToString(result));
}
}