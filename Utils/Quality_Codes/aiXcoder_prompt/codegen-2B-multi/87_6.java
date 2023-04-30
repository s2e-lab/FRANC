import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID87{
	/**
	* Returns true if the given object is an instance of the class or interface specified.
	*/
	public static boolean isInstanceOf(Object object, Class<?> type){
		return type.isAssignableFrom(object.getClass());
	}


	public static void main(String[] args) throws DifferentDayException{
		int day, hour, min;
		BigInteger[] a, b;

		Scanner sc = new Scanner(System.in);

		day = sc.nextInt();
		hour = sc.nextInt();
		min = sc.nextInt();

		a = new BigInteger[day];
		b = new BigInteger[day];

}
}