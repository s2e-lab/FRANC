import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			if(s.indexOf('.') > 0){
			//有小数点
			s = s.replaceAll("0+?$", "");//去掉后面无用的零
			s = s.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
		}
		return s;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			String s = scanner.nextLine();
			String[] sa = s.split(" ");
			
			BigDecimal a = new BigDecimal(sa[0]);
			BigDecimal b = new BigDecimal(sa[1]);
			BigDecimal c = new BigDecimal(sa[2]);
			
			BigDecimal delta = b.multiply(b).subtract(a.multiply(c).multiply(new BigDecimal(4)));
			if(delta.compareTo(BigDecimal.ZERO) < 0 ){
				//delta 小于0，两个实数解都不存在
				System.out.println("No real root");
			}else if(delta.compareTo(BigDecimal.ZERO) == 0){
				//delta 等于0，有且仅有一个实数解
				BigDecimal x = b.negate().divide(a.multiply(new BigDecimal(2)),5,RoundingMode.HALF_UP);
				System.out.println(rvZeroAndDot(x.toString()));
			}else{
				//delta 大于0，有两个实数解
				BigDecimal sqrtDelta = new BigDecimal(Math.sqrt(delta.doubleValue()));
				BigDecimal x1 = b.negate().add(sqrtDelta).divide(a.multiply(new BigDecimal(2)),5,RoundingMode.HALF_UP);
				BigDecimal x2 = b.negate().subtract(sqrtDelta).divide(a.multiply(new BigDecimal(2)),5,RoundingMode.HALF_UP);
				
				System.out.println(rvZeroAndDot(x1.toString()) + " " + rvZeroAndDot(x2.toString()));
			}
		}
	}
}