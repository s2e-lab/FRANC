import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val)-1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputs = input.split(" ");
		double a = Double.parseDouble(inputs[0]);
		double b = Double.parseDouble(inputs[1]);
		double c = Double.parseDouble(inputs[2]);
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		if(delta < 0){
			System.out.println("No Solution");
		}else if(delta == 0){
			double result = (0-b)/(2*a);
			//计算出浮点数除法的余数（小数部分）
			double temp = result - (int)result;
			if(temp == 0){
				System.out.println((int)result);
			}else{
				System.out.println(String.format("%.2f", result));
			}
		}else{
			//将根的值存在集合中
			Set<Double> resultSet = new TreeSet<Double>();
			double result1 = (-b+Math.sqrt(delta))/(2*a);
			resultSet.add(result1);
			double result2 = (-b-Math.sqrt(delta))/(2*a);
			resultSet.add(result2);
			
			String resultStr = "";
			for(Double result : resultSet){
				double temp = result - (int)result;
				if(temp == 0){
					resultStr += (int)result + " ";
				}else{
					resultStr += String.format("%.2f", result) + " ";
				}
			}
			
			System.out.println(resultStr.trim());
		}
	}
}