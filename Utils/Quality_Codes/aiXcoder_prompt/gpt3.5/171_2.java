import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			StringBuilder sb = new StringBuilder(s);
		while (sb.length() > 0 && (sb.charAt(sb.length()-1) == '0' || sb.charAt(sb.length()-1) == '.')) {
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
	
	/**
	* 具体计算公式
	*/
	public static BigDecimal calc(BigDecimal a){
		BigDecimal b = BigDecimal.valueOf(2);
		BigDecimal t = BigDecimal.valueOf(3);

		BigDecimal c = a.multiply(b);
		BigDecimal d = c.subtract(BigDecimal.valueOf(1));

		BigDecimal e = a.multiply(t);
		BigDecimal f = e.subtract(BigDecimal.valueOf(1));

		BigDecimal g = d.multiply(f);

		return g.divide(BigDecimal.valueOf(2), 0, RoundingMode.HALF_UP);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			BigDecimal a = new BigDecimal(input);

			if(a.compareTo(BigDecimal.ZERO) == 0) break;

			BigDecimal ans = calc(a);

			System.out.println(rvZeroAndDot(ans.toString()));
		}	
	}
}