import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if(array == null || other == null)
				return false;
			if(array.length != other.length)
				return false;
			for(int i = 0; i < array.length; i++){
				if(!Objects.equals(array[i], other[i]))
					return false;
			}
			return true;
	}
	
	/**
	* 计算数据的平均数
	*/
	public static double calculateAverage(int[] data){
		if(data.length == 0)
			return Double.NaN;
		int sum = 0;
		for(int i = 0; i < data.length; i++){
			sum += data[i];
		}
		return (double) sum / data.length;
	}
	
	/**
	* 计算数据的标准差
	*/
	public static double calculateStandardDeviation(int[] data){
		double average = calculateAverage(data);
		double sum = 0;
		for(int i = 0; i < data.length; i++){
			sum += Math.pow(data[i] - average, 2);
		}
		return Math.sqrt(sum / data.length);
	}
	
	/**
	* 读取数据
	*/
	public static int[] readData(String filename) throws IOException{
		Scanner scanner = new Scanner(new FileInputStream(filename));
		List<Integer> dataList = new ArrayList<>();
		while(scanner.hasNext()){
			dataList.add(scanner.nextInt());
		}
		scanner.close();
		int[] data = new int[dataList.size()];
		for(int i = 0; i < data.length; i++){
			data[i] = dataList.get(i);
		}
		return data;
	}
	
	
	public static void main(String[] args) throws IOException{
		int[] data = readData("data.txt");
		double average = calculateAverage(data);
		double standardDeviation = calculateStandardDeviation(data);
		System.out.println("The average of the data is " + average);
		System.out.println("The standard deviation of the data is " + standardDeviation);
	}
}