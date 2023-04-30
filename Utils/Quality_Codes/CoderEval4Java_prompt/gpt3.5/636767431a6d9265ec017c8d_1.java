import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TransitiveClosure{
	/** 
	 * Computes floor($\log_2 (n)$) $+ 1$
	 */
	
	private int computeBinaryLog(int n){
			int result = 0;
		while (n > 1) {
			n >>= 1; // equivalent to n /= 2, but faster
			result++;
		}
		return result + 1;
	}

	/**
	 * Computes the transitive closure of a given directed graph represented by its adjacency matrix.
	 * Uses the Floyd-Warshall algorithm.
	 * @param graph the adjacency matrix representing the directed graph
	 * @return the transitive closure matrix of the graph
	 */
	public boolean[][] transitiveClosure(boolean[][] graph){
		int n = graph.length;

		// Create copy of graph to modify
		boolean[][] closure = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				closure[i][j] = graph[i][j];
			}
		}

		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				if (closure[i][k]) {
					for(int j = 0; j < n; j++) {
						closure[i][j] = closure[i][j] || closure[k][j];
					}
				}
			}
		}

		return closure;
	}

	// Example usage
	public static void main(String[] args){
		boolean[][] graph = {
			{false, true, false, false},
			{false, false, true, true},
			{false, false, false, true},
			{true, false, false, false}
		};

		TransitiveClosure tc = new TransitiveClosure();
		boolean[][] closure = tc.transitiveClosure(graph);

		System.out.println("Graph: ");
		tc.printMatrix(graph);

		System.out.println("Transitive Closure: ");
		tc.printMatrix(closure);
	}

	private void printMatrix(boolean[][] matrix){
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}