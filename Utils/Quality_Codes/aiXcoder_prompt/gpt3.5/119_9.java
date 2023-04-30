import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
		return decimalFormat.format(val);
	}

	/**
	* 计算每个学生的平均成绩
	*/
	public static double[] average(double[][] scores){
		int students = scores.length;
		double[] averages = new double[students];

		for(int i=0; i<students; i++){
			double sum = 0;
			for(int j=0; j<scores[i].length; j++){
				sum += scores[i][j];
			}
			averages[i] = sum / scores[i].length;
		}

		return averages;
	}

	/**
	* 计算每门课程的平均成绩
	*/
	public static double[] subjectAverage(double[][] scores){
		int subjects = scores[0].length;
		double[] averages = new double[subjects];

		for(int i=0; i<subjects; i++){
			double sum = 0;
			for(int j=0; j<scores.length; j++){
				sum += scores[j][i];
			}
			averages[i] = sum / scores.length;
		}

		return averages;
	}

	/**
	* 计算所有成绩的平均分
	*/
	public static double allAverage(double[][] scores){
		double sum = 0;
		int count = 0;

		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				sum += scores[i][j];
				count++;
			}
		}

		return sum / count;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数");
		int students = scan.nextInt();
		System.out.println("请输入课程数");
		int subjects = scan.nextInt();

		double[][] scores = new double[students][subjects];

		// 输入每个学生每门课程的成绩
		for(int i=0; i<students; i++){
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
			for(int j=0; j<subjects; j++){
				scores[i][j] = scan.nextDouble();
			}
		}

		// 计算每个学生的平
}
}