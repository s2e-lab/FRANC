import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			DecimalFormat df = new DecimalFormat("#.##");
		return df.format(val);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int n = Integer.parseInt(line);
		double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
		for(int i = 0; i < n; i++){
			line = reader.readLine();
			String[] tokens = line.split("\\s+");
			double val = Double.parseDouble(tokens[1]);
			sum += val;
			max = Math.max(max, val);
			min = Math.min(min, val);
		}

		double avg = sum / n;
		double differMax = Double.MIN_VALUE, differMin = Double.MAX_VALUE;
		for(int i = 0; i < n; i++){
			line = reader.readLine();
			String[] tokens = line.split("\\s+");
			double val = Double.parseDouble(tokens[1]);

			differMax = Math.max(differMax, Math.abs(val - max));
			differMin = Math.min(differMin, Math.abs(val - min));
		}

		System.out.println(formatDouble(avg));
		System.out.println(formatDouble(differMax));
		System.out.println(formatDouble(differMin));
	}
}