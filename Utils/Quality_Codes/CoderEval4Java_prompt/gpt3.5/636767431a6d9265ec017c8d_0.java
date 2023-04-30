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
int power = 1;
while (power <= n) {
    power *= 2;
    log++;
}
return log;
}

/**
* Computes transitive closure of a directed graph.
* @param adjMatrix the adjacency matrix of the graph.
* @param n the number of vertices in the graph.
* @return the transitive closure of the graph.
*/

public int[][] transitiveClosure(int[][] adjMatrix, int n) {
    int log = computeBinaryLog(n);
    int[][] transitiveClosure = new int[n][n];

    // initialize transitive closure to the adjacency matrix
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            transitiveClosure[i][j] = adjMatrix[i][j];
        }
    }

    // compute transitive closure using Warshall's algorithm
    for (int k = 0; k < log; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transitiveClosure[i][j] |= transitiveClosure[i][k] & transitiveClosure[k][j];
            }
        }
    }
    return transitiveClosure;
}
}