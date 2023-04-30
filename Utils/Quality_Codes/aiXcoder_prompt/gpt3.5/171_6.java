import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			String result = s;
if (s.indexOf('.') > 0) {
    result = s.replaceAll("0+?$", ""); //去掉末尾的0
    result = result.replaceAll("[.]$", ""); //如最后一位是.则去掉
}
return result;
}

/**
* 计算平均数
*/
public static double avg(double[] nums) {
    double sum = 0;
    for (double num : nums) {
        sum += num;
    }
    return sum / nums.length;
}

/**
* 主函数，读入数据，并调用上述两个函数进行处理
*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
        int n = sc.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextDouble();
        }
        double average = avg(nums);
        double maxDiff = 0;
        for (double num : nums) {
            maxDiff = Math.max(maxDiff, Math.abs(num - average)); //计算最大差值
        }
        System.out.println(rvZeroAndDot(String.format("%.2f", maxDiff))); //格式化输出
    }
}
}