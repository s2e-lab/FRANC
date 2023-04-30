import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TransitiveClosure{
	/** 
	 * Computes floor($\log_2 (n)$) $+ 1$
	 */
	
	private int computeBinaryLog(int n){
			int bits = 0;
while(n > 0){
    bits++;
    n = n >> 1;
}
return bits;
}

/**
 * Computes the transitive closure matrix
 * @param g The input graph (in adjacency matrix representation)
 * @return The transitive closure matrix
 */
public boolean[][] transitiveClosure(boolean[][] g){
    int n = g.length;
    boolean[][] tc = new boolean[n][n];

    // Initialize transitive closure matrix with input graph
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            tc[i][j] = g[i][j];
        }
    }

    // Use bit manipulation to compute transitive closure
    for(int k=0; k<computeBinaryLog(n); k++){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tc[i][j] = tc[i][j] || (tc[i][k] && tc[k][j]);
            }
        }
    }

    return tc;
}

public static void main(String[] args){
    // Input adjacency matrix
    boolean[][] g = {{false, true, false, false},
                     {false, false, true, false},
                     {true, false, false, false},
                     {true, true, true, false}};

    TransitiveClosure tc = new TransitiveClosure();

    // Compute transitive closure matrix
    boolean[][] result = tc.transitiveClosure(g);

    // Print result
    for(int i=0; i<result.length; i++){
        for(int j=0; j<result.length; j++){
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
}