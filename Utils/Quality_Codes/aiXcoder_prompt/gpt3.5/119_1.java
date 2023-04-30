import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String.format("%.2f", val);
	    }
	    
	/**
	* 主函数
	*/
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] inputArr = input.split("\\s+");
		
		//输入持有天数
		int n = Integer.parseInt(inputArr[0]);
		
		//输入支出数
		int m = Integer.parseInt(inputArr[1]);
		
		//初始化总支出
		double totalExpense = 0.0;
		
		//初始化最高日支出数组
		double[] maxDailyExpense = new double[n];
		
		//循环读入支出数据
		for(int i=0;i<m;i++){
			String expenseInput = br.readLine();
			String[] expenseArr = expenseInput.split("\\s+");
			
			//支出日期
			int expenseDate = Integer.parseInt(expenseArr[0]);
			
			//支出金额
			double expenseAmount = Double.parseDouble(expenseArr[1]);
			
			//更新总支出
			totalExpense += expenseAmount;
			
			//更新最高日支出数组
			if(expenseAmount > maxDailyExpense[expenseDate-1]){
				maxDailyExpense[expenseDate-1] = expenseAmount;
			}
		}
		
		//计算平均日支出
		double avgDailyExpense = totalExpense / n;
		
		//计算最高日支出
		double maxDailyExpenseAmount = 0.0;
		for(int i=0;i<n;i++){
			if(maxDailyExpense[i] > maxDailyExpenseAmount){
				maxDailyExpenseAmount = maxDailyExpense[i];
			}
		}
		
		//格式化输出平均日支出和最高日支出
		System.out.println(formatDouble(avgDailyExpense) + " " + formatDouble(maxDailyExpenseAmount));
		
	}
	
}