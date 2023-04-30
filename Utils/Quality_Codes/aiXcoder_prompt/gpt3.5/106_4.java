import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			int index = 0;
		int[][] matrix = new int[height][width];
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				matrix[i][j] = m[index++];
			}
		}
		return matrix;
	}

    /**
    * 主函数
    */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0; i<n; i++){
            A[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            B[i] = in.nextInt();
        }
        // 将一维数组A和B转为二维数组
        int[][] matrixA = arrayToMatrix(A, n, n);
        int[][] matrixB = arrayToMatrix(B, n, n);
        // 矩阵相乘
        int[][] C = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<n; k++){
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                C[i][j] = sum;
            }
        }
        // 输出结果
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}