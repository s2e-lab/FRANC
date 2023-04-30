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
		if(result.indexOf(".") > 0){
			//去掉末尾的0
			result = result.replaceAll("0+?$", "");
			//去掉小数点
			result = result.replaceAll("[.]$", "");
		}
		return result;
	}

	/**
	* 计算每个数字出现的次数
	*/
	public static Map<Character, Integer> countDigits(String s){
		Map<Character, Integer> countMap = new TreeMap<>(); //使用TreeMap可以保证按照字典序输出
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c >= '0' && c <= '9'){
				Integer count = countMap.get(c);
				countMap.put(c, count == null ? 1 : count + 1);
			}
		}
		return countMap; 
	}

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String s = scanner.next();

			//计算结果
			BigDecimal bd = new BigDecimal(s);
			bd = bd.multiply(new BigDecimal("10")).setScale(0, RoundingMode.DOWN);
			int n = bd.intValue();
			s = "" + n;

			Map<Character, Integer> countMap = countDigits(s);
			for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
