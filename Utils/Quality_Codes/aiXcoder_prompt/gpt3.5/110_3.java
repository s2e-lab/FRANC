import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			float result = 0;
try {
    result = Float.parseFloat(floatStr);
} catch (NumberFormatException e) {
    e.printStackTrace();
}
return result;
}
	
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	float cost, rate, percentage;

	System.out.println("Enter the cost of the item:");
	String costStr = sc.next();
	cost = parseFloat(costStr);

	System.out.println("Enter the rate of tax (in percentage) applicable:");
	String rateStr = sc.next();
	rate = parseFloat(rateStr);

	percentage = (cost * rate) / 100;
	float totalCost = cost + percentage;
	System.out.println("The total cost of the item is: "+ totalCost);
  }
}