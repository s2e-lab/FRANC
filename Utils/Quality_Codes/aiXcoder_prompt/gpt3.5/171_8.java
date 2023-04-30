import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			if(s.indexOf('.') > 0){
			s = s.replaceAll("0+?$", ""); //去掉多余的0
			s = s.replaceAll("[.]$", ""); //如最后一位是.则去掉
	}
	return s;
}

	/**
	* 计算卡尔曼滤波器的结果
	*/
	public static void calculateKalmanFilter(float[][] arr){
		for(int i=0; i<arr.length; i++){
			double q = 0.01; //Q
			double r = 10; //R
			double p = 1; //P
			double x = 0; //X

			for(int j=0; j<arr[i].length; j++){
				//Predict
				p = p + q;

				//Update
				double k = p / (p + r);
				x = x + k * (arr[i][j] - x);
				p = (1 - k) * p;

				arr[i][j] = (float) x;
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //读入矩阵的行数
		int m = sc.nextInt(); //读入矩阵的列数

		float[][] matrix = new float[n][m]; //存储输入的矩阵

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				matrix[i][j] = sc.nextFloat();
			}
		}

		calculateKalmanFilter(matrix); //使用卡尔曼滤波器进行平滑处理

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				String s = String.valueOf(matrix[i][j]); //将结果转换为字符串并去除多余的小数
				s = rvZeroAndDot(s);
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}