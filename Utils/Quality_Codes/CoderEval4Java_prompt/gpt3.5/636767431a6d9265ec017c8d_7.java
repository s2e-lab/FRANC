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
int i = n; 
while (i > 0) {
    i = i >> 1;
    log++;
}
return log;
	}

	/**
 	 * Computes the transitive closure of a directed graph represented as an adjacency matrix
 	 * @param graph The adjacency matrix of the graph
 	 * @return The transitive closure of the graph
 	 */
 	
 	private boolean[][] transitiveClosure(boolean[][] graph){
 		int n = graph.length;
 		boolean[][] closure = new boolean[n][n];
 		for (int i = 0; i < n; i++){
 			for (int j = 0; j < n; j++){
 				closure[i][j] = graph[i][j];
 			}
 		}
 		
 		int logn = computeBinaryLog(n) + 1; // Compute the ceiling of log base 2 of n
 		
 		for (int i = 0; i < logn; i++){
 			boolean[][] newClosure = new boolean[n][n];
 			for (int j = 0; j < n; j++){
 				for (int k = 0; k < n; k++){
 					newClosure[j][k] = closure[j][k] || (closure[j][i] && closure[i][k]); // Compute the (i+1)-th power of the adjacency matrix
 				}
 			}
 			closure = newClosure;
 		}
 		
 		return closure;
 	}
 	
 	/**
 	 * Main method to test the transitive closure function
 	 */
 	
 	public static void main(String[] args){
 		boolean[][] graph = {{false, true, false, false},
 							 {false, false, true, false},
 							 {false, false, false, true},
 							 {true, false, false, false}};
 		
 		TransitiveClosure obj = new TransitiveClosure();
 		boolean[][] closure = obj.transitiveClosure(graph);
 		
 		System.out.println("Transitive closure of the graph:");
 		for (int i = 0; i < closure.length; i++){
 			for (int j = 0; j < closure.length; j++){
 				System.out.print(closure[i][j] + " ");
 			}
 			System.out.println();
 		}
 	}
}