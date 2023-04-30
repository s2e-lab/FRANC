import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val) - 1;
}

public static void main(String[] args) throws Exception{
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer ST = new StringTokenizer(BR.readLine());

    int a = Integer.parseInt(ST.nextToken());
    int b = Integer.parseInt(ST.nextToken());

    if(a == b){
        System.out.println(a + ".00");
        return;
    }

    double x1 = ((1 + Math.sqrt(5))/2) * a;
    double x2 = ((1 + Math.sqrt(5))/2) * b;

    double ans = (x1 - x2)/(Math.sqrt(5));
    double roundAns = Math.round(ans*100)/100.0;
    int floorAns = floor(ans);

    if(roundAns == Math.floor(ans) && floorAns%2 == 0){
        System.out.printf("%.2f\n", ans);
    } else {
        System.out.printf("%.2f\n",Math.abs(floorAns + 1 - ans) < Math.abs(floorAns - ans) ? floorAns + 1 : floorAns);
    }
}
}