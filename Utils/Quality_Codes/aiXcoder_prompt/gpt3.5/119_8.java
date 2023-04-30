import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			// Implementing the DecimalFormat class to format the double value with two decimal places
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(val);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of test cases
		
		while(n-- > 0){
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();

			// calculating the cost per kg of rice
			double riceCost = (c + a) / (double)m;
			
			// checking if the ration is possible or not
			if(riceCost > e){
				System.out.println("No");
				continue;
			}
			
			// calculating the total cost of the ration
			double totalCost = (b + d) / (double)m + riceCost;
			
			// checking if the total cost is less than or equal to the budget
			if(totalCost <= e){
				System.out.println("Yes");
				continue;
			}
			
			System.out.println("No");
		}
	}
}