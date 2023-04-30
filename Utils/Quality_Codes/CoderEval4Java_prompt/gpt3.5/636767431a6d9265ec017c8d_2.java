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
    n = n / 2;
    log++;
}
return log + 1;
	}
	
	/**
	 * Computes the transitive closure of a graph represented by an adjacency matrix using Warshall's algorithm
	 * 
	 * @param adjMatrix : adjacency matrix of the graph
	 * @return the transitive closure of the graph
	 */
	
	public int[][] computeTransitiveClosure(int[][] adjMatrix){
		int n = adjMatrix.length;
		int[][] transClosure = new int[n][n];
		
		// Initialize the transitive closure to the adjacency matrix
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				transClosure[i][j] = adjMatrix[i][j];
			}
		}
		
		// Compute the transitive closure using Warshall's algorithm
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(transClosure[i][k] == 1 && transClosure[k][j] == 1){
						transClosure[i][j] = 1;
					}
				}
			}
		}
		
		return transClosure;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices in the graph:");
		int n = sc.nextInt();
		int[][] adjMatrix = new int[n][n];
		System.out.println("Enter the adjacency matrix of the graph:");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				adjMatrix[i][j] = sc.nextInt();
			}
		}
		TransitiveClosure transitiveClosure = new TransitiveClosure();
		int[][] transClosure = transitiveClosure.computeTransitiveClosure(adjMatrix);
		System.out.println("The transitive closure of the graph is:");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(transClosure[i][j]+" ");
			}
			System.out.println();
		}
	}
}