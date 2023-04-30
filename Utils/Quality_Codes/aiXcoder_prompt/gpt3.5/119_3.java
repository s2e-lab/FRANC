import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String formattedVal = String.format("%.2f", val);
    return formattedVal;
}

/**
 * 计算两点之间的距离
 */
public static double distance(int x1, int y1, int x2, int y2){
    int dx = x2 - x1;
    int dy = y2 - y1;
    double distance = Math.sqrt(dx*dx + dy*dy);
    return distance;
}

/**
 * 主函数
 */
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 读入点的数量
    int[][] points = new int[n][2]; // 存储点的横坐标和纵坐标
    double totalDistance = 0; // 存储总距离
    for (int i = 0; i < n; i++){
        points[i][0] = sc.nextInt(); // 读入横坐标
        points[i][1] = sc.nextInt(); // 读入纵坐标
        if (i > 0){
            // 计算当前点与前一个点之间的距离
            double distance = distance(points[i-1][0], points[i-1][1], points[i][0], points[i][1]);
            totalDistance += distance; // 累加总距离
        }
    }
    
    // 计算第一个点和最后一个点之间的距离
    double distance = distance(points[0][0], points[0][1], points[n-1][0], points[n-1][1]);
    totalDistance += distance; // 累加总距离
    
    // 输出结果
    String formattedDistance = formatDouble(totalDistance);
    System.out.println(formattedDistance);
}
}